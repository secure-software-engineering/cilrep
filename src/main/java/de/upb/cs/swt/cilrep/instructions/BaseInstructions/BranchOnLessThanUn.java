/**
 * BranchOnLessThanUn.java
 * Branch to target if less than (unsigned or unordered).
 *
 * @author Numan Ijaz
 * @version 1.0 8/18/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class BranchOnLessThanUn implements Instruction {
    public final static Integer OpCode = 0x44;
    public final static String AssemblyFormat = "blt.un";

    public Integer Target = 0;

    public Integer getOpCode(){
        return BranchOnLessThanUn.OpCode;
    }
    public String getAssemblyFormat() {
        return BranchOnLessThanUn.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        return new ArrayList<Class>();
    }
}
