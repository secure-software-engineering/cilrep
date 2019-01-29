/**
 * StoreArrElementInt16.java
 * Replace array element at index with the int16 value on the
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

public class StoreArrElementInt16 extends Instruction {
    public final static Integer OpCode = 0x9D;
    public final static String AssemblyFormat = "stelem.i2";

    Integer index = 0; // to be modified later on

    public Integer getOpCode(){
        return StoreArrElementInt16.OpCode;
    }
    public String getAssemblyFormat() {
        return StoreArrElementInt16.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(NullReferenceException.class);
        exceptions.add(IndexOutOfRangeException.class);
        exceptions.add(ArrayTypeMismatchException.class);
        return exceptions;
    }
}
