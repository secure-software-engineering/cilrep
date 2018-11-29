package de.upb.cs.swt.cilrep.filecomponents;

import de.upb.cs.swt.cilrep.filecomponents.MetadataPhysicalLayout.FileHeaders.MetadataRoot;

public class FileComponents {
    public MetadataRoot mdRoot = null;
    public void readBytes(byte[] bytes){
        mdRoot = new MetadataRoot();
        mdRoot.populateData(272560, bytes);
    }

}
