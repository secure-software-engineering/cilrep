/**
 * PopValStackToLocalVar1.java
 * Pop a value from stack into local variable 1.
 *
 * @author Numan Ijaz
 * @version 1.0 8/21/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class PopValStackToLocalVar1 implements Instruction {
    public final static Integer OpCode = 0x0B;
    public final static  String AssemblyFormat = "stloc.1";

    public Integer getOpCode(){
        return PopValStackToLocalVar1.OpCode;
    }
    public String getAssemblyFormat() {
        return PopValStackToLocalVar1.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        return exceptions;
    }
}
