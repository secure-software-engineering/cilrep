package de.upb.cs.swt.cilrep.filecomponents.MetadataLogicalFormat;

import de.upb.cs.swt.cilrep.common.Constants;
import de.upb.cs.swt.cilrep.filecomponents.MetadataPhysicalLayout.FileHeaders.TildeStream;

public class ModuleTable extends TableBase<ModuleTable.ModuleTableRow> {

    public ModuleTable(){
        this.tableName = Constants.TableNames.MODULETABLE;
        this.tableIndex = Constants.TableIndexes.MODULETABLE;

        Integer allIndexes = TildeStream.HeapSizeString + (3 * TildeStream.HeapSizeGUID);
        this.lengthOfARowInBytes = 2 + allIndexes;
    }

    public static class ModuleTableRow extends TableRowBase{

    }


}
