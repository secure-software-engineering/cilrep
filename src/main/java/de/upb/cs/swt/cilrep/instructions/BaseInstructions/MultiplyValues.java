/**
 * MultiplyValues.java
 * Multiply values.
 *
 * @author Numan Ijaz
 * @version 1.0 8/21/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.exceptions.NullReferenceException;
import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class MultiplyValues extends Instruction {
    public final static Integer OpCode = 0x5A;
    public final static  String AssemblyFormat = "mul";


    public Integer getOpCode(){
        return MultiplyValues.OpCode;
    }
    public String getAssemblyFormat() {
        return MultiplyValues.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        return exceptions;
    }
}
