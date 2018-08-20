/**
 * BranchOnGreaterThan.java
 * Branch to target if greater than.
 *
 * @author Numan Ijaz
 * @version 1.0 8/18/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class BranchOnGreaterThan implements Instruction {
    public final static Integer OpCode = 0x3D;
    public final static String AssemblyFormat = "bgt";

    public Integer Target = 0;

    public Integer getOpCode(){
        return BranchOnGreaterThan.OpCode;
    }
    public String getAssemblyFormat() {
        return BranchOnGreaterThan.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        return new ArrayList<Class>();
    }
}
