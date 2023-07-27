/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Comparator;
import java.util.Objects;

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
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pais other = (Pais) obj;
        return true;
    }
    
    

    @Override
    public String toString() {
        return "Pais{" + "nombre=" + nombre + '}';
    }   
    
}
