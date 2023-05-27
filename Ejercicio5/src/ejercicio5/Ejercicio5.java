/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float num;
        Scanner inputKB = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        
        num=inputKB.nextFloat();
        
        
        System.out.println("El doble del numero ingresado es " + 2*num);
        System.out.println("El triple del numero ingresado es " + 3*num);
        System.out.println("La raiz cuadrada del numero ingresado es " + 
                Math.sqrt(num));
    }
    
}
