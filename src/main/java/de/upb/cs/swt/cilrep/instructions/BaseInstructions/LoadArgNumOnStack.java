/**
 * LoadArgNumOnStack.java
 * Load argument numbered num onto the stack.
 *
 * @author Numan Ijaz
 * @version 1.0 8/20/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class LoadArgNumOnStack implements Instruction {
    public final static  Integer OpCode = 0xFE09;
    public final static String AssemblyFormat = "ldarg";

    public Integer num = 0; // to be changed in future

    public Integer getOpCode(){
        return LoadArgNumOnStack.OpCode;
    }
    public String getAssemblyFormat() {
        return LoadArgNumOnStack.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        return exceptions;
    }
}
