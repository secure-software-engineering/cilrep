/**
 * BranchOnFalse.java
 * Branch to target if value is zero (false).
 *
 * @author Numan Ijaz
 * @version 1.0 8/18/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;
import de.upb.cs.swt.cilrep.instructions.ParameterTypes.Int32;
import de.upb.cs.swt.cilrep.instructions.ParameterTypes.TypesBase;

import java.util.ArrayList;
import java.util.List;

public class BranchOnFalse extends Instruction {
    public final static Integer OpCode = 0x39;
    public final static String AssemblyFormat = "brfalse";

    public Integer Target = 0;

    public Integer getOpCode(){
        return BranchOnFalse.OpCode;
    }
    public String getAssemblyFormat() {
        return BranchOnFalse.AssemblyFormat;
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
