/**
 * LoadStaticField.java
 * Push the value of field on the stack.
 *
 * @author Numan Ijaz
 * @version 1.0 8/22/2018
 */

package de.upb.cs.swt.cilrep.instructions.ObjectModelInstructions;

import de.upb.cs.swt.cilrep.exceptions.FieldAccessException;
import de.upb.cs.swt.cilrep.exceptions.MissingFieldException;
import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class LoadStaticField implements Instruction {
    public final static Integer OpCode = 0x7E;
    public final static String AssemblyFormat = "ldsfld";

    public String field = ""; // to be changed later on

    public Integer getOpCode(){
        return LoadStaticField.OpCode;
    }
    public String getAssemblyFormat() {
        return LoadStaticField.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(FieldAccessException.class);
        exceptions.add(MissingFieldException.class);
        return exceptions;
    }
}
