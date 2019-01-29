/**
 * Or.java
 * Pop value from the stack.
 *
 * @author Numan Ijaz
 * @version 1.0 8/21/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class Pop extends Instruction {
    public final static Integer OpCode = 0x26;
    public final static  String AssemblyFormat = "pop";


    public Integer getOpCode(){
        return Pop.OpCode;
    }
    public String getAssemblyFormat() {
        return Pop.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        return exceptions;
    }
}
