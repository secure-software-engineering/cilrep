/**
 * CompareLessThanUn.java
 * Push 1 (of type int32) if value1 < value2, unsigned or
 * unordered, else push 0.
 *
 * @author Numan Ijaz
 * @version 1.0 8/20/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class CompareLessThanUn implements Instruction {
    final Integer OpCode = 0xFE05;
    final String AssemblyFormat = "clt.un";


    public Integer getOpCode(){
        return this.OpCode;
    }
    public String getAssemblyFormat() {
        return this.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        return new ArrayList<Class>();
    }
}