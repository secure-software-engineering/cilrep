/**
 * StoreStaticFieldOfClass.java
 * Replace the value of field with val.
 *
 * @author Numan Ijaz
 * @version 1.0 8/22/2018
 */

package de.upb.cs.swt.cilrep.instructions.ObjectModelInstructions;

import de.upb.cs.swt.cilrep.exceptions.*;
import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class StoreStaticFieldOfClass implements Instruction {
    public final static Integer OpCode = 0x80;
    public final static String AssemblyFormat = "stsfld";

    String field = ""; // to be modified later on

    public Integer getOpCode(){
        return StoreStaticFieldOfClass.OpCode;
    }
    public String getAssemblyFormat() {
        return StoreStaticFieldOfClass.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(FieldAccessException.class);
        exceptions.add(MissingFieldException.class);
        return exceptions;
    }
}
