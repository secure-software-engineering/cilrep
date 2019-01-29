package de.upb.cs.swt.cilrep.assemblycomponents;

import de.upb.cs.swt.cilrep.common.HelperFunctions;
import de.upb.cs.swt.cilrep.filecomponents.MetadataLogicalFormat.MethodDefTable;
import de.upb.cs.swt.cilrep.instructions.Instruction;
import de.upb.cs.swt.cilrep.instructions.InstructionsHelper;

import java.util.ArrayList;
import java.util.List;

public class Method {
    public String Name;
    public MethodHeader header;
    public List<Instruction> instructions;
    MethodDefTable.MethodDefTableRow row;

    public void populate(MethodDefTable.MethodDefTableRow row, byte[] _bytes){
        this.row = row;
        Integer startIndex = row.FileOffset;
        if (startIndex <= 0){
            return;
        }

        Integer instructionsStartIndex = this.populateHeader(startIndex, _bytes);
        this.populateInstructions(instructionsStartIndex, _bytes);
    }

    Integer populateHeader(int _startIndex, byte[] _bytes){

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

        _startIndex = isHeaderTiny()? _startIndex + 1: _startIndex + 12;
        return _startIndex;
    }

    void fillTinyHeader(byte headerByte){
        MethodHeaderTiny mht = (MethodHeaderTiny) this.header;
        mht.codeSizeInBytes = HelperFunctions.getShiftedValOfByte(2, headerByte);
    }

    void fillFatHeader(Integer _startIndex, byte[] _bytes){
        MethodHeaderFat mhf = (MethodHeaderFat) this.header;

        mhf.sizeOfHeader = HelperFunctions.getShiftedValOfByte(4,
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
        instructions = new ArrayList<>();
        Integer numOfBytesRead = 0;
        Integer codeSizeInBytes;
        if (this.header instanceof MethodHeaderTiny)
            codeSizeInBytes = ((MethodHeaderTiny) this.header).codeSizeInBytes;
        else
            codeSizeInBytes = ((MethodHeaderFat) this.header).codeSizeInBytes;

        while (numOfBytesRead < codeSizeInBytes){
            if (_startIndex == 1092
                && row.RVA == 8752
            ){ // for debugging scenarios
                _startIndex = _startIndex;
            }
            if (numOfBytesRead > 50){
                _startIndex = _startIndex;
            }
            Instruction instruction = InstructionsHelper
                    .readInstruction(_startIndex, _bytes);
            instructions.add(instruction);

            Integer instructionSize = instruction.getOpCodeByteSize();

            if (instruction.getParameter() != null){
                instructionSize += instruction.getParameter().getSizeInBytes();
            }

            // start index of the next instruction (if any) equals
            // start index plus
            // size of the instruction
            _startIndex += instructionSize;
            numOfBytesRead += instructionSize;


        }
    }
}
