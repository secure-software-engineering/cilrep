/**
 * LoadFloat32FromArr.java
 * Load the element with type float32 at index onto the top of the
 * stack as an F
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

public class LoadFloat32FromArr extends Instruction {
    public final static Integer OpCode = 0x98;
    public final static String AssemblyFormat = "ldelem.r4";

    public Integer index = 0; // to be changed later on

    public Integer getOpCode(){
        return LoadFloat32FromArr.OpCode;
    }
    public String getAssemblyFormat() {
        return LoadFloat32FromArr.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(IndexOutOfRangeException.class);
        exceptions.add(NullReferenceException.class);
        return exceptions;
    }
}
