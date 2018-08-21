/**
 * LoadIntNativeFromArr.java
 * Load the element with type native int at index onto the top of
 * the stack as a native int.
 *
 * @author Numan Ijaz
 * @version 1.0 8/21/2018
 */

package de.upb.cs.swt.cilrep.instructions.ObjectModelInstructions;

import de.upb.cs.swt.cilrep.exceptions.IndexOutOfRangeException;
import de.upb.cs.swt.cilrep.exceptions.NullReferenceException;
import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class LoadIntNativeFromArr implements Instruction {
    public final static Integer OpCode = 0x97;
    public final static String AssemblyFormat = "ldelem.i";

    public Integer index = 0; // to be changed later on

    public Integer getOpCode(){
        return LoadIntNativeFromArr.OpCode;
    }
    public String getAssemblyFormat() {
        return LoadIntNativeFromArr.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(IndexOutOfRangeException.class);
        exceptions.add(NullReferenceException.class);
        return exceptions;
    }
}
