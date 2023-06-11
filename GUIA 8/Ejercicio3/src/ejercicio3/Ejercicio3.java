/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import Service.OperacionService;
import ejercicio3.Entity.Operacion;

/**
 *
 * @author chris
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        OperacionService operacionS = new OperacionService();
        
        Operacion operacion = operacionS.crearOperacion();
        
        System.out.println("La suma es: " + operacion.sumar());

        System.out.println("La resta es: " + operacion.restar());

        System.out.println("La multiplicación es: " + operacion.multiplicar());

        System.out.println("La división es: " + operacion.dividir());
        
    }
    
}
