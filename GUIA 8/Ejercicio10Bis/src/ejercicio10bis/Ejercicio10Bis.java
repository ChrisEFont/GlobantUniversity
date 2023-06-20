/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10bis;

import java.util.Arrays;



/**
 *
 * @author chris
 */
public class Ejercicio10Bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float arregloA[] = new float[50];
        float arregloB[] = new float[20];
        
        for (int i = 0; i < 50; i++) {
            arregloA[i] = (float) Math.round(Math.random() * 100);
        }
        
//        for(float i: arregloA){
//            i = 5f;
//        }
        
        Arrays.sort(arregloA);
        
        arregloB=Arrays.copyOfRange(arregloA, 0, 20);
                
        Arrays.fill(arregloB, 10, 20, 0.5f);
        
        for (float i : arregloA) {
            System.out.print(i+" ; ");
        }        
        System.out.println("");
        
        System.out.println(Arrays.toString(arregloB));
        
    }
    
}
