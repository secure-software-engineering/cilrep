/**
 * BranchOnLessOrEqual.java
 * Branch to target if less than or equal to.
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

public class BranchOnLessOrEqual extends Instruction {
    public final static Integer OpCode = 0x3E;
    public final static String AssemblyFormat = "ble";

    public Integer Target = 0;

    public Integer getOpCode(){
        return BranchOnLessOrEqual.OpCode;
    }
    public String getAssemblyFormat() {
        return BranchOnLessOrEqual.AssemblyFormat;
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
