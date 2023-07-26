/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Comparator;

/**
 *
 * @author chris
 */
public class Pais {
    
    private String nombre;

    public Pais() {
    }   
    
    public Pais(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public static Comparator<Pais> compararNombre = new Comparator<Pais>(){
        @Override
        public int compare(Pais p1, Pais p2){
            return p1.getNombre().compareTo(p2.getNombre());
        }
    };

    @Override
    public String toString() {
        return "Pais{" + "nombre=" + nombre + '}';
    }   
    
}
