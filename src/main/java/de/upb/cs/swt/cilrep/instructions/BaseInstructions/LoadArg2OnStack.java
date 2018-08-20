/**
 * LoadArg2OnStack.java
 * Load argument 2 onto the stack.
 *
 * @author Numan Ijaz
 * @version 1.0 8/20/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class LoadArg2OnStack implements Instruction {
    public final static Integer OpCode = 0x04;
    public final static String AssemblyFormat = "ldarg.2";

    public Integer getOpCode(){
        return LoadArg2OnStack.OpCode;
    }
    public String getAssemblyFormat() {
        return LoadArg2OnStack.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        return exceptions;
    }
}
