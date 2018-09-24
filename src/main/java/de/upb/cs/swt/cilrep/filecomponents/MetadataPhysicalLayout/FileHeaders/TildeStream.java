package de.upb.cs.swt.cilrep.filecomponents.MetadataPhysicalLayout.FileHeaders;

import de.upb.cs.swt.cilrep.common.HelperFunctions;
import de.upb.cs.swt.cilrep.filecomponents.MetadataLogicalFormat.LogicalFormatTable;
import de.upb.cs.swt.cilrep.filecomponents.MetadataLogicalFormat.MethodDefTable;

import java.util.ArrayList;
import java.util.List;

public class TildeStream {
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
    public List<Integer> NumOfRowsInEachTable;

    /* offset 24 + 4*n, size variable */
    public List<LogicalFormatTable> Tables = null;

    public void populateData(Integer _startIndex, byte[] _stream){
        this.Reserved1 = HelperFunctions.readNBytesIntoInt32(4, _startIndex, _stream);
        this.MajorVersion = HelperFunctions.readNBytesIntoInt32(1, _startIndex + 4, _stream);
        this.MinorVersion = HelperFunctions.readNBytesIntoInt32(1, _startIndex + 5, _stream);
        this.HeapSizes = HelperFunctions.readNBytesIntoInt32(1, _startIndex + 6, _stream);


        this.Reserved2 = HelperFunctions.readNBytesIntoInt32(1, _startIndex + 7, _stream);

        this.ValidBVForPresentTables = HelperFunctions.readNBytesIntoLong(8, _startIndex + 8, _stream);

        this.SortedBVForSortedTables = HelperFunctions.readNBytesIntoLong(8, _startIndex + 16, _stream);

        int n = HelperFunctions.getNumberOfSetBits(this.ValidBVForPresentTables);

        for (int i = 0; i < n; i++){
            Integer numberOfRows = HelperFunctions.readNBytesIntoInt32(4,
                        _startIndex + 24 + (4 * i), _stream);

            this.NumOfRowsInEachTable.add(numberOfRows);
        }

        // fill table now
        this.fillTables(_startIndex + 24 + (4 * n), _stream);
    }

    void fillTables(Integer _startIndex, byte[] _stream){
        if (HelperFunctions.checkIfCertainBitIsSet(this.ValidBVForPresentTables, MethodDefTable.TABLEINDEX)){
            MethodDefTable methodDefTable = new MethodDefTable();
            //methodDefTable.fillTable();
        }
    }
}
