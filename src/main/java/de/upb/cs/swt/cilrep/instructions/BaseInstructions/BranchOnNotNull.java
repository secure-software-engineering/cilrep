/**
 * BranchOnNotNull.java
 * Branch to target if value is a non-null object reference (alias for
 * brtrue).
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

public class BranchOnNotNull extends Instruction {
    public final static Integer OpCode = 0x3A;
    public final static String AssemblyFormat = "brinst";

    public Integer Target = 0;

    public Integer getOpCode(){
        return BranchOnNotNull.OpCode;
    }
    public String getAssemblyFormat() {
        return BranchOnNotNull.AssemblyFormat;
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
