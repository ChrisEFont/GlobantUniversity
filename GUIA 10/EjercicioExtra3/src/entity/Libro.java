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
public class Libro {
    
    private int isbn, existencias, prestados;
    String titulo, autor;

    public Libro() {
    }

    public Libro(int isbn, int existencias, String titulo, String autor) {
        this.isbn = isbn;
        this.existencias = existencias;
        this.prestados = 0;
        this.titulo = titulo;
        this.autor = autor;
    }
    
    public void prestar(){
        this.prestados++;
    }
    
    public void devolver(){
        this.prestados--;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    public int getPrestados() {
        return prestados;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.isbn;
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
        final Libro other = (Libro) obj;
        return true;
    }
    
    public static Comparator<Libro> compararTitulo = new Comparator<Libro>(){
            @Override
            public int compare(Libro lib1, Libro lib2){
                return lib1.getTitulo().compareTo(lib2.getTitulo());
            }
    };
    
    public static Comparator<Libro> compararAutor = new Comparator<Libro>() {
        @Override
        public int compare(Libro lib1, Libro lib2) {
            return lib1.getAutor().compareTo(lib2.getAutor());
        }
    };
    
    public static Comparator<Libro> compararIsbn = new Comparator<Libro>() {
        @Override        
        public int compare(Libro lib1, Libro lib2) {
            Integer isbn1, isbn2;
            isbn1 = lib1.getIsbn();
            isbn2 = lib2.getIsbn();
            return isbn1.compareTo(isbn2);
        }
    };    
        

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", existencias=" + existencias + ", prestados=" + prestados + ", titulo=" + titulo + ", autor=" + autor + '}';
    }
    
    
    
}
