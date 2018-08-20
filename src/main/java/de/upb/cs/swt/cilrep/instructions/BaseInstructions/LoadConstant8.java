/**
 * LoadConstant8.java
 * Push 8 onto the stack as int32.
 *
 * @author Numan Ijaz
 * @version 1.0 8/20/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class LoadConstant8 implements Instruction {
    public final static Integer OpCode = 0x1E;
    public final static  String AssemblyFormat = "ldc.i4.8";


    public Integer getOpCode(){
        return LoadConstant8.OpCode;
    }
    public String getAssemblyFormat() {
        return LoadConstant8.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        return exceptions;
    }
}
