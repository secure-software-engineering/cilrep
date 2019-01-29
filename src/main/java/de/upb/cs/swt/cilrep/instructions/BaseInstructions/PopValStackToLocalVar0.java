/**
 * PopValStackToLocalIndx.java
 * Pop a value from stack into local variable 0.
 *
 * @author Numan Ijaz
 * @version 1.0 8/21/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class PopValStackToLocalVar0 extends Instruction {
    public final static Integer OpCode = 0x0A;
    public final static  String AssemblyFormat = "stloc.0";

    public Integer getOpCode(){
        return PopValStackToLocalVar0.OpCode;
    }
    public String getAssemblyFormat() {
        return PopValStackToLocalVar0.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        return exceptions;
    }
}
