/**
 * BreakPoint.java
 * Inform a debugger that a breakpoint has been reached.
 *
 * @author Numan Ijaz
 * @version 1.0 8/18/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class BreakPoint extends Instruction {
    public final static Integer OpCode = 0x01;
    public final static String AssemblyFormat = "break";

    public Integer getOpCode(){
        return BreakPoint.OpCode;
    }
    public String getAssemblyFormat() {
        return BreakPoint.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        return new ArrayList<Class>();
    }
}
