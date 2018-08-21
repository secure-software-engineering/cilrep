/**
 * PopValStackToLocalIndxShort.java
 * Pop a value from stack into local variable indx, short form.
 *
 * @author Numan Ijaz
 * @version 1.0 8/21/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class PopValStackToLocalIndxShort implements Instruction {
    public final static Integer OpCode = 0x13;
    public final static  String AssemblyFormat = "stloc.s";

    public Integer indx = 0; // to be changed later on

    public Integer getOpCode(){
        return PopValStackToLocalIndxShort.OpCode;
    }
    public String getAssemblyFormat() {
        return PopValStackToLocalIndxShort.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        return exceptions;
    }
}
