/**
 * ConvertToIntNativeUnsignedOvf.java
 * Convert to a native unsigned int (on the stack as native int)
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

public class ConvertToIntNativeUnsignedOvf extends Instruction {
    public final static Integer OpCode = 0xD5;
    public final static String AssemblyFormat = "conv.ovf.u";


    public Integer getOpCode(){
        return ConvertToIntNativeUnsignedOvf.OpCode;
    }
    public String getAssemblyFormat() {
        return ConvertToIntNativeUnsignedOvf.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(OverflowException.class);
        return exceptions;
    }
}
