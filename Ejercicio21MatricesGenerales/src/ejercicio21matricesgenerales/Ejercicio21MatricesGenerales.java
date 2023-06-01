/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio21MatricesGenerales;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class Ejercicio21MatricesGenerales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        int nA, nB, filaCheck=-1, columnaCheck=-1, fila=-1, columna=-1, veces=0;
        int[][] matrizA, matrizB;
        boolean check=true, flag=false; 
        Scanner input = new Scanner(System.in);
        
        do {
            System.out.println("Ingrese la dimension de la matriz donde buscar");
            nA = input.nextInt();
            System.out.println("Ingrese la dimensión de la matriz a buscar");
            nB = input.nextInt();
            if(nA<nB){
                System.out.println("Dimensiones invalidas!!!");
            }            
        } while (nA < nB);
        
        
        matrizA= new int[nA][nA];
        matrizB= new int [nB][nB];
        
        for(int i=0; i<nA; i++){
            for(int j=0; j<nA; j++){
                matrizA[i][j]=(int) Math.floor(Math.random()*10);
            }
        }
        
        for (int i=0; i<nB; i++) {
            for (int j=0; j<nB; j++) {
                matrizB[i][j] = (int) Math.floor(Math.random()*10);
            }
        }

        
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
        
        
        for (int i = 0; i < nA; i++) {
            for (int j = 0; j < nA; j++) {
                matrizA[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < nB; i++) {
            for (int j = 0; j < nB; j++) {
                matrizB[i][j] = input.nextInt();
            }
        }        
        
        
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
                veces++;
                System.out.println("******************************Encontrada************************************");
                Thread.sleep(200);
            }
            check=true;
            }

        }
        
        if(flag){
            System.out.println("La matriz se encontro "+veces+" veces, la última vez en la fila: "+fila+" y la columna: "+columna);
        }else{
            System.out.println("La matriz no se econtró");
        }
        System.out.println(flag);        
    }    
}
