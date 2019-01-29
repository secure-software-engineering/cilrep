/**
 * ConvertUnsignedToInt32Ovf.java
 * Convert unsigned to an int32 (on the stack as int32) and
 * throw an exception on overflow.
 *
 * @author Numan Ijaz
 * @version 1.0 8/20/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.exceptions.OverflowException;
import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class ConvertUnsignedToInt32Ovf extends Instruction {
    public final static Integer OpCode = 0x84;
    public final static String AssemblyFormat = "conv.ovf.i4.un";


    public Integer getOpCode(){
        return ConvertUnsignedToInt32Ovf.OpCode;
    }
    public String getAssemblyFormat() {
        return ConvertUnsignedToInt32Ovf.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(OverflowException.class);
        return exceptions;
    }
}
