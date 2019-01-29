/**
 * Or.java
 * Bitwise OR of two integer values, returns an integer.
 *
 * @author Numan Ijaz
 * @version 1.0 8/21/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class Or extends Instruction {
    public final static Integer OpCode = 0x60;
    public final static  String AssemblyFormat = "Or";


    public Integer getOpCode(){
        return Or.OpCode;
    }
    public String getAssemblyFormat() {
        return Or.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        return exceptions;
    }
}
