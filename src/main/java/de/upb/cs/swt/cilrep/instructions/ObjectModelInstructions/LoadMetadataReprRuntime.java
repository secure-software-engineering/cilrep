/**
 * LoadMetadataReprRuntime.java
 * Convert metadata token to its runtime representation.
 *
 * @author Numan Ijaz
 * @version 1.0 8/22/2018
 */

package de.upb.cs.swt.cilrep.instructions.ObjectModelInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;

import java.util.ArrayList;
import java.util.List;

public class LoadMetadataReprRuntime implements Instruction {
    public final static Integer OpCode = 0xD0;
    public final static String AssemblyFormat = "ldtoken";

    public String token = ""; // to be changed later on

    public Integer getOpCode(){
        return LoadMetadataReprRuntime.OpCode;
    }
    public String getAssemblyFormat() {
        return LoadMetadataReprRuntime.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        return exceptions;
    }
}
