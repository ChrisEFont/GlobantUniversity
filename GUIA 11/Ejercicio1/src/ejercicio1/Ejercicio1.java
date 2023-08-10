/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import entity.Perro;
import entity.Persona;

/**
 *
 * @author chris
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Perro perro1 = new Perro("Bulon", "Ovejero Aleman", "Grande", 2);
        Perro perro2 = new Perro("Mate", "Labrador", "Grande", 4);
        
        Persona persona1 = new Persona(111, "Ceci", "Fa", 34, perro1);
        Persona persona2 = new Persona(222, "Chris", "Font", 34, perro2);
        
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        
        
    }
    
}
