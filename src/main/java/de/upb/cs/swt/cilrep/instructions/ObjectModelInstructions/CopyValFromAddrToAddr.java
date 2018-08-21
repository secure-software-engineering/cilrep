/**
 * CopyValFromAddrToAddr.java
 * Copy a value type from src to dest.
 *
 * @author Numan Ijaz
 * @version 1.0 8/21/2018
 */

package de.upb.cs.swt.cilrep.instructions.ObjectModelInstructions;

import de.upb.cs.swt.cilrep.exceptions.NullReferenceException;
import de.upb.cs.swt.cilrep.exceptions.TypeLoadException;
import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class CopyValFromAddrToAddr implements Instruction {
    public final static Integer OpCode = 0x70;
    public final static String AssemblyFormat = "cpobj";

    public String typeToken = ""; // to be changed later on

    public Integer getOpCode(){
        return CopyValFromAddrToAddr.OpCode;
    }
    public String getAssemblyFormat() {
        return CopyValFromAddrToAddr.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(NullReferenceException.class);
        exceptions.add(TypeLoadException.class);
        return exceptions;
    }
}
