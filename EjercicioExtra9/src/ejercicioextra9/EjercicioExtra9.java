/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra9;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class EjercicioExtra9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dividendo, divisor, cociente, resto;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el dividendo");
        dividendo=input.nextInt();
        System.out.println("Ingrese el divisor");
        divisor=input.nextInt();
        
        resto=dividendo;
        cociente=0;
                
        while (resto>=divisor){
            resto=resto-divisor;
            cociente++;            
        }
        
        System.out.println("El cociente es:" +cociente);
        System.out.println("El resto es:" +resto);        
    }
    
}
