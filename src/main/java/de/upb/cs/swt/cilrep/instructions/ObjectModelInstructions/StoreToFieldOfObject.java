/**
 * StoreToFieldOfObject.java
 * Replace the value of field of the object obj with value.
 *
 * @author Numan Ijaz
 * @version 1.0 8/22/2018
 */

package de.upb.cs.swt.cilrep.instructions.ObjectModelInstructions;

import de.upb.cs.swt.cilrep.exceptions.*;
import de.upb.cs.swt.cilrep.instructions.Instruction;
import de.upb.cs.swt.cilrep.instructions.ParameterTypes.MemberRef;
import de.upb.cs.swt.cilrep.instructions.ParameterTypes.TypesBase;

import java.util.ArrayList;
import java.util.List;

public class StoreToFieldOfObject extends Instruction {
    public final static Integer OpCode = 0x7D;
    public final static String AssemblyFormat = "stfld";

    String field = ""; // to be modified later on

    public Integer getOpCode(){
        return StoreToFieldOfObject.OpCode;
    }
    public String getAssemblyFormat() {
        return StoreToFieldOfObject.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(FieldAccessException.class);
        exceptions.add(NullReferenceException.class);
        exceptions.add(MissingFieldException.class);
        return exceptions;
    }

    public TypesBase getParameter(){
        if (this.parameter == null){
            this.parameter = new MemberRef();
        }
        return this.parameter;
    }
}
