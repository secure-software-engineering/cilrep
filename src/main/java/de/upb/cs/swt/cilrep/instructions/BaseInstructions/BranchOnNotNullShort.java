/**
 * BranchOnNotNullShort.java
 * Branch to target if value is a non-null object reference, short form
 * (alias for brtrue.s).
 *
 * @author Numan Ijaz
 * @version 1.0 8/18/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class BranchOnNotNullShort implements Instruction {
    final Integer OpCode = 0x2D;
    final String AssemblyFormat = "brinst.s";

    public Integer Target = 0;

    public Integer getOpCode(){
        return this.OpCode;
    }
    public String getAssemblyFormat() {
        return this.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        return new ArrayList<Class>();
    }
}