/**
 * ShiftIntegerRight.java
 * Shift an integer right (shift in sign), return an integer.
 *
 * @author Numan Ijaz
 * @version 1.0 8/21/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class ShiftIntegerRight extends Instruction {
    public final static Integer OpCode = 0x63;
    public final static  String AssemblyFormat = "Shr";


    public Integer getOpCode(){
        return ShiftIntegerRight.OpCode;
    }
    public String getAssemblyFormat() {
        return ShiftIntegerRight.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        return exceptions;
    }
}
