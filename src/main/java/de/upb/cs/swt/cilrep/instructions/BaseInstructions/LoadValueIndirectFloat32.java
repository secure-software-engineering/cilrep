/**
 * LoadValueIndirectInt64.java
 * Indirect load value of type float32 as F on the stack.
 *
 * @author Numan Ijaz
 * @version 1.0 8/21/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.exceptions.NullReferenceException;
import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class LoadValueIndirectFloat32 implements Instruction {
    public final static Integer OpCode = 0x4E;
    public final static  String AssemblyFormat = "ldind.r4";


    public Integer getOpCode(){
        return LoadValueIndirectFloat32.OpCode;
    }
    public String getAssemblyFormat() {
        return LoadValueIndirectFloat32.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(NullReferenceException.class);
        return exceptions;
    }
}