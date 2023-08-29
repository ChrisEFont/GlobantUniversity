/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import entity.Electrodomestico;
import entity.Lavadora;
import entity.Televisor;
import java.util.ArrayList;

/**
 *
 * @author chris
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float sumaPrecios=0;
        
        Televisor televisor1 = new Televisor("NEGRO", 1000, 20, 'A', 42, true);
        Lavadora lavadora1 = new Lavadora("BLANCO", 1000, 110, 'A', 12);
        Televisor televisor2 = new Televisor("GRIS", 1000, 23, 'A', 54, true);
        Lavadora lavadora2 = new Lavadora("AZUL", 1000, 95, 'A', 8);
        
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList();
        
        electrodomesticos.add(televisor1);
        electrodomesticos.add(televisor2);
        electrodomesticos.add(lavadora1);
        electrodomesticos.add(lavadora2);
        
        for(Electrodomestico aux: electrodomesticos){
            aux.precioFinal();
            sumaPrecios += aux.getPrecio();
            System.out.println("El precio final es:"+aux.getPrecio());
        }
        
        System.out.println("La suma de todos los precios es: "+sumaPrecios);        
        
        
        // Elementos del ejercicio 2
        
//        System.out.println("Creando televisor");
//        televisor.crearTelevisor();
//        televisor.precioFinal();
//        System.out.println("Creando lavadora");
//        lavadora.crearLavadora();
//        lavadora.precioFinal();
//        
//        System.out.println("Precio de televisor "+televisor.getPrecio());
//        System.out.println("Precio de lavadora "+lavadora.getPrecio());
        
    }
    
}
