/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio19;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] mA = new int[3][3];
        int[][] mB = new int[3][3];
        boolean antisimetrica=true;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresando la matriz A, nueve valores");
        
        for(int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                mA[i][j]=input.nextInt();
            }
        }
        
        System.out.println("Ingresando la matriz B, nueve valores");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mB[i][j] = input.nextInt();
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(!(mA[i][j]==-(mB[i][j]))){
                    antisimetrica=false;
                }
                //System.out.println(mA[i][j]+" & "+mB[j][i]+" ");                
            }
            //System.out.println("");
        }
        
        if(antisimetrica){
            System.out.println("Las matrices son antisimetricas");
        }else{
            System.out.println("Las matrices NO son antisimetricas");
        }       
        
    }
    
}
