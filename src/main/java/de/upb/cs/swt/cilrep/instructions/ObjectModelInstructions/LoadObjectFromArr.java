/**
 * LoadObjectFromArr.java
 * Load the element at index onto the top of the stack as an O.
 * The type of the O is the same as the element type of the array
 * pushed on the CIL stack.
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

public class LoadObjectFromArr implements Instruction {
    public final static Integer OpCode = 0x9A;
    public final static String AssemblyFormat = "ldelem.ref";

    public Integer index = 0; // to be changed later on

    public Integer getOpCode(){
        return LoadObjectFromArr.OpCode;
    }
    public String getAssemblyFormat() {
        return LoadObjectFromArr.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(IndexOutOfRangeException.class);
        exceptions.add(NullReferenceException.class);
        return exceptions;
    }
}
