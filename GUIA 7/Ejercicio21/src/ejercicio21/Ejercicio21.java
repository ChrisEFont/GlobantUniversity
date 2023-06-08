/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio21;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        int nA=10, nB=3, filaCheck=-1, columnaCheck=-1, fila=-1, columna=-1, veces=0;
        boolean check=true, flag=false; 
        Scanner input = new Scanner(System.in);

        int[][] matrizA= {
            {1, 26, 36, 47, 5, 6, 72, 81, 95, 10},
            {11, 12, 13, 21, 41, 22, 67, 20, 10, 61},
            {56, 78, 87, 90, 9, 90, 17, 12, 87, 67},
            {41, 87, 24, 56, 97, 74, 87, 42, 64, 35},
            {32, 76, 79,  1, 36,  5, 67, 96, 12, 11},
            {99, 13, 54, 88, 89, 90, 75, 12, 41, 76},
            {67, 78, 87, 45, 14, 22, 26, 42, 56, 78},
            {98, 45, 34, 23, 32, 56, 74, 16, 19, 18},
            {24, 67, 97, 46, 87, 13, 67, 89, 93, 24},
            {21, 68, 78, 97, 90, 67, 12, 41, 65, 12}
        };

        int[][] matrizB = {
            { 36, 5, 67},
            {89, 90, 75},
            {14, 22, 26}
        };
        
        System.out.println("Matriz donde buscar");
        for (int i = 0; i < nA; i++) {
            for (int j = 0; j < nA; j++) {
                System.out.print(matrizA[i][j]+" ");                
            }
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("----------------------");
        
        System.out.println("Matriz a buscar");
        for (int i = 0; i < nB; i++) {
            for (int j = 0; j < nB; j++) {
                System.out.print(matrizB[i][j]+" ");
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("----------------------");
        System.out.println("Desde aqui muestra todas las matrices 3x3 contenidas en la matriz 10x10");
        System.out.println("----------------------");
        
        for (int i = 0; i < nA-nB+1; i++) {
            for (int j = 0; j < nA-nB+1; j++) {
                
                for(int k=0; k<nB; k++){
                    for(int l=0; l<nB; l++){
                        if(matrizA[i+k][j+l]!=matrizB[k][l]){
                            check=false;
                        }
                        System.out.print(matrizA[i+k][j+l]+" ");
                        filaCheck=i+1;
                        columnaCheck=j+1;                        
                    }
                    System.out.println("");
                }
            System.out.println("-------------");
            if(check==true){
            flag=true;
            fila=filaCheck;
            columna=columnaCheck;
            }
            check=true;
            }

        }
        
        if(flag){
            System.out.println("La matriz en la última vez en la fila: "+fila+" y la columna: "+columna);
        }else{
            System.out.println("La matriz no se econtró");
        }
        System.out.println(flag);        
    }    
}
