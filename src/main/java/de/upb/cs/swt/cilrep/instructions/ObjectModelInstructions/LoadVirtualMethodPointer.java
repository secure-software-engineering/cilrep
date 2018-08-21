/**
 * LoadVirtualMethodPointer.java
 * Push address of virtual method method on the stack.
 *
 * @author Numan Ijaz
 * @version 1.0 8/22/2018
 */

package de.upb.cs.swt.cilrep.instructions.ObjectModelInstructions;

import de.upb.cs.swt.cilrep.exceptions.MethodAccessException;
import de.upb.cs.swt.cilrep.exceptions.NullReferenceException;
import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class LoadVirtualMethodPointer implements Instruction {
    public final static Integer OpCode = 0xFE07;
    public final static String AssemblyFormat = "ldvirtftn";

    public String method = ""; // to be changed later on

    public Integer getOpCode(){
        return LoadVirtualMethodPointer.OpCode;
    }
    public String getAssemblyFormat() {
        return LoadVirtualMethodPointer.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(MethodAccessException.class);
        exceptions.add(NullReferenceException.class);
        return exceptions;
    }
}
