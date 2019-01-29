/**
 * InitializeMemBlockWithVal.java
 * Set all bytes in a block of memory to a given byte value.
 *
 * @author Numan Ijaz
 * @version 1.0 8/20/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.exceptions.NullReferenceException;
import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class InitializeMemBlockWithVal extends Instruction {
    public final static Integer OpCode = 0xFE18;
    public final static String AssemblyFormat = "initblk";

    public Integer getOpCode(){
        return InitializeMemBlockWithVal.OpCode;
    }
    public String getAssemblyFormat() {
        return InitializeMemBlockWithVal.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(NullReferenceException.class);
        return exceptions;
    }
}
