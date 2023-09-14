/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3y4;

/**
 *
 * @author chris
 */
public class DivisionNumero {
    
    public static int dividir(String numA, String numB){
        
        try{
            return Integer.parseInt(numA) / Integer.parseInt(numB);
        }catch(ArithmeticException e){
            System.out.println("Error: Division por cero");
            return 0;
        }catch(NumberFormatException e){
            System.out.println("Error: Dato ingresado no válido");
            return 0;
        }        
    }    
}
