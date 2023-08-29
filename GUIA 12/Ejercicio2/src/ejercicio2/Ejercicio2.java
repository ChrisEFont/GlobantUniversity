/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import entity.Lavadora;
import entity.Televisor;

/**
 *
 * @author chris
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Televisor televisor = new Televisor();
        Lavadora lavadora = new Lavadora();
        
        System.out.println("Creando televisor");
        televisor.crearTelevisor();
        televisor.precioFinal();
        System.out.println("Creando lavadora");
        lavadora.crearLavadora();
        lavadora.precioFinal();
        
        System.out.println("Precio de televisor "+televisor.getPrecio());
        System.out.println("Precio de lavadora "+lavadora.getPrecio());
        
    }
    
}
