/**
 * Call.java
 * Call method described by method.
 *
 * @author Numan Ijaz
 * @version 1.0 8/20/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.exceptions.MethodAccessException;
import de.upb.cs.swt.cilrep.exceptions.MissingMethodException;
import de.upb.cs.swt.cilrep.exceptions.SecurityException;
import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class Call implements Instruction {
    final Integer OpCode = 0x28;
    final String AssemblyFormat = "call";

    public String method = ""; // to be replaced later on

    public Integer getOpCode(){
        return this.OpCode;
    }
    public String getAssemblyFormat() {
        return this.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        ArrayList<Class> exceptions =  new ArrayList<>();
        exceptions.add(SecurityException.class);
        exceptions.add(MethodAccessException.class);
        exceptions.add(MissingMethodException.class);
        return exceptions;
    }
}
