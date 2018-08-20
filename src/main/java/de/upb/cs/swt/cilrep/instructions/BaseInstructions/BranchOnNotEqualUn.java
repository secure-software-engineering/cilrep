/**
 * BranchOnNotEqualUn.java
 * Branch to target if unequal or unordered.
 *
 * @author Numan Ijaz
 * @version 1.0 8/18/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class BranchOnNotEqualUn implements Instruction {
    public final static Integer OpCode = 0x40;
    public final static String AssemblyFormat = "bne.un";

    public Integer Target = 0;

    public Integer getOpCode(){
        return BranchOnNotEqualUn.OpCode;
    }
    public String getAssemblyFormat() {
        return BranchOnNotEqualUn.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        return new ArrayList<Class>();
    }
}
