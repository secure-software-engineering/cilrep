/**
 * LoadFieldAddress.java
 * Push the address of field of object obj on the stack.
 *
 * @author Numan Ijaz
 * @version 1.0 8/22/2018
 */

package de.upb.cs.swt.cilrep.instructions.ObjectModelInstructions;

import de.upb.cs.swt.cilrep.exceptions.FieldAccessException;
import de.upb.cs.swt.cilrep.exceptions.InvalidOperationException;
import de.upb.cs.swt.cilrep.exceptions.MissingFieldException;
import de.upb.cs.swt.cilrep.exceptions.NullReferenceException;
import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class LoadFieldAddress extends Instruction {
    public final static Integer OpCode = 0x7C;
    public final static String AssemblyFormat = "ldflda";

    public String field = ""; // to be changed later on

    public Integer getOpCode(){
        return LoadFieldAddress.OpCode;
    }
    public String getAssemblyFormat() {
        return LoadFieldAddress.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(FieldAccessException.class);
        exceptions.add(MissingFieldException.class);
        exceptions.add(NullReferenceException.class);
        exceptions.add(InvalidOperationException.class);
        return exceptions;
    }
}
