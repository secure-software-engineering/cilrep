/**
 * ConvertUnsignedToInt64UnOvf.java
 * Convert unsigned to an unsigned int64 (on the stack as int64)
 * and throw an exception on overflow.
 *
 * @author Numan Ijaz
 * @version 1.0 8/20/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.exceptions.OverflowException;
import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class ConvertUnsignedToInt64UnOvf implements Instruction {
    public final static Integer OpCode = 0x89;
    public final static String AssemblyFormat = "conv.ovf.u8.un";


    public Integer getOpCode(){
        return ConvertUnsignedToInt64UnOvf.OpCode;
    }
    public String getAssemblyFormat() {
        return ConvertUnsignedToInt64UnOvf.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(OverflowException.class);
        return exceptions;
    }
}
