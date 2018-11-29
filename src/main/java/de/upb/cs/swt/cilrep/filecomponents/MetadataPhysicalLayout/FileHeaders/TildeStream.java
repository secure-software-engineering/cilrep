package de.upb.cs.swt.cilrep.filecomponents.MetadataPhysicalLayout.FileHeaders;

import de.upb.cs.swt.cilrep.common.Constants;
import de.upb.cs.swt.cilrep.common.HelperFunctions;
import de.upb.cs.swt.cilrep.filecomponents.MetadataLogicalFormat.*;

import java.util.HashMap;
import java.util.Map;

public class TildeStream extends Stream {
    public static Integer HeapSizeString = 2;
    public static Integer HeapSizeGUID = 2;
    public static Integer HeapSizeBlob = 2;
    public static Integer HeapSizeParameters = 2;

    /* offset 0, size 4 */
    public Integer Reserved1 = 0x00000000;

    /* offset 4, size 1 */
    public Integer MajorVersion = 0x20;

    /* offset 5, size 1 */
    public Integer MinorVersion = 0x20;

    /* offset 6, size 1, bit vector */
    public Integer HeapSizes;

    /* offset 7, size 1 */
    public Integer Reserved2 = 0x20;

    /* offset 8, size 8, bit vector for present tables,
     * let n be the number of 1's in this bit vector */
    public long ValidBVForPresentTables;

    /* offset 16, size 8, bit vector for present tables */
    public long SortedBVForSortedTables;

    /* offset 24, size 4*n */
    public Map<Integer, Integer> tableIndexesAndRowNumbers;

    /* offset 24 + 4*n, size variable */
    public Map<Integer,LogicalFormatTable> tablesMap = null;

    public void populateData(byte[] _stream){
        Integer startIndex = this.streamHeader.StartingIndexInFile;
        this.Reserved1 = HelperFunctions.readNBytesIntoInt32(4, startIndex, _stream);
        this.MajorVersion = HelperFunctions.readNBytesIntoInt32(1, startIndex + 4, _stream);
        this.MinorVersion = HelperFunctions.readNBytesIntoInt32(1, startIndex + 5, _stream);
        this.HeapSizes = HelperFunctions.readNBytesIntoInt32(1, startIndex + 6, _stream);

        this.Reserved2 = HelperFunctions.readNBytesIntoInt32(1, startIndex + 7, _stream);

        this.ValidBVForPresentTables = HelperFunctions.readNBytesIntoLong(8, startIndex + 8, _stream);

        this.SortedBVForSortedTables = HelperFunctions.readNBytesIntoLong(8, startIndex + 16, _stream);

        int n = this.readRowNumbersForTables(this.ValidBVForPresentTables, startIndex + 24, _stream);

        this.decideHeapSizes();

        // fill table now
        this.fillTables(startIndex + 24 + (4 * n), _stream);
    }

    Integer readRowNumbersForTables(long _bitVector, Integer _startIndex, byte[] _stream){
        this.tableIndexesAndRowNumbers = new HashMap<>();
        int setBitsCounter = 0, counter = 0;
        while (_bitVector > 0){
            int bit = (int)(_bitVector & 1);
            if (bit > 0){
                this.tableIndexesAndRowNumbers.put(counter, HelperFunctions.readNBytesIntoInt32(4,
                        _startIndex + (4 * setBitsCounter), _stream));

                setBitsCounter += 1;
            }
            counter++;
            _bitVector >>= 1;
        }
        return setBitsCounter;
    }

    void decideHeapSizes(){
        if (HelperFunctions.checkIfCertainBitIsSet(this.HeapSizes, 0)){
            TildeStream.HeapSizeString = 4;
        }
        if (HelperFunctions.checkIfCertainBitIsSet(this.HeapSizes, 1)){
            TildeStream.HeapSizeGUID = 4;
        }
        if (HelperFunctions.checkIfCertainBitIsSet(this.HeapSizes, 2)){
            TildeStream.HeapSizeBlob = 4;
        }
    }

    void fillTables(Integer _startIndex, byte[] _stream){
        tablesMap = new HashMap<>();

        int individualTableStartIndex = _startIndex;

        if (tableIndexesAndRowNumbers.containsKey(Constants.TableIndexes.MODULETABLE)){
            ModuleTable moduleTable = new ModuleTable();
            Integer moduleTableSize = moduleTable.lengthOfARowInBytes
                    * tableIndexesAndRowNumbers.get(Constants.TableIndexes.MODULETABLE);

            tablesMap.put(Constants.TableIndexes.MODULETABLE, moduleTable);
            _startIndex += moduleTableSize;
        }

        if (tableIndexesAndRowNumbers.containsKey(Constants.TableIndexes.TYPEREFTABLE)){
            TypeRefTable typeRefTable = new TypeRefTable();
            Integer typeRefTableSize = typeRefTable.lengthOfARowInBytes
                    * tableIndexesAndRowNumbers.get(Constants.TableIndexes.TYPEREFTABLE);

            tablesMap.put(Constants.TableIndexes.TYPEREFTABLE, typeRefTable);
            _startIndex += typeRefTableSize;
        }

        if (tableIndexesAndRowNumbers.containsKey(Constants.TableIndexes.TYPEDEFTABLE)){
            TypeDefTable typeDefTable = new TypeDefTable();
            Integer typeDefTableSize = typeDefTable.lengthOfARowInBytes
                    * tableIndexesAndRowNumbers.get(Constants.TableIndexes.TYPEDEFTABLE);

            tablesMap.put(Constants.TableIndexes.TYPEDEFTABLE, typeDefTable);

            _startIndex += typeDefTableSize;
        }

        if (tableIndexesAndRowNumbers.containsKey(Constants.TableIndexes.FIELDTABLE)){
            FieldTable fieldTable = new FieldTable();
            Integer fieldTableSize = fieldTable.lengthOfARowInBytes
                    * tableIndexesAndRowNumbers.get(Constants.TableIndexes.FIELDTABLE);

            tablesMap.put(Constants.TableIndexes.FIELDTABLE, fieldTable);

            _startIndex += fieldTableSize;
        }

        if (tableIndexesAndRowNumbers.containsKey(Constants.TableIndexes.METHODDEFTABLE)){
            MethodDefTable methodDefTable = new MethodDefTable();
            Integer numberOfRowsInTable = tableIndexesAndRowNumbers.get(Constants.TableIndexes.METHODDEFTABLE);
            Integer methodDefTableSize = methodDefTable.lengthOfARowInBytes
                    * numberOfRowsInTable;

            methodDefTable.fillTable(_stream, numberOfRowsInTable, _startIndex);

            tablesMap.put(Constants.TableIndexes.METHODDEFTABLE, methodDefTable);
            _startIndex += methodDefTableSize;
        }


    }
}
