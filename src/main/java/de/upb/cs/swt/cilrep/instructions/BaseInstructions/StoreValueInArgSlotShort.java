/**
 * StoreValueInArgSlotShort.java
 * Store value to the argument numbered num, short form.
 *
 * @author Numan Ijaz
 * @version 1.0 8/21/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;
import de.upb.cs.swt.cilrep.instructions.ParameterTypes.TypesBase;
import de.upb.cs.swt.cilrep.instructions.ParameterTypes.UnsignedInt8;

import java.util.ArrayList;
import java.util.List;

public class StoreValueInArgSlotShort extends Instruction {
    public final static Integer OpCode = 0x10;
    public final static  String AssemblyFormat = "starg.s";

    public Integer num = 0; // to be changed later on

    public Integer getOpCode(){
        return StoreValueInArgSlotShort.OpCode;
    }
    public String getAssemblyFormat() {
        return StoreValueInArgSlotShort.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        return exceptions;
    }

    public TypesBase getParameter(){
        if (this.parameter == null){
            this.parameter = new UnsignedInt8();
        }
        return this.parameter;
    }
}
