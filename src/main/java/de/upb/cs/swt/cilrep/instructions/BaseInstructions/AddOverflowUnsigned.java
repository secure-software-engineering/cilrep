/**
 * AddOverflowUnsigned.java
 * Add unsigned integer values with overflow check
 *
 * @author Numan Ijaz
 * @version 1.0 8/18/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.exceptions.OverflowException;
import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class AddOverflowUnsigned implements Instruction {
    public final static Integer OpCode = 0xD7;
    public final static String AssemblyFormat = "add.ovf.un";

    public Integer getOpCode(){
        return AddOverflowUnsigned.OpCode;
    }
    public String getAssemblyFormat() {
        return AddOverflowUnsigned.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        ArrayList<Class> exceptions =  new ArrayList<>();
        exceptions.add(OverflowException.class);
        return exceptions;
    }
}
