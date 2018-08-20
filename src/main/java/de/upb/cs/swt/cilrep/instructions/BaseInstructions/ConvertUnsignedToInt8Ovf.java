/**
 * ConvertUnsignedToInt8Ovf.java
 * Convert unsigned to an int8 (on the stack as int32) and throw
 * an exception on overflow.
 *
 * @author Numan Ijaz
 * @version 1.0 8/20/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.exceptions.OverflowException;
import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class ConvertUnsignedToInt8Ovf implements Instruction {
    public final static Integer OpCode = 0x82;
    public final static String AssemblyFormat = "conv.ovf.i1.un";


    public Integer getOpCode(){
        return ConvertUnsignedToInt8Ovf.OpCode;
    }
    public String getAssemblyFormat() {
        return ConvertUnsignedToInt8Ovf.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(OverflowException.class);
        return exceptions;
    }
}
