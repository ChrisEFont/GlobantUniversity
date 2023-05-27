/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15;

/**
 *
 * @author chris
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numeros = new int[100];
        
        for (int i=99; i>=0; i--){
            numeros[i]=i+1;
            System.out.print(numeros[i]+", ");
        }        
    }    
}
