/**
 * BranchOnFalse.java
 * Branch to target if value is zero (false).
 *
 * @author Numan Ijaz
 * @version 1.0 8/18/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class BranchOnFalse implements Instruction {
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
}
