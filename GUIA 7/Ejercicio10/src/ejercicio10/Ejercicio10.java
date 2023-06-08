/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int limite, num, suma=0;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Por favor ingrese el limite de la sumatoria");
        
        limite = input.nextInt();
        
        while (suma<limite){
            System.out.println("Ingrese un numero");
            num=input.nextInt();
            suma+=num;
        }
        
        System.out.println("Supero el limite inicial");
        System.out.println("Limite: "+ limite);
        System.out.println("Sumatoria: " + suma);       
        
    }
    
}
