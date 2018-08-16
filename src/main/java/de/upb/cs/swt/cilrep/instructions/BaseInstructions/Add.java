/**
 * Add.java
 * This class represents an add instruction.
 * The add instruction adds value2 to value1 and pushes the result on the stack. Overflow is not
 * detected for integral operations, floating-point overflow returns +inf or -inf.
 *
 * @author Numan Ijaz
 * @version 1.0 8/16/2018
 */

package de.upb.cs.swt.cilrep.instructions.BaseInstructions;

public class Add implements Instruction {
    public static final Integer OpCode = 0x58;
}
