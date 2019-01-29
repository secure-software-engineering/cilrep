/**
 * LoadLocalVarWithIndex.java
 * Load local variable of index indx onto stack
 *
 * @author Numan Ijaz
 * @version 1.0 8/21/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.exceptions.SkipVerification;
import de.upb.cs.swt.cilrep.exceptions.VerificationException;
import de.upb.cs.swt.cilrep.instructions.Instruction;
import de.upb.cs.swt.cilrep.instructions.ParameterTypes.TypesBase;
import de.upb.cs.swt.cilrep.instructions.ParameterTypes.UnsignedInt16;

import java.util.ArrayList;
import java.util.List;

public class LoadLocalVarWithIndex extends Instruction {
    public final static Integer OpCode = 0xFE0C;
    public final static  String AssemblyFormat = "ldloc";

    public Integer Index = 0; // to be changed later

    public Integer getOpCode(){
        return LoadLocalVarWithIndex.OpCode;
    }
    public String getAssemblyFormat() {
        return LoadLocalVarWithIndex.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(VerificationException.class);
        exceptions.add(SkipVerification.class);
        return exceptions;
    }

    public TypesBase getParameter(){
        if (this.parameter == null){
            this.parameter = new UnsignedInt16();
        }
        return this.parameter;
    }
}
