/**
 * Add.java
 * Add two values, returning a new value.
 *
 * @author Numan Ijaz
 * @version 1.0 8/16/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;
import java.util.ArrayList;
import java.util.List;

public class Add extends Instruction {
    public final static Integer OpCode = 0x58;
    public final static String AssemblyFormat = "add";

    public Integer getOpCode(){
        return Add.OpCode;
    }
    public String getAssemblyFormat() {
        return Add.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        return new ArrayList<Class>();
    }
}
