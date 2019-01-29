/**
 * CompareLessThan.java
 * Push 1 (of type int32) if value1 < value2, else push 0.
 *
 * @author Numan Ijaz
 * @version 1.0 8/20/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class CompareLessThan extends Instruction {
    public final static Integer OpCode = 0xFE04;
    public final static String AssemblyFormat = "Clt";


    public Integer getOpCode(){
        return CompareLessThan.OpCode;
    }
    public String getAssemblyFormat() {
        return CompareLessThan.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        return new ArrayList<Class>();
    }
}
