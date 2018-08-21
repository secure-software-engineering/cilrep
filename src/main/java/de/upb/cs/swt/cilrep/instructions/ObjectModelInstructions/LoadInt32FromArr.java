/**
 * LoadInt32FromArr.java
 * Load the element with type int32 at index onto the top of the
 * stack as an int32.
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

public class LoadInt32FromArr implements Instruction {
    public final static Integer OpCode = 0x94;
    public final static String AssemblyFormat = "ldelem.i4";

    public Integer index = 0; // to be changed later on

    public Integer getOpCode(){
        return LoadInt32FromArr.OpCode;
    }
    public String getAssemblyFormat() {
        return LoadInt32FromArr.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(IndexOutOfRangeException.class);
        exceptions.add(NullReferenceException.class);
        return exceptions;
    }
}
