/**
 * ConvertToIntNativeOvf.java
 * Convert to a native int (on the stack as native int) and throw
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

public class ConvertToIntNativeOvf extends Instruction {
    public final static Integer OpCode = 0xD4;
    public final static String AssemblyFormat = "conv.ovf.i";


    public Integer getOpCode(){
        return ConvertToIntNativeOvf.OpCode;
    }
    public String getAssemblyFormat() {
        return ConvertToIntNativeOvf.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(OverflowException.class);
        return exceptions;
    }
}
