/**
 * LoadNull.java
 * Push a null reference on the stack.
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

public class LoadNull extends Instruction {
    public final static Integer OpCode = 0x14;
    public final static  String AssemblyFormat = "ldnull";

    public Integer getOpCode(){
        return LoadNull.OpCode;
    }
    public String getAssemblyFormat() {
        return LoadNull.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        return exceptions;
    }
}
