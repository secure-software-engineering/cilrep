/**
 * LoadStaticFieldAddress.java
 * Push the address of the static field, field, on the stack.
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

public class LoadStaticFieldAddress implements Instruction {
    public final static Integer OpCode = 0x7F;
    public final static String AssemblyFormat = "ldsflda";

    public String field = ""; // to be changed later on

    public Integer getOpCode(){
        return LoadStaticFieldAddress.OpCode;
    }
    public String getAssemblyFormat() {
        return LoadStaticFieldAddress.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(FieldAccessException.class);
        exceptions.add(MissingFieldException.class);
        return exceptions;
    }
}
