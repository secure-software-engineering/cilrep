package de.upb.cs.swt.cilrep.filecomponents.Headers;

public class SectionHeaders {
    public static class TextSection{
        public Integer VirtualAddress = 0x00002000;
        public Integer PointerToRawData = 0x00000200;
        public Integer VirtualSize = 0x00099BFC;

        public static TextSection textSection = null;

        private TextSection(){}

        public static TextSection getInstance(){
            if (textSection == null){
                textSection = new TextSection();
            }
            return textSection;
        }

        public Integer getFileOffset(Integer rva){
            Integer offset = rva - this.VirtualAddress;
            if (offset >= 0 && offset < this.VirtualSize)
            {
                offset =  offset + this.PointerToRawData;
            }
            return offset;
        }
    }

}
