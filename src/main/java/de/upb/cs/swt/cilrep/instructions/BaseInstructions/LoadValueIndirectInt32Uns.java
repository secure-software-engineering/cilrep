/**
 * LoadValueIndirectInt32Uns.java
 * Indirect load value of type unsigned int32 as int32 on
 * the stack.
 *
 * @author Numan Ijaz
 * @version 1.0 8/21/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.exceptions.NullReferenceException;
import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class LoadValueIndirectInt32Uns implements Instruction {
    public final static Integer OpCode = 0x4B;
    public final static  String AssemblyFormat = "ldind.u4";


    public Integer getOpCode(){
        return LoadValueIndirectInt32Uns.OpCode;
    }
    public String getAssemblyFormat() {
        return LoadValueIndirectInt32Uns.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(NullReferenceException.class);
        return exceptions;
    }
}
