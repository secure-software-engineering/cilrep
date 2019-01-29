/**
 * Unbox.java
 * Extract a value-type from obj, its boxed representation.
 *
 * @author Numan Ijaz
 * @version 1.0 8/22/2018
 */

package de.upb.cs.swt.cilrep.instructions.ObjectModelInstructions;

import de.upb.cs.swt.cilrep.exceptions.InvalidCastException;
import de.upb.cs.swt.cilrep.exceptions.NullReferenceException;
import de.upb.cs.swt.cilrep.exceptions.TypeLoadException;
import de.upb.cs.swt.cilrep.instructions.Instruction;
import de.upb.cs.swt.cilrep.instructions.ParameterTypes.MemberRef;
import de.upb.cs.swt.cilrep.instructions.ParameterTypes.TypesBase;
import de.upb.cs.swt.cilrep.instructions.ParameterTypes.ValueTypeParam;

import java.util.ArrayList;
import java.util.List;

public class Unbox extends Instruction {
    public final static Integer OpCode = 0x79;
    public final static String AssemblyFormat = "unbox";

    String valueType = ""; // to be changed later on

    public Integer getOpCode(){
        return Unbox.OpCode;
    }
    public String getAssemblyFormat() {
        return Unbox.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(InvalidCastException.class);
        exceptions.add(NullReferenceException.class);
        exceptions.add(TypeLoadException.class);
        return exceptions;
    }

    public TypesBase getParameter(){
        if (this.parameter == null){
            this.parameter = new ValueTypeParam();
        }
        return this.parameter;
    }
}
