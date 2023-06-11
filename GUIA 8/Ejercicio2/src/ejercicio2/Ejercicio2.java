/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import ejercicio2.Entidades.Circunferencia;
import ejercicio2.servicios.CircunferenciaServicio;

/**
 *
 * @author chris
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CircunferenciaServicio circunferenciaS = new CircunferenciaServicio();
        Circunferencia circulo = circunferenciaS.crearCircunferencia();   
        
        System.out.println(circulo.area());
        System.out.println(circulo.perimetro());
        
    }
    
}
