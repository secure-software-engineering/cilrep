/**
 * ConvertToInt8Unsigned.java
 * Convert to unsigned int8, pushing int32 on stack.
 *
 * @author Numan Ijaz
 * @version 1.0 8/20/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class ConvertToInt8Unsigned implements Instruction {
    public final static Integer OpCode = 0xD2;
    public final static String AssemblyFormat = "conv.u1";


    public Integer getOpCode(){
        return ConvertToInt8Unsigned.OpCode;
    }
    public String getAssemblyFormat() {
        return ConvertToInt8Unsigned.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        return new ArrayList<Class>();
    }
}
