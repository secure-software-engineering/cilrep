/**
 * BranchOnNull.java
 * Branch to target if value is null (alias for brfalse).
 *
 * @author Numan Ijaz
 * @version 1.0 8/18/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class BranchOnNull implements Instruction {
    public final static Integer OpCode = 0x39;
    public final static String AssemblyFormat = "brnull.s";

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
}
