/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra24;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class EjercicioExtra24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el limite d ela sucesión");
        n=input.nextInt();
        
        int[] vector = new int[n];
        
        vector=fibonacci(n);        
        
        for(int i=0; i<n; i++){
            System.out.print("["+vector[i]+"]");
        }        
    }
    
    public static int[] fibonacci(int n){
        int[] vectorF = new int[n];
        int ultimo, anteult, antepen;
        antepen=0;
        anteult=1;        
        
        vectorF[0]=1;
        
        for (int i=1; i<n; i++){
            ultimo=anteult+antepen;
            antepen=anteult;
            anteult=ultimo;
            vectorF[i]=ultimo;
        }       
        
        return vectorF;
    } 
    
}
