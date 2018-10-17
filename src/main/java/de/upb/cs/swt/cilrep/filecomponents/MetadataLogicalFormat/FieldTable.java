package de.upb.cs.swt.cilrep.filecomponents.MetadataLogicalFormat;

import de.upb.cs.swt.cilrep.common.Constants;
import de.upb.cs.swt.cilrep.filecomponents.MetadataPhysicalLayout.FileHeaders.TildeStream;

public class FieldTable extends TableBase<FieldTable.ModuleRow> {

    public FieldTable(){
        this.tableName = Constants.TableNames.FIELDTABLE;
        this.tableIndex = Constants.TableIndexes.FIELDTABLE;

        Integer allIndexes = TildeStream.HeapSizeString + TildeStream.HeapSizeBlob;
        this.lengthOfARowInBytes = 2 + allIndexes;
    }

    public static class ModuleRow extends TableRowBase{

    }


}
