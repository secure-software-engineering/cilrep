/**
 * CastClass.java
 * Cast obj to typeTok.
 *
 * @author Numan Ijaz
 * @version 1.0 8/21/2018
 */

package de.upb.cs.swt.cilrep.instructions.ObjectModelInstructions;

import de.upb.cs.swt.cilrep.exceptions.TypeLoadException;
import de.upb.cs.swt.cilrep.exceptions.InvalidCastException;
import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class CastClass implements Instruction {
    public final static Integer OpCode = 0x74;
    public final static String AssemblyFormat = "castclass";

    public String typeToken = ""; // to be changed later on

    public Integer getOpCode(){
        return CastClass.OpCode;
    }
    public String getAssemblyFormat() {
        return CastClass.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(TypeLoadException.class);
        exceptions.add(InvalidCastException.class);
        return exceptions;
    }
}
