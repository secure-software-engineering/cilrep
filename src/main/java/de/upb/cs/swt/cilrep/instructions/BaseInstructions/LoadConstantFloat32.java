/**
 * LoadConstantFloat32.java
 * Push num of type float32 onto the stack as F.
 *
 * @author Numan Ijaz
 * @version 1.0 8/20/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class LoadConstantFloat32 implements Instruction {
    public final static Integer OpCode = 0x22;
    public final static  String AssemblyFormat = "ldc.r4";

    public Integer num = 0; // to be changed in future

    public LoadConstantFloat32(Integer _num){
        num = _num;
    }

    public Integer getOpCode(){
        return LoadConstantFloat32.OpCode;
    }
    public String getAssemblyFormat() {
        return LoadConstantFloat32.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        return exceptions;
    }
}
