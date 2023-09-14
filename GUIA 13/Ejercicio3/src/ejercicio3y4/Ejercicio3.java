/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3y4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String numA=null;                
        String numB =null;
        try{
            System.out.println("Ingrese el dividendo");
            numA = input.nextLine();
            System.out.println("Ingrese el divisor");
            numB = input.nextLine();
        }catch(InputMismatchException e){
            System.out.println("Error del sistema ingreso un dato invalido");
        }        
        System.out.println(DivisionNumero.dividir(numA, numB));       
    }  
}
