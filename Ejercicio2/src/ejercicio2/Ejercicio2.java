/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

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
        String nombre;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese se nombre");
        nombre=entrada.nextLine();
        System.out.println("Usted es el Sr. " + nombre);
    }
    
}
