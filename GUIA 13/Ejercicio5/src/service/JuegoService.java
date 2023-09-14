/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.Juego;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class JuegoService {
    
    static Scanner input = new Scanner(System.in);
    
    public static Juego createGame(){        
        Juego game = new Juego();
        return game;
    }
    
    public static boolean attempt(Juego game){
        int attemptNumber=-1;
        System.out.println("Ingrese un número");
        try {
            attemptNumber = input.nextInt();
            if (game.tryNumber(attemptNumber)) {
                game.attemptsCount();
                System.out.println("Felicitacinoes has ganado");
                System.out.println("Lo has hecho en intentos:" + game.getAttempts());
                return true;
            } else {
                game.attemptsCount();
                System.out.println("Mala suerte");
                System.out.println(game.clue(attemptNumber));
                return false;
            }
        }catch(InputMismatchException e){
            System.out.println("Dato inbresado invalido");
            game.attemptsCount();
            input.nextLine();
            return false;
        }        
    }    
}
