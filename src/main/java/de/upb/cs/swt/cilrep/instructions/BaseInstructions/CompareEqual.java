/**
 * CompareEqual.java
 * Push 1 (of type int32) if value1 equals value2, else push 0.
 *
 * @author Numan Ijaz
 * @version 1.0 8/20/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class CompareEqual extends Instruction {
    public final static Integer OpCode = 0xFE01;
    public final static String AssemblyFormat = "Ceq";


    public Integer getOpCode(){
        return CompareEqual.OpCode;
    }
    public String getAssemblyFormat() {
        return CompareEqual.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        return new ArrayList<Class>();
    }
}
