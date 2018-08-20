/**
 * Divide.java
 * Divide two values to return a quotient or floating-point result.
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

public class Divide implements Instruction {
    public final static Integer OpCode = 0x5B;
    public final static String AssemblyFormat = "Div";


    public Integer getOpCode(){
        return Divide.OpCode;
    }
    public String getAssemblyFormat() {
        return Divide.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(ArithmeticException.class);
        exceptions.add(DivideByZeroException.class);
        return exceptions;
    }
}
