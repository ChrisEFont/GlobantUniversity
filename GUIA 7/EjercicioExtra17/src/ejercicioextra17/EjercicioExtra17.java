/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra17;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class EjercicioExtra17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Por favor ingrese un número");
        num=input.nextInt();
        System.out.println(verificarPrimo(num));
    }
    
    public static boolean verificarPrimo(int num) {
        boolean esPrimo=true;
        
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0 && num!=i) {
                esPrimo=false;                
            }
        }
        return esPrimo;
    }    
}
