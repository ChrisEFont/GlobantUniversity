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
public class Razas {

    public Razas() {
    }    
    
    private ArrayList<String> razas = new ArrayList();
    
    public void agregarRaza(String raza){
        this.razas.add(raza);
    }
    
    public ArrayList<String> getRazas(){
        return this.razas;
    }   
    
}
