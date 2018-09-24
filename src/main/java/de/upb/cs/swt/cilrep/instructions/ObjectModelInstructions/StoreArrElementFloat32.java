/**
 * StoreArrElementFloat32.java
 * Replace array element at index with the float32 value on the
 * stack.
 *
 * @author Numan Ijaz
 * @version 1.0 8/22/2018
 */

package de.upb.cs.swt.cilrep.instructions.ObjectModelInstructions;

import de.upb.cs.swt.cilrep.exceptions.ArrayTypeMismatchException;
import de.upb.cs.swt.cilrep.exceptions.IndexOutOfRangeException;
import de.upb.cs.swt.cilrep.exceptions.NullReferenceException;
import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class StoreArrElementFloat32 implements Instruction {
    public final static Integer OpCode = 0xA0;
    public final static String AssemblyFormat = "stelem.r4";

    Integer index = 0; // to be modified later on

    public Integer getOpCode(){
        return StoreArrElementFloat32.OpCode;
    }
    public String getAssemblyFormat() {
        return StoreArrElementFloat32.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(NullReferenceException.class);
        exceptions.add(IndexOutOfRangeException.class);
        exceptions.add(ArrayTypeMismatchException.class);
        return exceptions;
    }
}