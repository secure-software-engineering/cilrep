/**
 * StoreValIndirectInt8.java
 * Store value of type object ref (type O) into memory at address
 *
 * @author Numan Ijaz
 * @version 1.0 8/21/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.exceptions.NullReferenceException;
import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class StoreValIndirectObject implements Instruction {
    public final static Integer OpCode = 0x51;
    public final static  String AssemblyFormat = "stind.ref";


    public Integer getOpCode(){
        return StoreValIndirectObject.OpCode;
    }
    public String getAssemblyFormat() {
        return StoreValIndirectObject.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(NullReferenceException.class);
        return exceptions;
    }
}
