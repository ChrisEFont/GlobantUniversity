/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class DataEnter {
    static int num1, num2;
    public static void ingresaNumeros(){
        Scanner input = new Scanner(System.in);        
        System.out.println("Ingrese el primer numero");
        num1 = input.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = input.nextInt();        
    }

    public static int getNum1() {
        return num1;
    }

    public static int getNum2() {
        return num2;
    }
    
    
}
