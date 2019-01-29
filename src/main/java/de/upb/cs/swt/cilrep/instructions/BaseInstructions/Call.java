/**
 * Call.java
 * Call method described by method.
 *
 * @author Numan Ijaz
 * @version 1.0 8/20/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.exceptions.MethodAccessException;
import de.upb.cs.swt.cilrep.exceptions.MissingMethodException;
import de.upb.cs.swt.cilrep.exceptions.SecurityException;
import de.upb.cs.swt.cilrep.instructions.Instruction;
import de.upb.cs.swt.cilrep.instructions.ParameterTypes.MemberRef;
import de.upb.cs.swt.cilrep.instructions.ParameterTypes.TypesBase;

import java.util.Arrays;
import java.util.List;

public class Call extends Instruction {
    public final static Integer OpCode = 0x28;
    public final static String AssemblyFormat = "call";

    public String method = ""; // to be replaced later on

    public Integer getOpCode(){
        return Call.OpCode;
    }
    public String getAssemblyFormat() {
        return Call.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        return Arrays.asList(
                SecurityException.class,
                MethodAccessException.class,
                MissingMethodException.class);
    }

    public TypesBase getParameter(){
        if (this.parameter == null){
            this.parameter = new MemberRef();
        }
        return this.parameter;
    }
}
