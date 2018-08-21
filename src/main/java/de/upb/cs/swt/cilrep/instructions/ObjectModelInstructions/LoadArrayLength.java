/**
 * LoadArrayLength.java
 * Push the length (of type native unsigned int) of array on the
 * stack.
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

public class LoadArrayLength implements Instruction {
    public final static Integer OpCode = 0x8E;
    public final static String AssemblyFormat = "ldlen";

    public String field = ""; // to be changed later on

    public Integer getOpCode(){
        return LoadArrayLength.OpCode;
    }
    public String getAssemblyFormat() {
        return LoadArrayLength.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(NullReferenceException.class);
        return exceptions;
    }
}
