/**
 * ShiftIntegerLeft.java
 * Shift an integer left (shifting in zeros), return an integer.
 *
 * @author Numan Ijaz
 * @version 1.0 8/21/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class ShiftIntegerLeft implements Instruction {
    public final static Integer OpCode = 0x62;
    public final static  String AssemblyFormat = "Shl";


    public Integer getOpCode(){
        return ShiftIntegerLeft.OpCode;
    }
    public String getAssemblyFormat() {
        return ShiftIntegerLeft.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        return exceptions;
    }
}
