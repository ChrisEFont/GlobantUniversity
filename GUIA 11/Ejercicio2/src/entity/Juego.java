/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.ArrayList;

/**
 *
 * @author chris
 */
public class Juego {

    public Juego() {
    }    
    
    private ArrayList<Jugador> jugadores = new ArrayList();
    
    private Revolver revolver;
    
    private int turno=0;
    
    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver revolver){
        this.jugadores = jugadores;
        this.revolver = revolver;
    }
    
    public boolean ronda(int turno){        
        return jugadores.get(turno).disparar(revolver);
    }   
    
}
