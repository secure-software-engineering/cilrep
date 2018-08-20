/**
 * LoadConstant0.java
 * Push 0 onto the stack as int32.
 *
 * @author Numan Ijaz
 * @version 1.0 8/20/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class LoadConstant0 implements Instruction {
    public final static Integer OpCode = 0x16;
    public final static  String AssemblyFormat = "ldc.i4.0";


    public Integer getOpCode(){
        return LoadConstant0.OpCode;
    }
    public String getAssemblyFormat() {
        return LoadConstant0.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        return exceptions;
    }
}
