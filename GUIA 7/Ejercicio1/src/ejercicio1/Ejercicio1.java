/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero");
        num1=entrada.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2=entrada.nextInt();
        
        System.out.println("La suma es: "+(num1+num2)); 
        
                
        
    }
    
}
