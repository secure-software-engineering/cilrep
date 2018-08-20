/**
 * LoadArgNumShortOnStack.java
 * Load argument numbered num onto the stack, short form.
 *
 * @author Numan Ijaz
 * @version 1.0 8/20/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class LoadArgNumShortOnStack implements Instruction {
    public final static Integer OpCode = 0x0E;
    public final static  String AssemblyFormat = "darg.s";

    public Integer num = 0; // to be changed in future

    public Integer getOpCode(){
        return LoadArgNumShortOnStack.OpCode;
    }
    public String getAssemblyFormat() {
        return LoadArgNumShortOnStack.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        return exceptions;
    }
}
