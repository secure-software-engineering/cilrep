/**
 * LoadFieldOfObject.java
 * Push the value of field of object (or value type) obj, onto the stack.
 *
 * @author Numan Ijaz
 * @version 1.0 8/21/2018
 */

package de.upb.cs.swt.cilrep.instructions.ObjectModelInstructions;

import de.upb.cs.swt.cilrep.exceptions.*;
import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class LoadFieldOfObject implements Instruction {
    public final static Integer OpCode = 0x7B;
    public final static String AssemblyFormat = "ldfld";

    public String field = ""; // to be changed later on

    public Integer getOpCode(){
        return LoadFieldOfObject.OpCode;
    }
    public String getAssemblyFormat() {
        return LoadFieldOfObject.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(FieldAccessException.class);
        exceptions.add(MissingFieldException.class);
        exceptions.add(NullReferenceException.class);
        return exceptions;
    }
}
