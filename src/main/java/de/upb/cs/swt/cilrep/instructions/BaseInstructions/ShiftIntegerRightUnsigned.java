/**
 * ShiftIntegerRight.java
 * Shift an integer right (shift in zero), return an integer.
 *
 * @author Numan Ijaz
 * @version 1.0 8/21/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class ShiftIntegerRightUnsigned extends Instruction {
    public final static Integer OpCode = 0x64;
    public final static  String AssemblyFormat = "shr.un";


    public Integer getOpCode(){
        return ShiftIntegerRightUnsigned.OpCode;
    }
    public String getAssemblyFormat() {
        return ShiftIntegerRightUnsigned.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        return exceptions;
    }
}
