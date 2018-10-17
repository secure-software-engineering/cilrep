package de.upb.cs.swt.cilrep.common;

public class Constants {

    public static final String TILDESTREAMNAME = "#~";
    public static final String STRINGSSTREAMNAME = "#String";
    public static final String USSTREAMNAME = "#US";
    public static final String BLOBSTREAMNAME = "#Blob";

    public static class TableIndexes {
        public static final Integer MODULETABLE = 0x00;
        public static final Integer TYPEREFTABLE = 0x01;
        public static final Integer TYPEDEFTABLE = 0x02;
        public static final Integer FIELDTABLE = 0x04;
        public static final Integer METHODDEFTABLE = 0x06;
    }

    public static class TableNames {
        public static final String MODULETABLE = "ModuleTable";
        public static final String TYPEREFTABLE = "TypeRefTable";
        public static final String TYPEDEFTABLE = "TypeDef";
        public static final String FIELDTABLE = "Field";
        public static final String METHODDEFTABLE = "MethodDef";
    }
}
