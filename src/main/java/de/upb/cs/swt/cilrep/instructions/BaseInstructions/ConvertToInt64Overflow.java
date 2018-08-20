/**
 * ConvertToInt64Overflow.java
 * Convert to an int64 (on the stack as int64) and throw an
 * exception on overflow.
 *
 * @author Numan Ijaz
 * @version 1.0 8/20/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.exceptions.OverflowException;
import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class ConvertToInt64Overflow implements Instruction {
    public final static Integer OpCode = 0xB9;
    public final static String AssemblyFormat = "conv.ovf.i8";


    public Integer getOpCode(){
        return ConvertToInt64Overflow.OpCode;
    }
    public String getAssemblyFormat() {
        return ConvertToInt64Overflow.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(OverflowException.class);
        return exceptions;
    }
}
