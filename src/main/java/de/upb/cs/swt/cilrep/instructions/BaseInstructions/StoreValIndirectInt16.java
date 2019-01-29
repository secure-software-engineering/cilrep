/**
 * StoreValIndirectInt16.java
 * Store value of type int16 into memory at address
 *
 * @author Numan Ijaz
 * @version 1.0 8/21/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.exceptions.NullReferenceException;
import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class StoreValIndirectInt16 extends Instruction {
    public final static Integer OpCode = 0x53;
    public final static  String AssemblyFormat = "stind.i2";


    public Integer getOpCode(){
        return StoreValIndirectInt16.OpCode;
    }
    public String getAssemblyFormat() {
        return StoreValIndirectInt16.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(NullReferenceException.class);
        return exceptions;
    }
}
