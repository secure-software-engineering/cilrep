/**
 * LoadInt64UnsFromArr.java
 * Load the element with type unsigned int64 at index onto the
 * top of the stack as an int64 (alias for ldelem.i8).
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

public class LoadInt64UnsFromArr extends Instruction {
    public final static Integer OpCode = 0x96;
    public final static String AssemblyFormat = "ldelem.u8";

    public Integer index = 0; // to be changed later on

    public Integer getOpCode(){
        return LoadInt64UnsFromArr.OpCode;
    }
    public String getAssemblyFormat() {
        return LoadInt64UnsFromArr.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(IndexOutOfRangeException.class);
        exceptions.add(NullReferenceException.class);
        return exceptions;
    }
}
