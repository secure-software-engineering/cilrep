/**
 * IsInstance.java
 * Test if obj is an instance of typeTok, returning null or an instance of
 * that class or interface.
 *
 * @author Numan Ijaz
 * @version 1.0 8/21/2018
 */

package de.upb.cs.swt.cilrep.instructions.ObjectModelInstructions;

import de.upb.cs.swt.cilrep.exceptions.TypeLoadException;
import de.upb.cs.swt.cilrep.instructions.Instruction;
import de.upb.cs.swt.cilrep.instructions.ParameterTypes.Token;
import de.upb.cs.swt.cilrep.instructions.ParameterTypes.TypesBase;

import java.util.ArrayList;
import java.util.List;

public class IsInstance extends Instruction {
    public final static Integer OpCode = 0x75;
    public final static String AssemblyFormat = "isinst";

    public String typeToken = ""; // to be changed later on

    public Integer getOpCode(){
        return IsInstance.OpCode;
    }
    public String getAssemblyFormat() {
        return IsInstance.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(TypeLoadException.class);
        return exceptions;
    }

    public TypesBase getParameter(){
        if (this.parameter == null){
            this.parameter = new Token();
        }
        return this.parameter;
    }
}
