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
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int option;
        Scanner input = new Scanner(System.in);
        
        DataEnter.ingresaNumeros();
        do {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            
            option=input.nextInt();
            
            switch(option){
                case 1: System.out.println(Functions.sumar(DataEnter.getNum1(),DataEnter.getNum2()));
                break;
                case 2: System.out.println(Functions.restar(DataEnter.getNum1(),DataEnter.getNum2()));
                break;
                case 3: System.out.println(Functions.multiplicar(DataEnter.getNum1(),DataEnter.getNum2()));
                break;
                case 4: System.out.println(Functions.dividir(DataEnter.getNum1(),DataEnter.getNum2()));
                break;
                case 5:
                System.out.println("Desea salir?");
                if(input.next().toUpperCase().equals("S")){
                }else{
                    option=0;
                }                   
                break;
                default: System.out.println("Opcion no valida");
                break;
            }            
        }while(option!=5);
        
    }
    
}
