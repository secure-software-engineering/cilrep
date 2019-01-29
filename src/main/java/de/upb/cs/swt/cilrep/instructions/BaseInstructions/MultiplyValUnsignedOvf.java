/**
 * MultiplyValUnsignedOvf.java
 * Multiply unsigned integer values. Unsigned result shall fit in
 * same size.
 *
 * @author Numan Ijaz
 * @version 1.0 8/21/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

import de.upb.cs.swt.cilrep.exceptions.OverflowException;
import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class MultiplyValUnsignedOvf extends Instruction {
    public final static Integer OpCode = 0xD9;
    public final static  String AssemblyFormat = "mul.ovf";


    public Integer getOpCode(){
        return MultiplyValUnsignedOvf.OpCode;
    }
    public String getAssemblyFormat() {
        return MultiplyValUnsignedOvf.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        exceptions.add(OverflowException.class);
        return exceptions;
    }
}
