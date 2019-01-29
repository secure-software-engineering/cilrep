/**
 * CreateNewObject.java
 * Allocate an uninitialized object or value type and call ctor.
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

public class CreateNewObject extends Instruction {
    public final static Integer OpCode = 0x73;
    public final static String AssemblyFormat = "newobj";

    public String ctor = ""; // metadat token to be changed later on

    public Integer getOpCode(){
        return CreateNewObject.OpCode;
    }
    public String getAssemblyFormat() {
        return CreateNewObject.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(InvalidOperationException.class);
        exceptions.add(MethodAccessException.class);
        exceptions.add(OutOfMemoryException.class);
        exceptions.add(MissingMethodException.class);
        return exceptions;
    }

    public TypesBase getParameter(){
        if (this.parameter == null){
            this.parameter = new MemberRef();
        }
        return this.parameter;
    }
}
