/**
 * StoreValIndirectInt8.java
 * Store value of type int8 into memory at address
 *
 * @author Numan Ijaz
 * @version 1.0 8/21/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.exceptions.NullReferenceException;
import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class StoreValIndirectInt8 extends Instruction {
    public final static Integer OpCode = 0x52;
    public final static  String AssemblyFormat = "stind.i1";


    public Integer getOpCode(){
        return StoreValIndirectInt8.OpCode;
    }
    public String getAssemblyFormat() {
        return StoreValIndirectInt8.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(NullReferenceException.class);
        return exceptions;
    }
}
