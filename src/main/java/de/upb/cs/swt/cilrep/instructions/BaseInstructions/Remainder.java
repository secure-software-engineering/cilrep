/**
 * Remainder.java
 * Remainder when dividing one value by another
 *
 * @author Numan Ijaz
 * @version 1.0 8/21/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.exceptions.DivideByZeroException;
import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class Remainder extends Instruction {
    public final static Integer OpCode = 0x5D;
    public final static  String AssemblyFormat = "rem";


    public Integer getOpCode(){
        return Remainder.OpCode;
    }
    public String getAssemblyFormat() {
        return Remainder.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(DivideByZeroException.class);
        exceptions.add(ArithmeticException.class);
        return exceptions;
    }
}
