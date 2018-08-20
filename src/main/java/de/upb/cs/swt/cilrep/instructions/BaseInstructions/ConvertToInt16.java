/**
 * ConvertToInt16.java
 * Convert to int16, pushing int32 on stack.
 *
 * @author Numan Ijaz
 * @version 1.0 8/20/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class ConvertToInt16 implements Instruction {
    public final static Integer OpCode = 0x68;
    public final static String AssemblyFormat = "conv.i2";


    public Integer getOpCode(){
        return ConvertToInt16.OpCode;
    }
    public String getAssemblyFormat() {
        return ConvertToInt16.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        return new ArrayList<Class>();
    }
}
