/**
 * ConvertUnsignedToIntNativeOvf.java
 * Convert unsigned to a native int (on the stack as native int)
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

public class ConvertUnsignedToIntNativeOvf extends Instruction {
    public final static Integer OpCode = 0x8A;
    public final static String AssemblyFormat = "conv.ovf.i.un";


    public Integer getOpCode(){
        return ConvertUnsignedToIntNativeOvf.OpCode;
    }
    public String getAssemblyFormat() {
        return ConvertUnsignedToIntNativeOvf.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(OverflowException.class);
        return exceptions;
    }
}
