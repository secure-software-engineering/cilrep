/**
 * BranchOnTrue.java
 * Branch to target if value is non-zero (true).
 *
 * @author Numan Ijaz
 * @version 1.0 8/18/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;
import de.upb.cs.swt.cilrep.instructions.ParameterTypes.Int32;
import de.upb.cs.swt.cilrep.instructions.ParameterTypes.Int8;
import de.upb.cs.swt.cilrep.instructions.ParameterTypes.TypesBase;

import java.util.ArrayList;
import java.util.List;

public class BranchOnTrue extends Instruction {
    public final static Integer OpCode = 0x3A;
    public final static String AssemblyFormat = "brtrue";

    public Integer Target = 0;

    public Integer getOpCode(){
        return BranchOnTrue.OpCode;
    }
    public String getAssemblyFormat() {
        return BranchOnTrue.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        return new ArrayList<Class>();
    }

    public TypesBase getParameter(){
        if (this.parameter == null){
            this.parameter = new Int32();
        }
        return this.parameter;
    }
}
