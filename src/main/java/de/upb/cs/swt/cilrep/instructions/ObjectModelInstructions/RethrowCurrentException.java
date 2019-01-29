/**
 * RethrowCurrentException.java
 * Rethrow the current exception.
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

public class RethrowCurrentException extends Instruction {
    public final static Integer OpCode = 0xFE1A;
    public final static String AssemblyFormat = "rethrow";

    String type = "";

    public Integer getOpCode(){
        return RethrowCurrentException.OpCode;
    }
    public String getAssemblyFormat() {
        return RethrowCurrentException.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(InvalidCastException.class);
        exceptions.add(TypeLoadException.class);
        return exceptions;
    }
}
