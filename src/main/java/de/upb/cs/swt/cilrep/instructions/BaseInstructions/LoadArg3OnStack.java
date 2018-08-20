/**
 * LoadArg3OnStack.java
 * Load argument 3 onto the stack.
 *
 * @author Numan Ijaz
 * @version 1.0 8/20/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class LoadArg3OnStack implements Instruction {
    public final static Integer OpCode = 0x05;
    public final static String AssemblyFormat = "ldarg.3";


    public Integer getOpCode(){
        return LoadArg3OnStack.OpCode;
    }
    public String getAssemblyFormat() {
        return LoadArg3OnStack.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        return exceptions;
    }
}
