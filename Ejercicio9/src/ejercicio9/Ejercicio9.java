/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase;
        Scanner inputKB = new Scanner(System.in);
        
        System.out.println("Por favor ingrese una frase");
        frase=inputKB.nextLine();
        
        if(frase.substring(0,1).equals("A")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
        
        System.out.println(frase.substring(0, 1).toUpperCase());
       
    }
    
}
