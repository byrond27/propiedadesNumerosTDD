/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package propiedadesnumero;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sercop-Admin
 */
public class PropiedadesNumeroTest {
    
    @Test
    public void testEsPrimoTrue() {
        propiedades numero = new propiedades();
        assertEquals(true, numero.esPrimo(11));
        assertEquals(true, numero.esPrimo(991));
    }
    
    @Test
    public void testEsPrimoFalse() {
        propiedades numero = new propiedades();
        assertEquals(false, numero.esPrimo(10));
    }
    
    @Test
    public void testEsParTrue(){
        propiedades numero = new propiedades();
        assertEquals(true,numero.esPar(10));
    }
    
    @Test
    public void testEsParFalse(){
        propiedades numero = new propiedades();
        assertEquals(false,numero.esPar(11));
    }
    
    @Test
    public void testEsDivisiblePara2True(){
        propiedades numero = new propiedades();
        assertEquals(true,numero.esDivisiblePara2(10));
    }
    
    public void testEsDivisiblePara2False(){
        propiedades numero = new propiedades();
        assertEquals(false,numero.esDivisiblePara2(10));
    }
    
    @Test
    public void testEsDivisiblePara3True(){
        propiedades numero = new propiedades();
        assertEquals(true,numero.esDivisiblePara3(9));
    }
    
    @Test
    public void testEsDivisiblePara3False(){
        propiedades numero = new propiedades();
        assertEquals(false,numero.esDivisiblePara3(10));
    }
}
