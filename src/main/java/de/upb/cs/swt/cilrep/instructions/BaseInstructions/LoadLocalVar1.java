/**
 * LoadLocalVar1.java
 * Load local variable 1 onto stack.
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

public class LoadLocalVar1 implements Instruction {
    public final static Integer OpCode = 0x07;
    public final static  String AssemblyFormat = "ldloc.1";

    public Integer getOpCode(){
        return LoadLocalVar1.OpCode;
    }
    public String getAssemblyFormat() {
        return LoadLocalVar1.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(VerificationException.class);
        exceptions.add(SkipVerification.class);
        return exceptions;
    }
}
