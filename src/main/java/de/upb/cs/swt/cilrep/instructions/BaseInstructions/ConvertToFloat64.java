/**
 * ConvertToFloat64.java
 * Convert to float64, pushing F on stack.
 *
 * @author Numan Ijaz
 * @version 1.0 8/20/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class ConvertToFloat64 extends Instruction {
    public final static Integer OpCode = 0x6C;
    public final static String AssemblyFormat = "conv.r8";


    public Integer getOpCode(){
        return ConvertToFloat64.OpCode;
    }
    public String getAssemblyFormat() {
        return ConvertToFloat64.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        return new ArrayList<Class>();
    }
}
