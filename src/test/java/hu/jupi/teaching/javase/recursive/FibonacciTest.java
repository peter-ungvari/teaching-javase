package hu.jupi.teaching.javase.recursive;

import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest {
    
    public static final long FIBONACCI_42_TH_VALUE = 267914296L;

    private Fibonacci fibonacci = new Fibonacci();

    @Test
    public void testFibonacci_42() {
        assertEquals(FIBONACCI_42_TH_VALUE, fibonacci.fibonacci(42));
    }

    @Test
    public void testFibonacci2_42() {
        assertEquals(FIBONACCI_42_TH_VALUE, fibonacci.fibonacci2(42));
    }

    @Test
    public void testFibonacci3_42() {
        assertEquals(FIBONACCI_42_TH_VALUE, fibonacci.fibonacci3(42));
    }
    
     @Test
    public void testFibonacci_1() {
        assertEquals(1, fibonacci.fibonacci(1));
    }

    @Test
    public void testFibonacci2_1() {
        assertEquals(1, fibonacci.fibonacci2(1));
    }

    @Test
    public void testFibonacci3_1() {
        assertEquals(1, fibonacci.fibonacci3(1));
    }
    
    @Test
    public void testFibonacci_2() {
        assertEquals(1, fibonacci.fibonacci(2));
    }

    @Test
    public void testFibonacci2_2() {
        assertEquals(1, fibonacci.fibonacci2(2));
    }

    @Test
    public void testFibonacci3_2() {
        assertEquals(1, fibonacci.fibonacci3(2));
    }
}
