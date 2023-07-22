/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.ArrayList;
import java.util.Collections;

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
    
    public void ordenar(){
        Collections.sort(razas);
    }
    
    public ArrayList<String> getRazas(){
        return this.razas;
    }    
    
    public boolean eliminarRaza(String raza){
        if(razas.contains(raza)){
            this.razas.remove(raza);
            return true;
        }else{
            return false;
        } 
        
    }
    
}
