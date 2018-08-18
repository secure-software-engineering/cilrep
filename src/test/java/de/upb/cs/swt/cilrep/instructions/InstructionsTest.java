package de.upb.cs.swt.cilrep.instructions;

import de.upb.cs.swt.cilrep.instructions.BaseInstructions.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructionsTest {
    @Test
    public void TestInstructions() {
        assertEquals((new Add()).getOpCode().intValue(), 0x58);
    }
}