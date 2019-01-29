/**
 * LoadValueIndirectInt8.java
 * Indirect load value of type int8 as int32 on the stack.
 *
 * @author Numan Ijaz
 * @version 1.0 8/21/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.exceptions.NullReferenceException;
import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class LoadValueIndirectInt8 extends Instruction {
    public final static Integer OpCode = 0x46;
    public final static  String AssemblyFormat = "ldind.i1";


    public Integer getOpCode(){
        return LoadValueIndirectInt8.OpCode;
    }
    public String getAssemblyFormat() {
        return LoadValueIndirectInt8.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(NullReferenceException.class);
        return exceptions;
    }
}
