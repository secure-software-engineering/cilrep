/**
 * SubtractIntUnsignedOvf.java
 * Subtract native unsigned int from a native unsigned int.
 * Unsigned result shall fit in same size.
 *
 * @author Numan Ijaz
 * @version 1.0 8/21/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.exceptions.OverflowException;
import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class SubtractIntUnsignedOvf extends Instruction {
    public final static Integer OpCode = 0xDB;
    public final static  String AssemblyFormat = "sub.ovf.un";

    public Integer getOpCode(){
        return SubtractIntUnsignedOvf.OpCode;
    }
    public String getAssemblyFormat() {
        return SubtractIntUnsignedOvf.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(OverflowException.class);
        return exceptions;
    }
}
