/**
 * ConvertToFloat32.java
 * Convert to float32, pushing F on stack.
 *
 * @author Numan Ijaz
 * @version 1.0 8/20/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class ConvertToFloat32 extends Instruction {
    public final static Integer OpCode = 0x6B;
    public final static String AssemblyFormat = "conv.r4";


    public Integer getOpCode(){
        return ConvertToFloat32.OpCode;
    }
    public String getAssemblyFormat() {
        return ConvertToFloat32.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        return new ArrayList<Class>();
    }
}
