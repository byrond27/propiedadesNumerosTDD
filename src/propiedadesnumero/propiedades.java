/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package propiedadesnumero;

/**
 *
 * @author Sercop-Admin
 */
public class propiedades {
    public boolean esPrimo(float numero){
        int contador = 2;
        boolean primo=true;
        while ((primo) && (contador!=numero)){
        if (numero % contador == 0)
            primo = false;
            contador++;
        } 
        return primo;
    }
    
    public boolean esPar(float numero){
        return numero % 2 == 0;
    }
    
    public boolean esDivisiblePara2(float numero){
        return numero % 2 == 0;
    }

    public boolean esDivisiblePara3(float numero){
        return numero % 3 == 0;
    }
    
    
}
