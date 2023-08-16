/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import enumeraciones.Palos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


/**
 *
 * @author chris
 */
public class Baraja {
    
    private ArrayList<Carta> baraja = new ArrayList();
    private ArrayList<Carta> monton = new ArrayList();
    
    
    public Baraja(){
    }
    
    public void armarBaraja(){
        
        for (int i = 0; i < 10; i++) {
            if (i < 7) {
                Carta carta = new Carta(Palos.ESPADA, (i + 1));
                baraja.add(carta);
            } else {
                Carta carta = new Carta(Palos.ESPADA, (i + 3));
                baraja.add(carta);
            }
        }
        
        for (int i = 0; i < 10; i++) {
            if (i < 7) {
                Carta carta = new Carta(Palos.ORO, (i + 1));
                baraja.add(carta);
            } else {
                Carta carta = new Carta(Palos.ORO, (i + 3));
                baraja.add(carta);
            }
        }
        
        for (int i = 0; i < 10; i++) {
            if (i < 7) {
                Carta carta = new Carta(Palos.COPA, (i + 1));
                baraja.add(carta);
            } else {
                Carta carta = new Carta(Palos.COPA, (i + 3));
                baraja.add(carta);
            }
        }
        
        for (int i = 0; i < 10; i++) {
            if (i < 7) {
                Carta carta = new Carta(Palos.BASTO, (i + 1));
                baraja.add(carta);
            } else {
                Carta carta = new Carta(Palos.BASTO, (i + 3));
                baraja.add(carta);
            }
        }        
        
    }
    
    
    public void barajar(){
        Collections.shuffle(baraja);
    }
    
    public Carta siguienteCarta(){
        Carta aux = new Carta();
        aux = baraja.get(0);
        monton.add(aux);
        baraja.remove(aux);
        return aux;        
    }
    
    public int cartasDisponibles(){
        return baraja.size();
    }
    
    public ArrayList<Carta> darCartas(int cantidad){
        
        ArrayList<Carta> mano = new ArrayList();
        
        Iterator iterator = baraja.iterator();
        
        int i=0;
        
        if (cantidad < baraja.size()) {
            while (iterator.hasNext()&&i<cantidad){
                Carta carta = (Carta)iterator.next();                                                 
                mano.add(carta);
                monton.add(carta);                
                iterator.remove();                   
                i++;
            }
        }       
        return mano;
    }
    
    public ArrayList<Carta> cartasMonton(){
        return monton;
    }
    
    public ArrayList<Carta> mostrarBaraja(){
        return baraja;
    }
    
    
    
    
    
    
    
}
