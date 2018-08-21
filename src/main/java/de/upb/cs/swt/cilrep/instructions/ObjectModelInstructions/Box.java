/**
 * Box.java
 * Convert a boxable value to its boxed form
 *
 * @author Numan Ijaz
 * @version 1.0 8/21/2018
 */

package de.upb.cs.swt.cilrep.instructions.ObjectModelInstructions;

import de.upb.cs.swt.cilrep.exceptions.OutOfMemoryException;
import de.upb.cs.swt.cilrep.exceptions.TypeLoadException;
import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class Box implements Instruction {
    public final static Integer OpCode = 0x8C;
    public final static String AssemblyFormat = "box";

    public String typeToken = ""; // to be changed later on

    public Integer getOpCode(){
        return Box.OpCode;
    }
    public String getAssemblyFormat() {
        return Box.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(OutOfMemoryException.class);
        exceptions.add(TypeLoadException.class);
        return exceptions;
    }
}
