/**
 * BranchOnLessOrEqualUn.java
 * Branch to target if less than or equal to (unsigned or unordered).
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

public class BranchOnLessOrEqualUn extends Instruction {
    public final static Integer OpCode = 0x43;
    public final static String AssemblyFormat = "ble.un";

    public Integer Target = 0;

    public Integer getOpCode(){
        return BranchOnLessOrEqualUn.OpCode;
    }
    public String getAssemblyFormat() {
        return BranchOnLessOrEqualUn.AssemblyFormat;
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
