package de.upb.cs.swt.cilrep.filecomponents.MetadataLogicalFormat;

import de.upb.cs.swt.cilrep.common.Constants;
import de.upb.cs.swt.cilrep.filecomponents.MetadataPhysicalLayout.FileHeaders.TildeStream;

public class TypeRefTable extends TableBase<TypeRefTable.TypeRefTableRow> {

    public TypeRefTable(){
        this.tableName = Constants.TableNames.TYPEREFTABLE;
        this.tableIndex = Constants.TableIndexes.TYPEREFTABLE;

        Integer allIndexes = 2 * TildeStream.HeapSizeString;

        this.lengthOfARowInBytes = 2 /* Resolution Scope Index - length currently assumed as 2 bytes*/
                + allIndexes;
    }

    public static class TypeRefTableRow extends TableRowBase{

    }


}
