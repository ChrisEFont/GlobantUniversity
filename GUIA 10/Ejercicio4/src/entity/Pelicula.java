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
public class Pelicula {
    String titulo, director;
    float duracion;

    public Pelicula(String titulo, String director, float duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }
    
    public static Comparator<Pelicula> compararDuracionAsc = new Comparator<Pelicula>(){
            @Override
            public int compare(Pelicula p1, Pelicula p2){
                Float d1, d2;
                d1 = p1.duracion;
                d2 = p2.duracion;
                return d1.compareTo(d2);
            }
    };
    
    public static Comparator<Pelicula> compararDuracionDesc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            Float d1, d2;
            d1 = p1.duracion;
            d2 = p2.duracion;
            return d2.compareTo(d1);
        }
    };

    public static Comparator<Pelicula> compararTitulo = new Comparator<Pelicula>(){
            @Override
            public int compare(Pelicula p1, Pelicula p2){
                return p1.getTitulo().compareTo(p2.getTitulo());
            }
    };
    
    public static Comparator<Pelicula> compararDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getDirector().compareTo(p2.getDirector());
        }
    };
    

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + '}';
    }
    
    
    
    
    
    
    
}
