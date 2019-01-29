/**
 * CheckFiniteRealNum.java
 * Throw ArithmeticException if value is not a finite number.
 *
 * @author Numan Ijaz
 * @version 1.0 8/20/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.exceptions.ArithmeticException;
import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class CheckFiniteRealNum extends Instruction {
    public final static Integer OpCode = 0xC3;
    public final static String AssemblyFormat = "Ckfinite";


    public Integer getOpCode(){
        return CheckFiniteRealNum.OpCode;
    }
    public String getAssemblyFormat() {
        return CheckFiniteRealNum.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(ArithmeticException.class);
        return exceptions;
    }
}
