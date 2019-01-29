/**
 * ConvertToFloatUnsigned.java
 * Convert unsigned integer to floating-point, pushing F on stack.
 *
 * @author Numan Ijaz
 * @version 1.0 8/20/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class ConvertToFloatUnsigned extends Instruction {
    public final static Integer OpCode = 0x76;
    public final static String AssemblyFormat = "conv.r.un";


    public Integer getOpCode(){
        return ConvertToFloatUnsigned.OpCode;
    }
    public String getAssemblyFormat() {
        return ConvertToFloatUnsigned.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        return new ArrayList<Class>();
    }
}
