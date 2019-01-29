/**
 * ConvertToInt8UnsignedOvf.java
 * Convert to an unsigned int8 (on the stack as int32) and throw
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

public class ConvertToInt8UnsignedOvf extends Instruction {
    public final static Integer OpCode = 0xB4;
    public final static String AssemblyFormat = "conv.ovf.u1";


    public Integer getOpCode(){
        return ConvertToInt8UnsignedOvf.OpCode;
    }
    public String getAssemblyFormat() {
        return ConvertToInt8UnsignedOvf.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(OverflowException.class);
        return exceptions;
    }
}
