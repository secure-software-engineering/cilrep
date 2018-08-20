/**
 * LoadConstant2.java
 * Push 2 onto the stack as int32.
 *
 * @author Numan Ijaz
 * @version 1.0 8/20/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class LoadConstant2 implements Instruction {
    public final static Integer OpCode = 0x18;
    public final static  String AssemblyFormat = "ldc.i4.2";


    public Integer getOpCode(){
        return LoadConstant2.OpCode;
    }
    public String getAssemblyFormat() {
        return LoadConstant2.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        return exceptions;
    }
}
