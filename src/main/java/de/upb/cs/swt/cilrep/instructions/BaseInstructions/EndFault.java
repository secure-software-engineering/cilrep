/**
 * EndFault.java
 * End fault clause of an exception block.
 *
 * @author Numan Ijaz
 * @version 1.0 8/20/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class EndFault extends Instruction {
    public final static Integer OpCode = 0xDC;
    public final static String AssemblyFormat = "endfault";


    public Integer getOpCode(){
        return EndFault.OpCode;
    }
    public String getAssemblyFormat() {
        return EndFault.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        return exceptions;
    }
}
