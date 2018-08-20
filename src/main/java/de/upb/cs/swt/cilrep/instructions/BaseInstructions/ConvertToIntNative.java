/**
 * ConvertToIntNative.java
 * Convert to native int, pushing native int on stack.
 *
 * @author Numan Ijaz
 * @version 1.0 8/20/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class ConvertToIntNative implements Instruction {
    public final static Integer OpCode = 0xD3;
    public final static String AssemblyFormat = "conv.i";


    public Integer getOpCode(){
        return ConvertToIntNative.OpCode;
    }
    public String getAssemblyFormat() {
        return ConvertToIntNative.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        return new ArrayList<Class>();
    }
}
