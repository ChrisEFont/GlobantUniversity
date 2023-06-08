/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vectorN, contDigi=new int[5];
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de elementos del vector");
        vectorN = new int[input.nextInt()];
        
        for(int i=0; i<vectorN.length; i++){
            vectorN[i]=(int) Math.floor(Math.random()*99999);
            if(vectorN[i]<10){
                contDigi[0]++;
            }else if(vectorN[i]<100){
                contDigi[1]++;
            }else if(vectorN[i]<1000){
                contDigi[2]++;
            }else if(vectorN[i]<10000){
                contDigi[3]++;
            }else if(vectorN[i]<100000){
                contDigi[4]++;
            }
            
            System.out.print(vectorN[i]+ ", ");
        }
        System.out.println("");
        
        System.out.println("Cantidad de numeros con 1 digito : "+contDigi[0]);
        System.out.println("Cantidad de numeros con 2 digitos: "+contDigi[1]);
        System.out.println("Cantidad de numeros con 3 digitos: "+contDigi[2]);
        System.out.println("Cantidad de numeros con 4 digitos: "+contDigi[3]);
        System.out.println("Cantidad de numeros con 5 digitos: "+contDigi[4]);       
        
    }
    
}
