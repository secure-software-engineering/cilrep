/**
 * ConvertToInt16Unsigned.java
 * Convert to unsigned int16, pushing int32 on stack.
 *
 * @author Numan Ijaz
 * @version 1.0 8/20/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class ConvertToInt16Unsigned extends Instruction {
    public final static Integer OpCode = 0xD1;
    public final static String AssemblyFormat = "conv.u2";


    public Integer getOpCode(){
        return ConvertToInt16Unsigned.OpCode;
    }
    public String getAssemblyFormat() {
        return ConvertToInt16Unsigned.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        return new ArrayList<Class>();
    }
}
