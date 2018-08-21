/**
 * LeaveRegionOfCodeShort.java
 * Exit a protected region of code, short form.
 *
 * @author Numan Ijaz
 * @version 1.0 8/21/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.exceptions.SkipVerification;
import de.upb.cs.swt.cilrep.exceptions.VerificationException;
import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class LeaveRegionOfCodeShort implements Instruction {
    public final static Integer OpCode = 0xDD;
    public final static  String AssemblyFormat = "leave.s";

    public Integer Target = 0; // to be changed later on

    public Integer getOpCode(){
        return LeaveRegionOfCodeShort.OpCode;
    }
    public String getAssemblyFormat() {
        return LeaveRegionOfCodeShort.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        return exceptions;
    }
}