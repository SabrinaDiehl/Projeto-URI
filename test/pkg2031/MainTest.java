/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2031;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
  * @author Sabrina Diehl
 */
public class MainTest {
    
    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain() {
       System.out.println("Teste Pedra vs Pedra");
        pedraPapelAtaque jokenpo = new pedraPapelAtaque();
        String[] teste = {"pedra", "pedra"};
        int expResult = 3;
        int result = jokenpo.verificarVencedor(teste);
        assertEquals(expResult, result);
    }
    
}
