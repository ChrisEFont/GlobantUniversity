/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio20;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz = new int[3][3];
        int sumaDiag=0, suma=0;
        boolean esMagica=true;
        Scanner input = new Scanner(System.in);
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                boolean flag;
                do{ 
                    flag=false;
                    matriz[i][j]=input.nextInt();
                    if(matriz[i][j]<1 || matriz[i][j]>9){
                        System.out.println("Valor invalido, vuelva ingresar valor");
                        flag=true;                       
                    }
                }while(flag);             
            }
        }
        
        System.out.println("Matriz ingresada: ");
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        
        for(int i=0; i<3; i++){
            sumaDiag+=matriz[i][i];
        }
        
        System.out.println("Numero magico (diagonal principal): " + sumaDiag);
       
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                suma+=matriz[i][j];
                //System.out.println(suma);
            }
            if(sumaDiag!=suma){
                esMagica=false;
                System.out.println("No coincide la fila "+(i+1));
            }
            suma=0;
        }

        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                suma+=matriz[j][i];
                //System.out.println(suma);
            }
            if(sumaDiag!=suma){
                esMagica=false;
                System.out.println("No coincide la columna "+(i+1));
            }
            suma=0;
        }
        
        for(int i=0; i<3; i++){
            suma+=matriz[i][2-i];
        }        
        if(sumaDiag!=suma){
            esMagica=false;
            System.out.println("No la diagonal secundaria");
        }
        
        suma=0;
        
        
        if(esMagica){
            System.out.println("¡¡¡Es un cuadrado mágico!!!");
        }
        
        
    }
    
}
