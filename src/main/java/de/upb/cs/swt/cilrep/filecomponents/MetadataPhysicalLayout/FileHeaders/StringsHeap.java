package de.upb.cs.swt.cilrep.filecomponents.MetadataPhysicalLayout.FileHeaders;

import java.util.HashMap;

public class StringsHeap extends Stream {
    public HashMap<Integer, String> strings;
    public void populateData(byte[] _stream){
        strings = new HashMap<>();
        Integer startIndex = this.streamHeader.StartingIndexInFile;
        Integer endIndex = startIndex + this.streamHeader.Size;
        StringBuilder sb = new StringBuilder();

        for (int i = startIndex; i < endIndex; i++){
            if (_stream[i] == 0){
                String str = sb.toString();
                if (str.length() > 0){
                    strings.put(i - str.length() - 1, str);
                }
                sb = new StringBuilder();
            }
            else{
                sb.append((char)_stream[i]);
            }
        }
    }
}
