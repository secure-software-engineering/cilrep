/**
 * AddOverflow.java
 * Add signed integer values with overflow check.
 *
 * @author Numan Ijaz
 * @version 1.0 8/18/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.exceptions.*;
import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class AddOverflow implements Instruction {
    public final static Integer OpCode = 0xD6;
    public final static String AssemblyFormat = "add.ovf";

    public Integer getOpCode(){
        return AddOverflow.OpCode;
    }
    public String getAssemblyFormat() {
        return AddOverflow.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        ArrayList<Class> exceptions =  new ArrayList<>();
        exceptions.add(OverflowException.class);
        return exceptions;
    }
}
