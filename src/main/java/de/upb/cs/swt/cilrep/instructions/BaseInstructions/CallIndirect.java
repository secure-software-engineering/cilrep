/**
 * CallIndirect.java
 * Call method indicated on the stack with arguments described by
 * callsitedescr.
 *
 * @author Numan Ijaz
 * @version 1.0 8/20/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.exceptions.SecurityException;
import de.upb.cs.swt.cilrep.instructions.Instruction;
import de.upb.cs.swt.cilrep.instructions.ParameterTypes.CallSiteDescription;
import de.upb.cs.swt.cilrep.instructions.ParameterTypes.TypesBase;

import java.util.ArrayList;
import java.util.List;

public class CallIndirect extends Instruction {
    public final static Integer OpCode = 0x29;
    public final static String AssemblyFormat = "calli";

    public String callSiteDescription = ""; // to be replaced later on

    public Integer getOpCode(){
        return CallIndirect.OpCode;
    }
    public String getAssemblyFormat() {
        return CallIndirect.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        ArrayList<Class> exceptions =  new ArrayList<>();
        exceptions.add(SecurityException.class);
        return exceptions;
    }

    public TypesBase getParameter(){
        if (this.parameter == null){
            this.parameter = new CallSiteDescription();
        }
        return this.parameter;
    }
}
