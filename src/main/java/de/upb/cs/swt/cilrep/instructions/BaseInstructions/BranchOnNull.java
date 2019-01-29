/**
 * BranchOnNull.java
 * Branch to target if value is null (alias for brfalse).
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

public class BranchOnNull extends Instruction {
    public final static Integer OpCode = 0x39;
    public final static String AssemblyFormat = "brnull";

    public Integer Target = 0;

    public Integer getOpCode(){
        return BranchOnNull.OpCode;
    }
    public String getAssemblyFormat() {
        return BranchOnNull.AssemblyFormat;
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
