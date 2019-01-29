package de.upb.cs.swt.cilrep.instructions;

import de.upb.cs.swt.cilrep.instructions.ParameterTypes.TypesBase;

import java.util.List;

public abstract class Instruction {
    public boolean hasParameter = false;
    protected TypesBase parameter = null;

    public abstract Integer getOpCode();
    public abstract String getAssemblyFormat();
    public abstract List<Class> getThrownExceptions();
    public TypesBase getParameter(){
        return null;
    }

    public Integer getOpCodeByteSize(){
        int opCodeByteLength = 1;
        if (this.getOpCode() > 255){
            opCodeByteLength = 2;
        }
        return opCodeByteLength;
    }
}
