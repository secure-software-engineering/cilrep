/**
 * LoadArg0OnStack.java
 * Load argument 0 onto the stack.
 *
 * @author Numan Ijaz
 * @version 1.0 8/20/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class LoadArg0OnStack implements Instruction {
    public final static Integer OpCode = 0x02;
    public final static String AssemblyFormat = "ldarg.0";


    public Integer getOpCode(){
        return LoadArg0OnStack.OpCode;
    }
    public String getAssemblyFormat() {
        return LoadArg0OnStack.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        return exceptions;
    }
}
