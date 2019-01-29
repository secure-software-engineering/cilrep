/**
 * ConvertUnsignedToInt8UnOvf.java
 * Convert unsigned to an unsigned int8 (on the stack as int32)
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

public class ConvertUnsignedToInt8UnOvf extends Instruction {
    public final static Integer OpCode = 0x86;
    public final static String AssemblyFormat = "conv.ovf.u1.un";


    public Integer getOpCode(){
        return ConvertUnsignedToInt8UnOvf.OpCode;
    }
    public String getAssemblyFormat() {
        return ConvertUnsignedToInt8UnOvf.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(OverflowException.class);
        return exceptions;
    }
}
