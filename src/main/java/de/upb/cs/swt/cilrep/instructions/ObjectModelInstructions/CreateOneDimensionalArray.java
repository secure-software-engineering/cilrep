/**
 * LoadVirtualMethodPointer.java
 * Create a new array with elements of type etype.
 *
 * @author Numan Ijaz
 * @version 1.0 8/22/2018
 */

package de.upb.cs.swt.cilrep.instructions.ObjectModelInstructions;

import de.upb.cs.swt.cilrep.exceptions.OutOfMemoryException;
import de.upb.cs.swt.cilrep.exceptions.OverflowException;
import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class CreateOneDimensionalArray implements Instruction {
    public final static Integer OpCode = 0x8D;
    public final static String AssemblyFormat = "newarr";

    public String type = ""; // to be changed later on

    public Integer getOpCode(){
        return CreateOneDimensionalArray.OpCode;
    }
    public String getAssemblyFormat() {
        return CreateOneDimensionalArray.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(OutOfMemoryException.class);
        exceptions.add(OverflowException.class);
        return exceptions;
    }
}
