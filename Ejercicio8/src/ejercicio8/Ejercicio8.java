/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String frase;
        int longitud;
        Scanner inputKB = new Scanner(System.in);
        
        System.out.println("Ingrese una frase");
        
        frase=inputKB.nextLine();
        
        if(frase.length()==8){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
        
        longitud=frase.length();
        
        System.out.println(longitud);
        System.out.println(frase);        
        
    }
    
}
