/**
 * LoadValueIndirectInt64Uns.java
 * Indirect load value of type unsigned int64 as int64 on
 * the stack (alias for ldind.i8).
 *
 * @author Numan Ijaz
 * @version 1.0 8/21/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.exceptions.NullReferenceException;
import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class LoadValueIndirectInt64Uns implements Instruction {
    public final static Integer OpCode = 0x4C;
    public final static  String AssemblyFormat = "ldind.u8";


    public Integer getOpCode(){
        return LoadValueIndirectInt64Uns.OpCode;
    }
    public String getAssemblyFormat() {
        return LoadValueIndirectInt64Uns.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(NullReferenceException.class);
        return exceptions;
    }
}
