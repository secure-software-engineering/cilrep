/**
 * LoadLocalVar3.java
 * Load local variable 3 onto stack.
 *
 * @author Numan Ijaz
 * @version 1.0 8/21/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.exceptions.NullReferenceException;
import de.upb.cs.swt.cilrep.exceptions.SkipVerification;
import de.upb.cs.swt.cilrep.exceptions.VerificationException;
import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class LoadLocalVar3 extends Instruction {
    public final static Integer OpCode = 0x09;
    public final static  String AssemblyFormat = "ldloc.3";

    public Integer getOpCode(){
        return LoadLocalVar3.OpCode;
    }
    public String getAssemblyFormat() {
        return LoadLocalVar3.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(VerificationException.class);
        exceptions.add(SkipVerification.class);
        return exceptions;
    }
}
