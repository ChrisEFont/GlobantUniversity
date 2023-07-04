/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class Juego {
    
    Scanner input = new Scanner(System.in);
    
    public Ahorcado crearJuego(){
        String palabra;
        int intentos;
        
        System.out.println("Por favor ingrese la palabra");
        palabra = input.next();
        
        System.out.println("Ingrese la cantidad de intentos");
        intentos=input.nextInt();        
        
        Ahorcado ahorcado = new Ahorcado();
        
        ahorcado.crearJuego(palabra, intentos);        
        
        return ahorcado;        
    }
    
    public void jugar(Ahorcado juego){
        String letra;       
        
        while (juego.intentos() > 0 && juego.getEncontradas()<juego.getTotalLetras()) {
            System.out.println("Ingrese una letra");
            letra = input.next();
            
            if (juego.buscar(letra)) {
                juego.encontrada(letra);
                System.out.println("¡La letra se encuentra en la palabra!");
            } else {
                System.out.println("Lo siento, la letra no está.");
            }
            
            System.out.println("Has encontrado "+juego.getEncontradas()+" letras");
            System.out.println("Restan por encontrar "+ (juego.getTotalLetras()-juego.getEncontradas()) +" letras");
            System.out.println("Te quedan "+juego.intentos()+" intentos");
            System.out.println("-----------------------------------------");
        }
        
        if(juego.getEncontradas()>=juego.getTotalLetras()){
            System.out.println("¡Felicitaciones, has ganado!");
        }else{
            System.out.println("La próxima tal vez");
        }        
    }    
}
