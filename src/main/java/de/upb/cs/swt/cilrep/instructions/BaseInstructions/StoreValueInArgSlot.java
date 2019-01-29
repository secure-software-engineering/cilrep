/**
 * StoreValueInArgSlot.java
 * Store value to the argument numbered num.
 *
 * @author Numan Ijaz
 * @version 1.0 8/21/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;
import de.upb.cs.swt.cilrep.instructions.ParameterTypes.TypesBase;
import de.upb.cs.swt.cilrep.instructions.ParameterTypes.UnsignedInt16;

import java.util.ArrayList;
import java.util.List;

public class StoreValueInArgSlot extends Instruction {
    public final static Integer OpCode = 0xFE0B;
    public final static  String AssemblyFormat = "starg";

    public Integer num = 0; // to be changed later on

    public Integer getOpCode(){
        return StoreValueInArgSlot.OpCode;
    }
    public String getAssemblyFormat() {
        return StoreValueInArgSlot.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        return exceptions;
    }

    public TypesBase getParameter(){
        if (this.parameter == null){
            this.parameter = new UnsignedInt16();
        }
        return this.parameter;
    }
}
