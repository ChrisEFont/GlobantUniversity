/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import entity.Juego;
import service.JuegoService;

/**
 *
 * @author chris
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean flag;
        
        Juego game = JuegoService.createGame();
        
        do{            
            flag = JuegoService.attempt(game);            
        }while(!flag);      
    }    
}
