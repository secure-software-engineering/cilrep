/**
 * RemainderUnsigned.java
 * Remainder when dividing one unsigned value by another.
 *
 * @author Numan Ijaz
 * @version 1.0 8/21/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.exceptions.DivideByZeroException;
import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class RemainderUnsigned implements Instruction {
    public final static Integer OpCode = 0x5E;
    public final static  String AssemblyFormat = "rem.un";


    public Integer getOpCode(){
        return RemainderUnsigned.OpCode;
    }
    public String getAssemblyFormat() {
        return RemainderUnsigned.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(DivideByZeroException.class);
        return exceptions;
    }
}
