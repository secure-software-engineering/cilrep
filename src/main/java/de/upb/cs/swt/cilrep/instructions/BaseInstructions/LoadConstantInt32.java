/**
 * LoadConstantInt32.java
 * Push num of type int32 onto the stack as int32.
 *
 * @author Numan Ijaz
 * @version 1.0 8/20/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;
import de.upb.cs.swt.cilrep.instructions.ParameterTypes.Int32;
import de.upb.cs.swt.cilrep.instructions.ParameterTypes.TypesBase;

import java.util.ArrayList;
import java.util.List;

public class LoadConstantInt32 extends Instruction {
    public final static Integer OpCode = 0x20;
    public final static  String AssemblyFormat = "ldc.i4";

    public Integer num = 0; // to be changed in future

    public LoadConstantInt32(Integer _num){
        num = _num;
    }

    public Integer getOpCode(){
        return LoadConstantInt32.OpCode;
    }
    public String getAssemblyFormat() {
        return LoadConstantInt32.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        return exceptions;
    }

    public TypesBase getParameter(){
        if (this.parameter == null){
            this.parameter = new Int32();
        }
        return this.parameter;
    }
}
