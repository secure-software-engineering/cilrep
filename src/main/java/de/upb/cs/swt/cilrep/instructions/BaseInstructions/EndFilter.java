/**
 * EndFilter.java
 * End an exception handling filter clause.
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

public class EndFilter implements Instruction {
    public final static Integer OpCode = 0xFE11;
    public final static String AssemblyFormat = "Endfilter";


    public Integer getOpCode(){
        return EndFilter.OpCode;
    }
    public String getAssemblyFormat() {
        return EndFilter.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        return exceptions;
    }
}
