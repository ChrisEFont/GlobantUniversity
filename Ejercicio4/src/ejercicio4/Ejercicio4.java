/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float tempCel, tempFah;
        Scanner inputKB = new Scanner(System.in);
        
        System.out.println("Ingrese una temperatura en grados centigrados");
        tempCel = inputKB.nextFloat();
        tempFah=32+(9*tempCel/5);
        
        System.out.println("La temperatura en grados celcius es: " + tempFah);
        
    }
    
}
