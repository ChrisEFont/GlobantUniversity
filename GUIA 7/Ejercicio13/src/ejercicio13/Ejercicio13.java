/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el lado");
        n=input.nextInt();
        
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if(i==0 || i==n-1 || j==0 || j==n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }        
    }
    
}
