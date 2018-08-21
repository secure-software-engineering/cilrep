/**
 * LoadLocalVarAddressIndxShort.java
 * Load address of local variable with index indx, short form.
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

public class LoadLocalVarAddressIndxShort implements Instruction {
    public final static Integer OpCode = 0x12;
    public final static  String AssemblyFormat = "ldloca.s";

    public Integer indx = 0; // to be changed later on

    public Integer getOpCode(){
        return LoadLocalVarAddressIndxShort.OpCode;
    }
    public String getAssemblyFormat() {
        return LoadLocalVarAddressIndxShort.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(VerificationException.class);
        exceptions.add(SkipVerification.class);
        return exceptions;
    }
}
