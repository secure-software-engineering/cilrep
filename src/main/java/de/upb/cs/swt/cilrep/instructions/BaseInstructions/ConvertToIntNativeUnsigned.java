/**
 * ConvertToIntNativeUnsigned.java
 * Convert to native unsigned int, pushing native int on stack.
 *
 * @author Numan Ijaz
 * @version 1.0 8/20/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class ConvertToIntNativeUnsigned implements Instruction {
    public final static Integer OpCode = 0xE0;
    public final static String AssemblyFormat = "conv.u";


    public Integer getOpCode(){
        return ConvertToIntNativeUnsigned.OpCode;
    }
    public String getAssemblyFormat() {
        return ConvertToIntNativeUnsigned.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        return new ArrayList<Class>();
    }
}
