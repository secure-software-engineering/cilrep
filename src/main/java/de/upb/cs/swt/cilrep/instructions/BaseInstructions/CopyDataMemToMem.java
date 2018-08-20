/**
 * CopyDataMemToMem.java
 * Copy data from memory to memory.
 *
 * @author Numan Ijaz
 * @version 1.0 8/20/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.exceptions.NullReferenceException;
import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class CopyDataMemToMem implements Instruction {
    public final static Integer OpCode = 0xFE17;
    public final static String AssemblyFormat = "cpblk";


    public Integer getOpCode(){
        return CopyDataMemToMem.OpCode;
    }
    public String getAssemblyFormat() {
        return CopyDataMemToMem.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(NullReferenceException.class);
        return exceptions;
    }
}
