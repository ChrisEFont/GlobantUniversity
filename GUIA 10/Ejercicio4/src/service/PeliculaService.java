/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class PeliculaService {
    
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    private static ArrayList<Pelicula> peliculas = new ArrayList();

    public PeliculaService() {
    }   
    
    public void menu(){
        int opt;
        do{            
            System.out.println("Ingrese una opción");
            System.out.println("1 - Crear una película");
            System.out.println("2 - Mostrar películas");
            System.out.println("3 - Mostrar películas de mas de una hora");
            System.out.println("4 - Ordenar películas por duración ascendente");
            System.out.println("5 - Ordenar películas por duración descendente");            
            System.out.println("6 - Ordenar películas por titulo");
            System.out.println("7 - Ordenar películas por director");
            System.out.println("0 - Finalizar");
            opt=input.nextInt();
            switch(opt){
                case 1:
                    guardarPelicula(this.crearPelicula());
                    break;
                case 2:
                    this.mostrarPeliculas();
                    break;
                case 3:
                    this.mostrarPeliculasHora();
                    break;
                case 4:
                    this.ordenarPeliculasDuracionAsc();
                    break;
                case 5:
                    this.ordenarPeliculasDuracionDesc();
                    break;
                case 6:
                    this.ordenarPeliculasTitulo();
                    break;
                case 7:
                    this.ordenarPeliculasDirector();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción invalida");
                    break;
            }            
        }while(opt!=0);
    }
    
    public Pelicula crearPelicula(){
        
        input.nextLine();
        
        String titulo, director;
        float duracion;
        
        System.out.println("Ingrese el titulo");
        titulo=input.nextLine();
        System.out.println("Ingrese el director");
        director=input.nextLine();
        System.out.println("Ingrese la duración");
        duracion=input.nextFloat();
        
        Pelicula pelicula = new Pelicula(titulo, director, duracion);
        
        return pelicula;
    }
    
    public static void guardarPelicula(Pelicula pelicula){
        peliculas.add(pelicula);
    }
    
    public void mostrarPeliculas(){
        for(Pelicula aux: peliculas){
            System.out.println(aux.toString());
            System.out.println("");
        }
    }
    
    public void mostrarPeliculasHora(){
        for (Pelicula aux : peliculas) {
            if(aux.getDuracion()>1){
                System.out.println(aux.toString());
                System.out.println("");
            }
        }
    }
    
    public void ordenarPeliculasDuracionAsc() {
        peliculas.sort(Pelicula.compararDuracionAsc);
    }
    
    public void ordenarPeliculasDuracionDesc() {
        peliculas.sort(Pelicula.compararDuracionDesc);
    }
    
    
    public void ordenarPeliculasTitulo(){
        peliculas.sort(Pelicula.compararTitulo);
    }
    
       public void ordenarPeliculasDirector(){
        peliculas.sort(Pelicula.compararDirector);
    }    
    
}
