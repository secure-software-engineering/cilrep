/**
 * And.java
 * Bitwise AND of two integral values, returns an integral value.
 *
 * @author Numan Ijaz
 * @version 1.0 8/18/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class And implements Instruction {
    public final static Integer OpCode = 0x5F;
    public final static String AssemblyFormat = "and";

    public Integer getOpCode(){
        return And.OpCode;
    }
    public String getAssemblyFormat() {
        return And.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        return new ArrayList<Class>();
    }
}
