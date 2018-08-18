package de.upb.cs.swt.cilrep.instructions;

import de.upb.cs.swt.cilrep.exceptions.IException;

import java.util.List;

public interface Instruction {
    public Integer getOpCode();
    public String getAssemblyFormat();
    public List<Class> getThrownExceptions();
}
