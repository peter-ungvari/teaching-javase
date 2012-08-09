package hu.jupi.teaching.javase.recursive;

import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest {
    
    public static final long FIBONACCI_45_TH_VALUE = 1134903170L;

    private Fibonacci fibonacci = new Fibonacci();

    @Test
    public void testFibonacci_45() {
        assertEquals(FIBONACCI_45_TH_VALUE, fibonacci.fibonacci(45));
    }

    @Test
    public void testFibonacci2_45() {
        assertEquals(FIBONACCI_45_TH_VALUE, fibonacci.fibonacci2(45));
    }

    @Test
    public void testFibonacci3_45() {
        assertEquals(FIBONACCI_45_TH_VALUE, fibonacci.fibonacci3(45));
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
