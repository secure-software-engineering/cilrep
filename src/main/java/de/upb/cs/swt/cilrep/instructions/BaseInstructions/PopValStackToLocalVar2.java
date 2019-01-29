/**
 * PopValStackToLocalVar2.java
 * Pop a value from stack into local variable 2.
 *
 * @author Numan Ijaz
 * @version 1.0 8/21/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class PopValStackToLocalVar2 extends Instruction {
    public final static Integer OpCode = 0x0C;
    public final static  String AssemblyFormat = "stloc.2";

    public Integer getOpCode(){
        return PopValStackToLocalVar2.OpCode;
    }
    public String getAssemblyFormat() {
        return PopValStackToLocalVar2.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        return exceptions;
    }
}
