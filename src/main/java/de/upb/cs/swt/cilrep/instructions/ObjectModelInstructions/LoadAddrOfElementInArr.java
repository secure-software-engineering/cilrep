/**
 * LoadAddrOfElementInArr.java
 * Load the address of element at index onto the top of the stack.
 *
 * @author Numan Ijaz
 * @version 1.0 8/21/2018
 */

package de.upb.cs.swt.cilrep.instructions.ObjectModelInstructions;

import de.upb.cs.swt.cilrep.exceptions.*;
import de.upb.cs.swt.cilrep.instructions.Instruction;
import de.upb.cs.swt.cilrep.instructions.ParameterTypes.Token;
import de.upb.cs.swt.cilrep.instructions.ParameterTypes.TypesBase;

import java.util.ArrayList;
import java.util.List;

public class LoadAddrOfElementInArr extends Instruction {
    public final static Integer OpCode = 0x8F;
    public final static String AssemblyFormat = "ldelema";

    public String typeToken = ""; // to be changed later on

    public Integer getOpCode(){
        return LoadAddrOfElementInArr.OpCode;
    }
    public String getAssemblyFormat() {
        return LoadAddrOfElementInArr.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(NullReferenceException.class);
        exceptions.add(IndexOutOfRangeException.class);
        exceptions.add(ArrayTypeMismatchException.class);
        return exceptions;
    }

    public TypesBase getParameter(){
        if (this.parameter == null){
            this.parameter = new Token();
        }
        return this.parameter;
    }
}
