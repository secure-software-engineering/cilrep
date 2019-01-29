/**
 * LeaveRegionOfCode.java
 * Exit a protected region of code.
 *
 * @author Numan Ijaz
 * @version 1.0 8/21/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;
import de.upb.cs.swt.cilrep.instructions.ParameterTypes.Int32;
import de.upb.cs.swt.cilrep.instructions.ParameterTypes.TypesBase;

import java.util.ArrayList;
import java.util.List;

public class LeaveRegionOfCode extends Instruction {
    public final static Integer OpCode = 0xDE;
    public final static  String AssemblyFormat = "leave";

    public Integer Target = 0; // to be changed later on

    public Integer getOpCode(){
        return LeaveRegionOfCode.OpCode;
    }
    public String getAssemblyFormat() {
        return LeaveRegionOfCode.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        return exceptions;
    }

    public TypesBase getParameter(){
        if (this.parameter == null){
            this.parameter = new Int32();
        }
        return this.parameter;
    }
}
