/**
 * BranchOnZero.java
 * Branch to target if value is zero (alias for brfalse).
 *
 * @author Numan Ijaz
 * @version 1.0 8/18/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class BranchOnZero implements Instruction {
    public final static Integer OpCode = 0x39;
    public final static String AssemblyFormat = "brzero";

    public Integer Target = 0;

    public Integer getOpCode(){
        return BranchOnZero.OpCode;
    }
    public String getAssemblyFormat() {
        return BranchOnZero.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        return new ArrayList<Class>();
    }
}
