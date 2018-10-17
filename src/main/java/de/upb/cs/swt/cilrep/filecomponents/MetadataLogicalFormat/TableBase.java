package de.upb.cs.swt.cilrep.filecomponents.MetadataLogicalFormat;

import java.util.ArrayList;

public abstract class TableBase<T> implements LogicalFormatTable {
    public String tableName;
    public Integer tableIndex;
    public long numberOfRows;
    public Integer lengthOfARowInBytes;

    public String getTableName(){
        return tableName;
    }
    public Integer getTableIndex() { return tableIndex; }

    public ArrayList<T> rows;
    public ArrayList<String> columns;
}
