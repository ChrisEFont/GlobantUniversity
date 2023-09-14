package entity;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class Juego {
    
    int unknownNumber, attempts;
    
    
    public Juego(){
        attempts = 0;
        unknownNumber = (int) Math.round(Math.random()*500) ;
    }
    
    public boolean tryNumber(int number){
        return number==unknownNumber;
    }
    
    public void attemptsCount(){
        attempts++;
    }
    
    public String clue(int number){
        if(number<unknownNumber){
            return "El número es mayor";
        }else{
            return "El número es menor";
        }
    }

    public int getAttempts() {
        return attempts;
    }   
}
