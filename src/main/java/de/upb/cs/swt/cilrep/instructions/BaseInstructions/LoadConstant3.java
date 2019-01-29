/**
 * LoadConstant3.java
 * Push 3 onto the stack as int32.
 *
 * @author Numan Ijaz
 * @version 1.0 8/20/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class LoadConstant3 extends Instruction {
    public final static Integer OpCode = 0x19;
    public final static  String AssemblyFormat = "ldc.i4.3";


    public Integer getOpCode(){
        return LoadConstant3.OpCode;
    }
    public String getAssemblyFormat() {
        return LoadConstant3.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        return exceptions;
    }
}
