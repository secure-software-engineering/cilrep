package de.upb.cs.swt.cilrep.filecomponents.MetadataLogicalFormat;


import de.upb.cs.swt.cilrep.common.HelperFunctions;
import de.upb.cs.swt.cilrep.filecomponents.MetadataPhysicalLayout.FileHeaders.TildeStream;

import java.util.ArrayList;

public class MethodDefTable extends TableBase<MethodDefTable.MethodDefTableRow> {

    public static final String TABLENAME = "MethodDef";
    public static final Integer TABLEINDEX = 0x06;

    public MethodDefTable(){
        this.tableName = MethodDefTable.TABLENAME;
        this.tableIndex = MethodDefTable.TABLEINDEX;
    }


    public void fillTable(byte[] _stream, Integer _numberOfRows, Integer _startIndex,
                          Integer _widthOfIndexes){

        this.rows = new ArrayList<>();
        Integer rowStartIndex = _startIndex;
        Integer allIndexSize = TildeStream.HeapSizeParameters
                + TildeStream.HeapSizeString + TildeStream.HeapSizeBlob;
        for (int i = 0; i < _numberOfRows; i++){

            MethodDefTableRow row = new MethodDefTableRow();
            row.RVA = HelperFunctions.readNBytesIntoByteArr(4, rowStartIndex, _stream);;
            row.ImplFlags = HelperFunctions.readNBytesIntoInt32(2, rowStartIndex + 4, _stream);
            row.Flags = HelperFunctions.readNBytesIntoInt32(2, rowStartIndex + 6, _stream);
            row.NameIndex = HelperFunctions.readNBytesIntoInt32(TildeStream.HeapSizeString, rowStartIndex + 8, _stream);
            row.Signature = HelperFunctions.readNBytesIntoInt32(TildeStream.HeapSizeBlob,
                    rowStartIndex + 8 + TildeStream.HeapSizeString, _stream);
            row.ParamList = HelperFunctions.readNBytesIntoInt32(TildeStream.HeapSizeParameters,
                    rowStartIndex + 8 + TildeStream.HeapSizeString + TildeStream.HeapSizeBlob, _stream);

            this.rows.add(row);

            rowStartIndex += (8 + allIndexSize);
        }
    }


    class MethodDefTableRow{
        byte[] RVA;
        Integer ImplFlags;
        Integer Flags;
        Integer NameIndex; // index into String heap
        Integer Signature; // index into blob heap
        Integer ParamList; // index into param table
    }


}
