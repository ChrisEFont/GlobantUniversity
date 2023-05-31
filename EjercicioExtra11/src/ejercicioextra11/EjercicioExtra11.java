/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra11;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class EjercicioExtra11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, digitos=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        num=input.nextInt();
        
        while(num>=1 || num<=-1){
            num=num/10;
            digitos++;
        }
        
        System.out.println(digitos);
        
    }
    
}
