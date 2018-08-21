/**
 * LoadLocalVar2.java
 * Load local variable 2 onto stack.
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

public class LoadLocalVar2 implements Instruction {
    public final static Integer OpCode = 0x08;
    public final static  String AssemblyFormat = "ldloc.2";

    public Integer getOpCode(){
        return LoadLocalVar2.OpCode;
    }
    public String getAssemblyFormat() {
        return LoadLocalVar2.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(VerificationException.class);
        exceptions.add(SkipVerification.class);
        return exceptions;
    }
}
