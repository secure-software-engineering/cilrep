/**
 * ConvertToInt32Unsigned.java
 * Convert to unsigned int32, pushing int32 on stack.
 *
 * @author Numan Ijaz
 * @version 1.0 8/20/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class ConvertToInt32Unsigned extends Instruction {
    public final static Integer OpCode = 0x6D;
    public final static String AssemblyFormat = "conv.u4";


    public Integer getOpCode(){
        return ConvertToInt32Unsigned.OpCode;
    }
    public String getAssemblyFormat() {
        return ConvertToInt32Unsigned.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        return new ArrayList<Class>();
    }
}
