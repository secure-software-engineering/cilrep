/**
 * LoadConstantMinusOneAlias.java
 * Push -1 of type int32 onto the stack as int32 (alias for
 * ldc.i4.m1).
 *
 * @author Numan Ijaz
 * @version 1.0 8/20/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class LoadConstantMinusOneAlias extends Instruction {
    public final static Integer OpCode = 0x15;
    public final static  String AssemblyFormat = "ldc.i4.M1";


    public Integer getOpCode(){
        return LoadConstantMinusOneAlias.OpCode;
    }
    public String getAssemblyFormat() {
        return LoadConstantMinusOneAlias.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        return exceptions;
    }
}
