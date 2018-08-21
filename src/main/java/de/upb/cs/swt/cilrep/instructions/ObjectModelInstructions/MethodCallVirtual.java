/**
 * MethodCallVirtual.java
 * Call a method associated with an object.
 *
 * @author Numan Ijaz
 * @version 1.0 8/21/2018
 */

package de.upb.cs.swt.cilrep.instructions.ObjectModelInstructions;

import de.upb.cs.swt.cilrep.exceptions.*;
import de.upb.cs.swt.cilrep.exceptions.SecurityException;
import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class MethodCallVirtual implements Instruction {
    public final static Integer OpCode = 0x6F;
    public final static String AssemblyFormat = "callvirt";

    public String method = ""; // to be changed later on

    public Integer getOpCode(){
        return MethodCallVirtual.OpCode;
    }
    public String getAssemblyFormat() {
        return MethodCallVirtual.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(MethodAccessException.class);
        exceptions.add(MissingMethodException.class);
        exceptions.add(SecurityException.class);
        exceptions.add(NullReferenceException.class);
        return exceptions;
    }
}
