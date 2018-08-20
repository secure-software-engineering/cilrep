/**
 * LoadArgNumAddressOnStack.java
 * Fetch the address of argument argNum.
 *
 * @author Numan Ijaz
 * @version 1.0 8/20/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class LoadArgNumAddressOnStack implements Instruction {
    public final static Integer OpCode = 0xFE0A;
    public final static String AssemblyFormat = "ldarga";

    public Integer argNum = 0; // to be changed in future

    public Integer getOpCode(){
        return LoadArgNumAddressOnStack.OpCode;
    }
    public String getAssemblyFormat() {
        return LoadArgNumAddressOnStack.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        return exceptions;
    }
}
