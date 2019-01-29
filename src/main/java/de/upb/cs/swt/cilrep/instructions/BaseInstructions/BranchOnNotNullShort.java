/**
 * BranchOnNotNullShort.java
 * Branch to target if value is a non-null object reference, short form
 * (alias for brtrue.s).
 *
 * @author Numan Ijaz
 * @version 1.0 8/18/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;
import de.upb.cs.swt.cilrep.instructions.ParameterTypes.Int8;
import de.upb.cs.swt.cilrep.instructions.ParameterTypes.TypesBase;

import java.util.ArrayList;
import java.util.List;

public class BranchOnNotNullShort extends Instruction {
    public final static Integer OpCode = 0x2D;
    public final static String AssemblyFormat = "brinst.s";

    public Integer Target = 0;

    public Integer getOpCode(){
        return BranchOnNotNullShort.OpCode;
    }
    public String getAssemblyFormat() {
        return BranchOnNotNullShort.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        return new ArrayList<Class>();
    }

    public TypesBase getParameter(){
        if (this.parameter == null){
            this.parameter = new Int8();
        }
        return this.parameter;
    }
}
