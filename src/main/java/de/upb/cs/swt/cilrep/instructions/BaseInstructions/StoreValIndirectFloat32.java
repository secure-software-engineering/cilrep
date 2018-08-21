/**
 * StoreValIndirectFloat32.java
 * Store value of type float32 into memory at address
 *
 * @author Numan Ijaz
 * @version 1.0 8/21/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.exceptions.NullReferenceException;
import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class StoreValIndirectFloat32 implements Instruction {
    public final static Integer OpCode = 0x56;
    public final static  String AssemblyFormat = "stind.r4";


    public Integer getOpCode(){
        return StoreValIndirectFloat32.OpCode;
    }
    public String getAssemblyFormat() {
        return StoreValIndirectFloat32.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(NullReferenceException.class);
        return exceptions;
    }
}
