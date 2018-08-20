/**
 * BranchOnTrue.java
 * Branch to target if value is non-zero (true).
 *
 * @author Numan Ijaz
 * @version 1.0 8/18/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class BranchOnTrue implements Instruction {
    public final static Integer OpCode = 0x3A;
    public final static String AssemblyFormat = "brtrue";

    public Integer Target = 0;

    public Integer getOpCode(){
        return BranchOnTrue.OpCode;
    }
    public String getAssemblyFormat() {
        return BranchOnTrue.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        return new ArrayList<Class>();
    }
}
