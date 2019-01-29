/**
 * Xor.java
 * Bitwise XOR of integer values, returns an integer.
 *
 * @author Numan Ijaz
 * @version 1.0 8/21/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class Xor extends Instruction {
    public final static Integer OpCode = 0x61;
    public final static  String AssemblyFormat = "xor";

    public Integer getOpCode(){
        return Xor.OpCode;
    }
    public String getAssemblyFormat() {
        return Xor.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        return exceptions;
    }
}
