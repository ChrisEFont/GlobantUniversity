/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author chris
 */
public class Jugador {
    
    private int id;
    private String nombre;    
    boolean mojado;

    public Jugador() {
    }

    public Jugador(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        mojado=false;
    }    
    
    public boolean disparar(Revolver revolver){
        
        if(revolver.mojar()){
            mojado=true;
        }
        
        revolver.suguienteChorro();
        
        return mojado;
    }    
    
}
