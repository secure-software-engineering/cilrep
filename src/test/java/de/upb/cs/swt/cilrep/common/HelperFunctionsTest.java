package de.upb.cs.swt.cilrep.common;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelperFunctionsTest {
    @Test
    public void readNBytesIntoInt32() {
        byte[] bytes = { 0x54, 0x62, 0x7a, 0x1C };
        assertEquals((long)HelperFunctions.readNBytesIntoInt32(2, 0, bytes), 25172);
        assertEquals((long)HelperFunctions.readNBytesIntoInt32(3, 0, bytes), 8020564);
        assertEquals((long)HelperFunctions.readNBytesIntoInt32(4, 0, bytes), 477782612);

    }
    @Test
    public void getNumberOfSetBits(){
        long var = Long.parseLong("33024736927575");
        assertEquals((int)HelperFunctions.getNumberOfSetBits(var), 26);

        var = Long.MAX_VALUE;
        assertEquals((int)HelperFunctions.getNumberOfSetBits(var), 63);

    }
}