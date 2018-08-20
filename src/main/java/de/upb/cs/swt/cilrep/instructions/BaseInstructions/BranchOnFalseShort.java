/**
 * BranchOnFalseShort.java
 * Branch to target if value is zero (false), short form.
 *
 * @author Numan Ijaz
 * @version 1.0 8/18/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class BranchOnFalseShort implements Instruction {
    public final static Integer OpCode = 0x2C;
    public final static String AssemblyFormat = "brfalse.s";

    public Integer Target = 0;

    public Integer getOpCode(){
        return BranchOnFalseShort.OpCode;
    }
    public String getAssemblyFormat() {
        return BranchOnFalseShort.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        return new ArrayList<Class>();
    }
}
