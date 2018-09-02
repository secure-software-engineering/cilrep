/**
 * LoadSizeOfTypeInBytes.java
 * Push the size, in bytes, of a type as an unsigned int32.
 *
 * @author Numan Ijaz
 * @version 1.0 8/22/2018
 */

package de.upb.cs.swt.cilrep.instructions.ObjectModelInstructions;

import de.upb.cs.swt.cilrep.exceptions.InvalidCastException;
import de.upb.cs.swt.cilrep.exceptions.TypeLoadException;
import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class LoadSizeOfTypeInBytes implements Instruction {
    public final static Integer OpCode = 0xFE1C;
    public final static String AssemblyFormat = "sizeof";

    String typeToken = "";

    public Integer getOpCode(){
        return LoadSizeOfTypeInBytes.OpCode;
    }
    public String getAssemblyFormat() {
        return LoadSizeOfTypeInBytes.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(InvalidCastException.class);
        exceptions.add(TypeLoadException.class);
        return exceptions;
    }
}
