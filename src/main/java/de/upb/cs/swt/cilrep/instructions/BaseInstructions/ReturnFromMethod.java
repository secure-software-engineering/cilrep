/**
 * ReturnFromMethod.java
 * Return from method, possibly with a value.
 *
 * @author Numan Ijaz
 * @version 1.0 8/21/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class ReturnFromMethod implements Instruction {
    public final static Integer OpCode = 0x2A;
    public final static  String AssemblyFormat = "Ret";


    public Integer getOpCode(){
        return ReturnFromMethod.OpCode;
    }
    public String getAssemblyFormat() {
        return ReturnFromMethod.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        return exceptions;
    }
}
