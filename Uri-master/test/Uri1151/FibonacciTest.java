/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uri1151;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sabrina.diehl
 */
public class FibonacciTest {
    
    public FibonacciTest() {
    }

    /**
     * Test of gerarFibonacci method, of class Fibonacci.
     */
    @Test
    public void testGerarFibonacci() {
        Fibonacci fibonacci = new Fibonacci();
        String experado = "55 ";
        String result = fibonacci.gerarFibonacci(11);
        assertEquals(experado, result);
        
    }
    
}
