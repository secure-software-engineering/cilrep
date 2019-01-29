/**
 * LoadConstant4.java
 * Push 4 onto the stack as int32.
 *
 * @author Numan Ijaz
 * @version 1.0 8/20/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class LoadConstant4 extends Instruction {
    public final static Integer OpCode = 0x1A;
    public final static  String AssemblyFormat = "ldc.i4.4";


    public Integer getOpCode(){
        return LoadConstant4.OpCode;
    }
    public String getAssemblyFormat() {
        return LoadConstant4.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        return exceptions;
    }
}
