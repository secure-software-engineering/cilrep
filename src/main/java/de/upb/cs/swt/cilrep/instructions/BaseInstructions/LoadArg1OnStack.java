/**
 * LoadArg1OnStack.java
 * Load argument 1 onto the stack.
 *
 * @author Numan Ijaz
 * @version 1.0 8/20/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class LoadArg1OnStack extends Instruction {
    public final static Integer OpCode = 0x03;
    public final static String AssemblyFormat = "ldarg.1";


    public Integer getOpCode(){
        return LoadArg1OnStack.OpCode;
    }
    public String getAssemblyFormat() {
        return LoadArg1OnStack.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        return exceptions;
    }
}
