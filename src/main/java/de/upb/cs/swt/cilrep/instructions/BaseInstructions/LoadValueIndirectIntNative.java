/**
 * LoadValueIndirectIntNative.java
 * Indirect load value of type native int as native int on the
 * stack
 *
 * @author Numan Ijaz
 * @version 1.0 8/21/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.exceptions.NullReferenceException;
import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class LoadValueIndirectIntNative extends Instruction {
    public final static Integer OpCode = 0x4D;
    public final static  String AssemblyFormat = "ldind.i";


    public Integer getOpCode(){
        return LoadValueIndirectIntNative.OpCode;
    }
    public String getAssemblyFormat() {
        return LoadValueIndirectIntNative.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(NullReferenceException.class);
        return exceptions;
    }
}
