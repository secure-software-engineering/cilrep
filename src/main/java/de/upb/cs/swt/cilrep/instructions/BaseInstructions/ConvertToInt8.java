/**
 * ConvertToInt8.java
 * Convert to int8, pushing int32 on stack.
 *
 * @author Numan Ijaz
 * @version 1.0 8/20/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class ConvertToInt8 extends Instruction {
    public final static Integer OpCode = 0x67;
    public final static String AssemblyFormat = "conv.i1";


    public Integer getOpCode(){
        return ConvertToInt8.OpCode;
    }
    public String getAssemblyFormat() {
        return ConvertToInt8.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        return new ArrayList<Class>();
    }
}
