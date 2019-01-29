/**
 * StoreValIndirectInt64.java
 * Store value of type int64 into memory at address
 *
 * @author Numan Ijaz
 * @version 1.0 8/21/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.exceptions.NullReferenceException;
import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class StoreValIndirectInt64 extends Instruction {
    public final static Integer OpCode = 0x55;
    public final static  String AssemblyFormat = "stind.i8";


    public Integer getOpCode(){
        return StoreValIndirectInt64.OpCode;
    }
    public String getAssemblyFormat() {
        return StoreValIndirectInt64.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(NullReferenceException.class);
        return exceptions;
    }
}
