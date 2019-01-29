/**
 * DivideUnsigned.java
 * Divide two values, unsigned, returning a quotient.
 *
 * @author Numan Ijaz
 * @version 1.0 8/20/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.exceptions.ArithmeticException;
import de.upb.cs.swt.cilrep.exceptions.DivideByZeroException;
import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class DivideUnsigned extends Instruction {
    public final static Integer OpCode = 0x5C;
    public final static String AssemblyFormat = "div.un";


    public Integer getOpCode(){
        return DivideUnsigned.OpCode;
    }
    public String getAssemblyFormat() {
        return DivideUnsigned.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(DivideByZeroException.class);
        return exceptions;
    }
}
