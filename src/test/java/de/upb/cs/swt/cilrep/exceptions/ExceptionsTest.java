package de.upb.cs.swt.cilrep.exceptions;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionsTest {
    @Test
    public void testExceptions() {
        assertEquals(new ArithmeticException().toString(), "System.ArithmeticException");
        assertEquals(new DivideByZeroException().toString(), "System.DivideByZeroException");
        assertEquals(new ExecutionEngineException().toString(), "System.ExecutionEngineException");
        assertEquals(new IndexOutOfRangeException().toString(), "System.IndexOutOfRangeException");
        assertEquals(new InvalidAddressException().toString(), "System.InvalidAddressException");
        assertEquals(new InvalidCastException().toString(), "System.InvalidCastException");
        assertEquals(new MissingFieldException().toString(), "System.MissingFieldException");
        assertEquals(new MissingMethodException().toString(), "System.MissingMethodException");
        assertEquals(new NullReferenceException().toString(), "System.NullReferenceException");
        assertEquals(new OutOfMemoryException().toString(), "System.OutOfMemoryException");
        assertEquals(new OverflowException().toString(), "System.OverflowException");
        assertEquals(new SecurityException().toString(), "System.SecurityException");
        assertEquals(new StackOverflowException().toString(), "System.StackOverflowException");
        assertEquals(new TypeLoadException().toString(), "System.TypeLoadException");


    }
}