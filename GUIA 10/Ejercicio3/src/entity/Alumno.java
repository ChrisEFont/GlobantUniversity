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
public class Alumno {
    
    private String nombre;
    private ArrayList<Integer> notas;
    
    public Alumno(String nombre, int n1, int n2, int n3){
        this.nombre = nombre;
        this.notas = new ArrayList();
        this.notas.add(n1);
        this.notas.add(n2);
        this.notas.add(n3);
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
    
}
