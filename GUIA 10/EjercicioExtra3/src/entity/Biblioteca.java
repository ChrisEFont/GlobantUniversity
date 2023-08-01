/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author chris
 */
public class Biblioteca {
    
    HashSet<Libro> biblioteca = new HashSet();

    public Biblioteca() {
    }
    
    public Libro crearLibro(int isbn, int existencias, String titulo, String autor){
        Libro libro = new Libro(isbn, existencias, titulo, autor);
        return libro;
    }
    
    public void cargarLibro(Libro libro){
        biblioteca.add(libro);
    }
    
    Iterator iterator = biblioteca.iterator();
    
    public void prestarLibro(int isbn){
        for(Libro aux: biblioteca){
            if(aux.getIsbn()==isbn){
                aux.prestar();
            }
        }
    }
    
    public void devolverLibro(int isbn){
        for(Libro aux: biblioteca){
            if(aux.getIsbn()==isbn){
                aux.devolver();
            }
        }
    }
    
    public Libro obtenerLibro(int isbn){
        Libro libro=null;
        boolean check=false;
        for(Libro aux: biblioteca){
            if(aux.getIsbn()==isbn){
                libro=aux;
                check=true;
            }
        }        
        return libro;
    }
    
    public void setLibro(int isbn, Libro libro){
        for (Libro aux : biblioteca) {
            if (aux.getIsbn() == isbn) {
                aux=libro;
            }
        }
    }
    
    public ArrayList<Libro> listarLibrosPorTitulo() {
        ArrayList<Libro> listaLibros = new ArrayList(biblioteca);
        listaLibros.sort(Libro.compararTitulo);
        return listaLibros;
    }

    public ArrayList<Libro> listarLibrosPorAutor() {
        ArrayList<Libro> listaLibros = new ArrayList(biblioteca);
        listaLibros.sort(Libro.compararAutor);
        return listaLibros;
    }

    public ArrayList<Libro> listarLibrosPorIsbn() {
        ArrayList<Libro> listaLibros = new ArrayList(biblioteca);
        listaLibros.sort(Libro.compararIsbn);
        return listaLibros;
    }   
    
    
    
    
    
    
    
    
 
    
}
