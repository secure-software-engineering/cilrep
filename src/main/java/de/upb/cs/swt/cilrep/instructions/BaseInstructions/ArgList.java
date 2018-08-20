/**
 * ArgList.java
 * Return argument list handle for the current method
 *
 * @author Numan Ijaz
 * @version 1.0 8/18/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class ArgList implements Instruction {
    public final static Integer OpCode = 0xFE00;
    public final static String AssemblyFormat = "arglist";

    public Integer getOpCode(){
        return ArgList.OpCode;
    }
    public String getAssemblyFormat() {
        return ArgList.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        return new ArrayList<Class>();
    }
}
