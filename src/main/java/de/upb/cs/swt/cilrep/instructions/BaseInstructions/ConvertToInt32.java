/**
 * ConvertToInt32.java
 * Convert to int32, pushing int32 on stack.
 *
 * @author Numan Ijaz
 * @version 1.0 8/20/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class ConvertToInt32 implements Instruction {
    public final static Integer OpCode = 0x69;
    public final static String AssemblyFormat = "conv.i4";


    public Integer getOpCode(){
        return ConvertToInt32.OpCode;
    }
    public String getAssemblyFormat() {
        return ConvertToInt32.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        return new ArrayList<Class>();
    }
}
