/**
 * StoreValIndirectInt8.java
 * Store value of type native int into memory at address
 *
 * @author Numan Ijaz
 * @version 1.0 8/21/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.exceptions.NullReferenceException;
import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class StoreValIndirectIntNative implements Instruction {
    public final static Integer OpCode = 0xDF;
    public final static  String AssemblyFormat = "stind.i";


    public Integer getOpCode(){
        return StoreValIndirectIntNative.OpCode;
    }
    public String getAssemblyFormat() {
        return StoreValIndirectIntNative.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(NullReferenceException.class);
        return exceptions;
    }
}
