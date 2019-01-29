/**
 * Not.java
 * Bitwise complement.
 *
 * @author Numan Ijaz
 * @version 1.0 8/21/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class Not extends Instruction {
    public final static Integer OpCode = 0x66;
    public final static  String AssemblyFormat = "Not";


    public Integer getOpCode(){
        return Not.OpCode;
    }
    public String getAssemblyFormat() {
        return Not.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        return exceptions;
    }
}
