/**
 * LoadMethodPointer.java
 * Push a pointer to a method referenced by method, on the stack.
 *
 * @author Numan Ijaz
 * @version 1.0 8/21/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.exceptions.MethodAccessException;
import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class LoadMethodPointer implements Instruction {
    public final static Integer OpCode = 0xFE06;
    public final static  String AssemblyFormat = "ldftn";

    public String method = ""; // to be changed in future

    public Integer getOpCode(){
        return LoadMethodPointer.OpCode;
    }
    public String getAssemblyFormat() {
        return LoadMethodPointer.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(MethodAccessException.class);
        return exceptions;
    }
}
