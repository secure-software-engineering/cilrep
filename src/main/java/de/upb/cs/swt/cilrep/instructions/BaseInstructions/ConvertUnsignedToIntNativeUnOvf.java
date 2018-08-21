/**
 * ConvertUnsignedToIntNativeUnOvf.java
 * Convert unsigned to a native unsigned int (on the stack as
 * native int) and throw an exception on overflow.
 *
 * @author Numan Ijaz
 * @version 1.0 8/20/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.exceptions.OverflowException;
import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class ConvertUnsignedToIntNativeUnOvf implements Instruction {
    public final static Integer OpCode = 0x8B;
    public final static String AssemblyFormat = "conv.ovf.u.un";


    public Integer getOpCode(){
        return ConvertUnsignedToIntNativeUnOvf.OpCode;
    }
    public String getAssemblyFormat() {
        return ConvertUnsignedToIntNativeUnOvf.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(OverflowException.class);
        return exceptions;
    }
}