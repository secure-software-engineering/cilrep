/**
 * Duplicate.java
 * Duplicate the value on the top of the stack.
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

public class Duplicate extends Instruction {
    public final static Integer OpCode = 0x25;
    public final static String AssemblyFormat = "Dup";


    public Integer getOpCode(){
        return Duplicate.OpCode;
    }
    public String getAssemblyFormat() {
        return Duplicate.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        return exceptions;
    }
}
