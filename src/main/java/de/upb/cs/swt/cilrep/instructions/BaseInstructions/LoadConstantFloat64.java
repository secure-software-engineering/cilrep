/**
 * LoadConstantInt64.java
 * Push num of type float64 onto the stack as F.
 *
 * @author Numan Ijaz
 * @version 1.0 8/20/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;
import de.upb.cs.swt.cilrep.instructions.ParameterTypes.Float64;
import de.upb.cs.swt.cilrep.instructions.ParameterTypes.TypesBase;

import java.util.ArrayList;
import java.util.List;

public class LoadConstantFloat64 extends Instruction {
    public final static Integer OpCode = 0x23;
    public final static  String AssemblyFormat = "ldc.r8";

    public Integer num = 0; // to be changed in future

    public LoadConstantFloat64(Integer _num){
        num = _num;
    }

    public Integer getOpCode(){
        return LoadConstantFloat64.OpCode;
    }
    public String getAssemblyFormat() {
        return LoadConstantFloat64.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        return exceptions;
    }

    public TypesBase getParameter(){
        if (this.parameter == null){
            this.parameter = new Float64();
        }
        return this.parameter;
    }
}
