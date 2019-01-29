/**
 * LoadVirtualMethodPointer.java
 * Push a typed reference to ptr of type class onto the stack.
 *
 * @author Numan Ijaz
 * @version 1.0 8/22/2018
 */

package de.upb.cs.swt.cilrep.instructions.ObjectModelInstructions;

import de.upb.cs.swt.cilrep.exceptions.TypeLoadException;
import de.upb.cs.swt.cilrep.instructions.Instruction;
import de.upb.cs.swt.cilrep.instructions.ParameterTypes.ClassParam;
import de.upb.cs.swt.cilrep.instructions.ParameterTypes.MemberRef;
import de.upb.cs.swt.cilrep.instructions.ParameterTypes.TypesBase;

import java.util.ArrayList;
import java.util.List;

public class PushTypedRefOnStack extends Instruction {
    public final static Integer OpCode = 0xC6;
    public final static String AssemblyFormat = "mkrefany";

    public String className = ""; // to be changed later on

    public Integer getOpCode(){
        return PushTypedRefOnStack.OpCode;
    }
    public String getAssemblyFormat() {
        return PushTypedRefOnStack.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(TypeLoadException.class);
        return exceptions;
    }

    public TypesBase getParameter(){
        if (this.parameter == null){
            this.parameter = new ClassParam();
        }
        return this.parameter;
    }
}
