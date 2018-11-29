package de.upb.cs.swt.cilrep.assemblycomponents;

import de.upb.cs.swt.cilrep.common.HelperFunctions;
import de.upb.cs.swt.cilrep.filecomponents.MetadataLogicalFormat.MethodDefTable;
import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.List;

public class Method {
    public String Name;
    public MethodHeader header;
    public List<Instruction> instructions;

    public void populate(MethodDefTable.MethodDefTableRow row, byte[] _bytes){
        Integer startIndex = row.FileOffset;
        this.populateHeader(startIndex, _bytes);
    }

    void populateHeader(int _startIndex, byte[] _bytes){

        /* if method header is tiny or fat */
        byte firstByte = _bytes[_startIndex];
        if (HelperFunctions.checkIfCertainBitIsSet(firstByte, 0)){
            this.header = new MethodHeaderFat();
            this.fillFatHeader(_startIndex, _bytes);
        }
        else {
            this.header = new MethodHeaderTiny();
            this.fillTinyHeader(firstByte);
        }

        _startIndex = isHeaderTiny()? _startIndex + 1: _startIndex + 16;

        this.populateInstructions(_startIndex, _bytes);

    }

    void fillTinyHeader(byte headerByte){
        MethodHeaderTiny mht = (MethodHeaderTiny) this.header;
        mht.codeSizeInBytes = HelperFunctions.getIntValueOfBitRangeInByte(2, 7, headerByte);
    }

    void fillFatHeader(Integer _startIndex, byte[] _bytes){
        MethodHeaderFat mhf = (MethodHeaderFat) this.header;

        mhf.sizeOfHeader = HelperFunctions.getIntValueOfBitRangeInByte(4, 7,
                _bytes[_startIndex + 1]);

        mhf.maxNumberOfItemsOnStack = HelperFunctions.readNBytesIntoInt32(2,
                _startIndex + 2, _bytes);

        mhf.codeSizeInBytes = HelperFunctions.readNBytesIntoInt32(4, _startIndex + 4, _bytes);
        mhf.localVarSigTok = HelperFunctions.readNBytesIntoInt32(4, _startIndex + 8, _bytes);

    }

    public boolean isHeaderTiny(){
        return this.header instanceof MethodHeaderTiny;
    }

    void populateInstructions(Integer _startIndex, byte[] _bytes){
        Integer numOfBytesRead = 0;
        while (numOfBytesRead < this.header.codeSizeInBytes){

        }
    }
}
