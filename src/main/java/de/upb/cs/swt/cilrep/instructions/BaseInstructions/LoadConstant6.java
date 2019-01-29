/**
 * LoadConstant6.java
 * Push 6 onto the stack as int32.
 *
 * @author Numan Ijaz
 * @version 1.0 8/20/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class LoadConstant6 extends Instruction {
    public final static Integer OpCode = 0x1C;
    public final static  String AssemblyFormat = "ldc.i4.6";


    public Integer getOpCode(){
        return LoadConstant6.OpCode;
    }
    public String getAssemblyFormat() {
        return LoadConstant6.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        return exceptions;
    }
}
