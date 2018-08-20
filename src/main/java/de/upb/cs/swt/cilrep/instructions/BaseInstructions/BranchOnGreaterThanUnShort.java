/**
 * BranchOnGreaterThanUn.java
 * Branch to target if greater than (unsigned or unordered), short form.
 *
 * @author Numan Ijaz
 * @version 1.0 8/18/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class BranchOnGreaterThanUnShort implements Instruction {
    public final static Integer OpCode = 0x35;
    public final static String AssemblyFormat = "bgt.un.s";

    public Integer Target = 0;

    public Integer getOpCode(){
        return BranchOnGreaterThanUnShort.OpCode;
    }
    public String getAssemblyFormat() {
        return BranchOnGreaterThanUnShort.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        return new ArrayList<Class>();
    }
}
