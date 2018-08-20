/**
 * JumpToMethod.java
 * Exit current method and jump to the specified method.
 *
 * @author Numan Ijaz
 * @version 1.0 8/20/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class JumpToMethod implements Instruction {
    public final static Integer OpCode = 0x27;
    public final static String AssemblyFormat = "jmp";

    public String Method = ""; // to be changed in future

    public Integer getOpCode(){
        return JumpToMethod.OpCode;
    }
    public String getAssemblyFormat() {
        return JumpToMethod.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        return exceptions;
    }
}
