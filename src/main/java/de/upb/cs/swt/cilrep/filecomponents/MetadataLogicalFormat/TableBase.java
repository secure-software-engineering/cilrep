package de.upb.cs.swt.cilrep.filecomponents.MetadataLogicalFormat;

import java.util.ArrayList;

public abstract class TableBase<T> implements LogicalFormatTable {
    public String tableName;
    public Integer tableIndex;
    public long numberOfRows;

    public String getTableName(){
        return tableName;
    }
    public Integer getTableIndex() { return tableIndex; }

    ArrayList<T> rows;
    ArrayList<String> columns;
}
