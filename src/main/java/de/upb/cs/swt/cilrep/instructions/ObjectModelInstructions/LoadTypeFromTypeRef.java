/**
 * LoadTypeFromTypeRef.java
 * Push the type token stored in a typed reference.
 *
 * @author Numan Ijaz
 * @version 1.0 8/22/2018
 */

package de.upb.cs.swt.cilrep.instructions.ObjectModelInstructions;

import de.upb.cs.swt.cilrep.exceptions.TypeLoadException;
import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class LoadTypeFromTypeRef implements Instruction {
    public final static Integer OpCode = 0xFE1D;
    public final static String AssemblyFormat = "Refanytype";


    public Integer getOpCode(){
        return LoadTypeFromTypeRef.OpCode;
    }
    public String getAssemblyFormat() {
        return LoadTypeFromTypeRef.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        return exceptions;
    }
}
