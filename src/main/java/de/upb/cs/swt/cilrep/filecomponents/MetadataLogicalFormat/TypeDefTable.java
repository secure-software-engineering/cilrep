package de.upb.cs.swt.cilrep.filecomponents.MetadataLogicalFormat;

import de.upb.cs.swt.cilrep.common.Constants;
import de.upb.cs.swt.cilrep.filecomponents.MetadataPhysicalLayout.FileHeaders.TildeStream;

public class TypeDefTable extends TableBase<TypeDefTable.TypeDefTableRow> {

    public TypeDefTable(){
        this.tableName = Constants.TableNames.TYPEDEFTABLE;
        this.tableIndex = Constants.TableIndexes.TYPEDEFTABLE;

        Integer allIndexes = (2 * TildeStream.HeapSizeString)
                + (3 * 2 /* Index to TypeDef, Field, MethodDef table is assumed to be 2 bytes */);
        this.lengthOfARowInBytes = 4 + allIndexes;
    }



    public static class TypeDefTableRow extends TableRowBase{

    }
}
