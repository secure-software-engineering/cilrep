/**
 * LoadConstantInt32Short.java
 * Push num onto the stack as int32, short form.
 *
 * @author Numan Ijaz
 * @version 1.0 8/20/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class LoadConstantInt32Short implements Instruction {
    public final static Integer OpCode = 0x1F;
    public final static  String AssemblyFormat = "ldc.i4.s";

    public Integer num = 0; // to be changed in future

    public LoadConstantInt32Short(Integer _num){
        num = _num;
    }

    public Integer getOpCode(){
        return LoadConstantInt32Short.OpCode;
    }
    public String getAssemblyFormat() {
        return LoadConstantInt32Short.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        return exceptions;
    }
}
