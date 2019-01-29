/**
 * LoadLiteralString.java
 * Push a string object for the literal string.
 *
 * @author Numan Ijaz
 * @version 1.0 8/22/2018
 */

package de.upb.cs.swt.cilrep.instructions.ObjectModelInstructions;

import de.upb.cs.swt.cilrep.instructions.Instruction;
import de.upb.cs.swt.cilrep.instructions.ParameterTypes.StringParam;
import de.upb.cs.swt.cilrep.instructions.ParameterTypes.TypesBase;

import java.util.ArrayList;
import java.util.List;

public class LoadLiteralString extends Instruction {
    public final static Integer OpCode = 0x72;
    public final static String AssemblyFormat = "ldstr";

    public String strValue = ""; // to be changed later on

    public Integer getOpCode(){
        return LoadLiteralString.OpCode;
    }
    public String getAssemblyFormat() {
        return LoadLiteralString.AssemblyFormat;
    }

    public List<Class> getThrownExceptions(){
        List<Class> exceptions = new ArrayList<Class>();
        return exceptions;
    }
    public TypesBase getParameter(){
        if (this.parameter == null){
            this.parameter = new StringParam();
        }
        return this.parameter;
    }
}
