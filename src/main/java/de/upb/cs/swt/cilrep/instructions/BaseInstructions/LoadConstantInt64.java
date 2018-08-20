/**
 * LoadConstantInt64.java
 * Push num of type int64 onto the stack as int64.
 *
 * @author Numan Ijaz
 * @version 1.0 8/20/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class LoadConstantInt64 implements Instruction {
    public final static Integer OpCode = 0x21;
    public final static  String AssemblyFormat = "ldc.i8";

    public Integer num = 0; // to be changed in future

    public LoadConstantInt64(Integer _num){
        num = _num;
    }

    public Integer getOpCode(){
        return LoadConstantInt64.OpCode;
    }
    public String getAssemblyFormat() {
        return LoadConstantInt64.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        return exceptions;
    }
}
