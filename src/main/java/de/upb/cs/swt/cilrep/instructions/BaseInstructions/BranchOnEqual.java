/**
 * BranchOnEqual.java
 * Branch to target if equal.
 *
 * @author Numan Ijaz
 * @version 1.0 8/18/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class BranchOnEqual implements Instruction {
    public final static Integer OpCode = 0x3B;
    public final static String AssemblyFormat = "beq";

    public Integer Target = 0;

    public Integer getOpCode(){
        return BranchOnEqual.OpCode;
    }
    public String getAssemblyFormat() {
        return BranchOnEqual.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        return new ArrayList<Class>();
    }
}
