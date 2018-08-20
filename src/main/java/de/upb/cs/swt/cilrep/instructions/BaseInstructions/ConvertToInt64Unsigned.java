/**
 * ConvertToInt64Unsigned.java
 * Convert to unsigned int64, pushing int64 on stack.
 *
 * @author Numan Ijaz
 * @version 1.0 8/20/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class ConvertToInt64Unsigned implements Instruction {
    public final static Integer OpCode = 0x6E;
    public final static String AssemblyFormat = "conv.u8";


    public Integer getOpCode(){
        return ConvertToInt64Unsigned.OpCode;
    }
    public String getAssemblyFormat() {
        return ConvertToInt64Unsigned.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        return new ArrayList<Class>();
    }
}
