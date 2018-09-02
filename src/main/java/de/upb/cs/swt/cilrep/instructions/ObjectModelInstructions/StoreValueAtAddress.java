/**
 * StoreValueAtAddress.java
 * Store a value of type typeTok at an address.
 *
 * @author Numan Ijaz
 * @version 1.0 8/22/2018
 */

package de.upb.cs.swt.cilrep.instructions.ObjectModelInstructions;

import de.upb.cs.swt.cilrep.exceptions.ArrayTypeMismatchException;
import de.upb.cs.swt.cilrep.exceptions.IndexOutOfRangeException;
import de.upb.cs.swt.cilrep.exceptions.NullReferenceException;
import de.upb.cs.swt.cilrep.exceptions.TypeLoadException;
import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class StoreValueAtAddress implements Instruction {
    public final static Integer OpCode = 0x81;
    public final static String AssemblyFormat = "stobj";

    String typeToken = ""; // to be modified later on

    public Integer getOpCode(){
        return StoreValueAtAddress.OpCode;
    }
    public String getAssemblyFormat() {
        return StoreValueAtAddress.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(NullReferenceException.class);
        exceptions.add(TypeLoadException.class);
        return exceptions;
    }
}
