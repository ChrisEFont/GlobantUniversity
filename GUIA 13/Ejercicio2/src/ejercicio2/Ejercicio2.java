/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String jugadores[] = new String[10];
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad de jugadores");
        int cantidad = input.nextInt();
        
        

//        for (int i = 0; i < cantidad; i++) {
//            jugadores[i] = "Jugador" + i;
//            System.out.println(jugadores[i]);
//        }
                
        try{
            
            for(int i=0; i<cantidad; i++){
                jugadores[i] = "Jugador"+i;
                System.out.println(jugadores[i]);
            }
                       
        }catch(ArrayIndexOutOfBoundsException a){
            System.out.println("Se excedio la cantidad de juagdores permitidas");
        }        
    }   
}
