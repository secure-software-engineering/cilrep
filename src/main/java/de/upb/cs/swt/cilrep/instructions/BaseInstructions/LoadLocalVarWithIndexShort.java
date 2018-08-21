/**
 * LoadLocalVarWithIndexShort.java
 * Load local variable of index indx onto stack, short form.
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

public class LoadLocalVarWithIndexShort implements Instruction {
    public final static Integer OpCode = 0x11;
    public final static  String AssemblyFormat = "ldloc.s";

    public Integer Index = 0; // to be changed later

    public Integer getOpCode(){
        return LoadLocalVarWithIndexShort.OpCode;
    }
    public String getAssemblyFormat() {
        return LoadLocalVarWithIndexShort.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(VerificationException.class);
        exceptions.add(SkipVerification.class);
        return exceptions;
    }
}
