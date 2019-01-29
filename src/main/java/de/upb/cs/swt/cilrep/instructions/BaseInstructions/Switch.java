/**
 * Switch.java
 * Jump to one of n values.
 *
 * @author Numan Ijaz
 * @version 1.0 8/21/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;
import de.upb.cs.swt.cilrep.instructions.ParameterTypes.SwitchStmtMultipleParams;
import de.upb.cs.swt.cilrep.instructions.ParameterTypes.TypesBase;

import java.util.ArrayList;
import java.util.List;

public class Switch extends Instruction {
    public final static Integer OpCode = 0x45;
    public final static  String AssemblyFormat = "switch";

    public Integer getOpCode(){
        return Switch.OpCode;
    }
    public String getAssemblyFormat() {
        return Switch.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        return exceptions;
    }

    public TypesBase getParameter(){
        if (this.parameter == null){
            this.parameter = new SwitchStmtMultipleParams();
        }
        return this.parameter;
    }
}
