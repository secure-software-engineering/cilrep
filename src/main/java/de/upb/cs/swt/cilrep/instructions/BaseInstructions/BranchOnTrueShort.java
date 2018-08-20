/**
 * BranchOnTrueShort.java
 * Branch to target if value is non-zero (true), short form
 *
 * @author Numan Ijaz
 * @version 1.0 8/18/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class BranchOnTrueShort implements Instruction {
    public final static Integer OpCode = 0x2D;
    public final static String AssemblyFormat = "brtrue.s";

    public Integer Target = 0;

    public Integer getOpCode(){
        return BranchOnTrueShort.OpCode;
    }
    public String getAssemblyFormat() {
        return BranchOnTrueShort.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        return new ArrayList<Class>();
    }
}
