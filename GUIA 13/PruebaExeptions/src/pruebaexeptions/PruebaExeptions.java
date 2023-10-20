/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaexeptions;

import exceptions.MyException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class PruebaExeptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            ingresarDato();
        }catch(InputMismatchException e){
            System.out.println("El dato ingresado no es un numero entero");
        }catch(MyException e){
            System.out.println(e.getMessage());
        }        
    }
    
    public static void ingresarDato() throws MyException{
        
        int number=0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese un numero del 1 al 10");
        
        number = input.nextInt();
            
        if (number < 1 || 10 < number) {
                throw new MyException("El numero ingreado no está dentro del rango");
        }      
    }    
}
