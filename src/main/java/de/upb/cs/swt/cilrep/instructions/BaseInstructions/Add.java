/**
 * Add.java
 * Add two values, returning a new value.
 *
 * @author Numan Ijaz
 * @version 1.0 8/16/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.exceptions.IException;
import de.upb.cs.swt.cilrep.instructions.Instruction;
import java.util.ArrayList;
import java.util.List;

public class Add implements Instruction {
    final Integer OpCode = 0x58;
    final String AssemblyFormat = "add";

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