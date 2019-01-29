/**
 * LoadInt8UnsFromArr.java
 * Load the element with type unsigned int8 at index onto the top
 * of the stack as an int32.
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

public class LoadInt8UnsFromArr extends Instruction {
    public final static Integer OpCode = 0x91;
    public final static String AssemblyFormat = "ldelem.u1";

    public Integer index = 0; // to be changed later on

    public Integer getOpCode(){
        return LoadInt8UnsFromArr.OpCode;
    }
    public String getAssemblyFormat() {
        return LoadInt8UnsFromArr.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(IndexOutOfRangeException.class);
        exceptions.add(NullReferenceException.class);
        return exceptions;
    }
}
