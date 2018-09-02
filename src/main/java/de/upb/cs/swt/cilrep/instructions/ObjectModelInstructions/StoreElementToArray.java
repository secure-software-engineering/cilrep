/**
 * StoreElementToArray.java
 * Replace array element at index with the value on the stack
 *
 * @author Numan Ijaz
 * @version 1.0 8/22/2018
 */

package de.upb.cs.swt.cilrep.instructions.ObjectModelInstructions;

import de.upb.cs.swt.cilrep.exceptions.*;
import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class StoreElementToArray implements Instruction {
    public final static Integer OpCode = 0xA4;
    public final static String AssemblyFormat = "stelem";

    String typeToken = ""; // to be modified later on

    public Integer getOpCode(){
        return StoreElementToArray.OpCode;
    }
    public String getAssemblyFormat() {
        return StoreElementToArray.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(NullReferenceException.class);
        exceptions.add(IndexOutOfRangeException.class);
        exceptions.add(ArrayTypeMismatchException.class);
        return exceptions;
    }
}
