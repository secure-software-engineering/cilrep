/**
 * LoadValueIndirectObject.java
 * Indirect load value of type object ref as O on the stack.
 *
 * @author Numan Ijaz
 * @version 1.0 8/21/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.exceptions.NullReferenceException;
import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class LoadValueIndirectObject extends Instruction {
    public final static Integer OpCode = 0x50;
    public final static  String AssemblyFormat = "ldind.ref";


    public Integer getOpCode(){
        return LoadValueIndirectObject.OpCode;
    }
    public String getAssemblyFormat() {
        return LoadValueIndirectObject.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(NullReferenceException.class);
        return exceptions;
    }
}
