/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vectorN; 
        int num, veces=0;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de elementos del vector");
        vectorN = new int[input.nextInt()];
        
        for(int i=0; i<vectorN.length; i++){
            vectorN[i]= (int) Math.floor(Math.random()*100);
            System.out.print(vectorN[i]+ ", ");
        }
        
        System.out.println("Vector generado");
        System.out.println("Ingrese el numero que desea buscar");
        num=input.nextInt();
        
        System.out.println("Su numero se encuentra en");
        for(int i=0; i<vectorN.length; i++){
            if(vectorN[i]==num){
                System.out.print(i+ ", ");
                veces++;
            }
        }
        
        if(veces==0){
            System.out.println("Su numero no se encuentra en el vector");
        }else if(veces>1){
            System.out.println("Su numero se encuentra repetido "+veces+" veces");
        }
        
    }
    
}
