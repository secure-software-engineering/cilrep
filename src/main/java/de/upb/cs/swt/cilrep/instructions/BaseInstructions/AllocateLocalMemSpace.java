/**
 * AllocateLocalMemSpace.java
 * Allocate space from the local memory pool.
 *
 * @author Numan Ijaz
 * @version 1.0 8/21/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.exceptions.NullReferenceException;
import de.upb.cs.swt.cilrep.exceptions.StackOverflowException;
import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class AllocateLocalMemSpace extends Instruction {
    public final static Integer OpCode = 0xFE0F;
    public final static  String AssemblyFormat = "localloc";


    public Integer getOpCode(){
        return AllocateLocalMemSpace.OpCode;
    }
    public String getAssemblyFormat() {
        return AllocateLocalMemSpace.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(StackOverflowException.class);
        return exceptions;
    }
}
