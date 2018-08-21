/**
 * NoOperation.java
 * Do nothing.
 *
 * @author Numan Ijaz
 * @version 1.0 8/21/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class NoOperation implements Instruction {
    public final static Integer OpCode = 0x00;
    public final static  String AssemblyFormat = "Nop";


    public Integer getOpCode(){
        return NoOperation.OpCode;
    }
    public String getAssemblyFormat() {
        return NoOperation.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        return exceptions;
    }
}
