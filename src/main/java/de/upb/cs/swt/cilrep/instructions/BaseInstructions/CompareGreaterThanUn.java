/**
 * CompareGreaterThanUn.java
 * Push 1 (of type int32) if value1 > value2, unsigned or
 * unordered, else push 0.
 *
 * @author Numan Ijaz
 * @version 1.0 8/20/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class CompareGreaterThanUn extends Instruction {
    public final static Integer OpCode = 0xFE03;
    public final static String AssemblyFormat = "cgt.un";


    public Integer getOpCode(){
        return CompareGreaterThanUn.OpCode;
    }
    public String getAssemblyFormat() {
        return CompareGreaterThanUn.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        return new ArrayList<Class>();
    }
}
