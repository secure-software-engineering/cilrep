/**
 * InitializeObject.java
 * Initialize the value at address dest.
 *
 * @author Numan Ijaz
 * @version 1.0 8/21/2018
 */

package de.upb.cs.swt.cilrep.instructions.ObjectModelInstructions;

import de.upb.cs.swt.cilrep.exceptions.MethodAccessException;
import de.upb.cs.swt.cilrep.exceptions.MissingMethodException;
import de.upb.cs.swt.cilrep.exceptions.NullReferenceException;
import de.upb.cs.swt.cilrep.exceptions.SecurityException;
import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class InitializeObject implements Instruction {
    public final static Integer OpCode = 0xFE15;
    public final static String AssemblyFormat = "initobj";

    public String typeToken = ""; // to be changed later on

    public Integer getOpCode(){
        return InitializeObject.OpCode;
    }
    public String getAssemblyFormat() {
        return InitializeObject.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        return exceptions;
    }
}
