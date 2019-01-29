/**
 * SubtractValues.java
 * Subtract value2 from value1, returning a new value.
 *
 * @author Numan Ijaz
 * @version 1.0 8/21/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class SubtractValues extends Instruction {
    public final static Integer OpCode = 0x59;
    public final static  String AssemblyFormat = "sub";

    public Integer getOpCode(){
        return SubtractValues.OpCode;
    }
    public String getAssemblyFormat() {
        return SubtractValues.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        return exceptions;
    }
}
