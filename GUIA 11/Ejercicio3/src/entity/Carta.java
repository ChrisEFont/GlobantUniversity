/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import enumeraciones.Palos;

/**
 *
 * @author chris
 */
public class Carta {
    
    private Palos palo;
    
    private int valor;

    public Carta() {
    }

    public Carta(Palos palo, int valor) {
        this.palo = palo;
        this.valor = valor;
    }    

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }  

    public Palos getPalo() {
        return palo;
    }

    public void setPalo(Palos palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta{" + "palo=" + palo + ", valor=" + valor + '}';
    }
    
    
       
}
