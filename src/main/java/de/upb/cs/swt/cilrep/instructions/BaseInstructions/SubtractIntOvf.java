/**
 * SubtractIntOvf.java
 * Subtract native int from a native int. Signed result shall fit in
 * same size.
 *
 * @author Numan Ijaz
 * @version 1.0 8/21/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.exceptions.OverflowException;
import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class SubtractIntOvf implements Instruction {
    public final static Integer OpCode = 0xDA;
    public final static  String AssemblyFormat = "sub.ovf";

    public Integer getOpCode(){
        return SubtractIntOvf.OpCode;
    }
    public String getAssemblyFormat() {
        return SubtractIntOvf.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(OverflowException.class);
        return exceptions;
    }
}
