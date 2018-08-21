/**
 * Negate.java
 * Negate value.
 *
 * @author Numan Ijaz
 * @version 1.0 8/21/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.exceptions.OverflowException;
import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class Negate implements Instruction {
    public final static Integer OpCode = 0x65;
    public final static  String AssemblyFormat = "Neg";


    public Integer getOpCode(){
        return Negate.OpCode;
    }
    public String getAssemblyFormat() {
        return Negate.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        return exceptions;
    }
}
