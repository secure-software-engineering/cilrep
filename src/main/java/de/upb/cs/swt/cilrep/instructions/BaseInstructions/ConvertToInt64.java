/**
 * ConvertToInt64.java
 * Convert to int64, pushing int64 on stack.
 *
 * @author Numan Ijaz
 * @version 1.0 8/20/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class ConvertToInt64 extends Instruction {
    public final static Integer OpCode = 0x6A;
    public final static String AssemblyFormat = "conv.i8";


    public Integer getOpCode(){
        return ConvertToInt64.OpCode;
    }
    public String getAssemblyFormat() {
        return ConvertToInt64.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        return new ArrayList<Class>();
    }
}
