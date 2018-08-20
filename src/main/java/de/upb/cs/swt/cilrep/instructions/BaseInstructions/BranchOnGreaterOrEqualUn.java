/**
 * BranchOnGreaterOrEqualUn.java
 * Branch to target if greater than or equal to (unsigned or unordered).
 *
 * @author Numan Ijaz
 * @version 1.0 8/18/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class BranchOnGreaterOrEqualUn implements Instruction {
    public final static Integer OpCode = 0x41;
    public final static String AssemblyFormat = "bge.un";

    public Integer Target = 0;

    public Integer getOpCode(){
        return BranchOnGreaterOrEqualUn.OpCode;
    }
    public String getAssemblyFormat() {
        return BranchOnGreaterOrEqualUn.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        return new ArrayList<Class>();
    }
}
