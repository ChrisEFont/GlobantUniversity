/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.Biblioteca;
import entity.Libro;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class BibliotecaService {
    Scanner input = new Scanner(System.in);
    
    Biblioteca biblioteca = new Biblioteca();

    public BibliotecaService() {
    }    
    
    public void crearLibro(){
        System.out.println("Ingrese el ISBN");
        int isbn = input.nextInt();
        System.out.println("Ingrese la cantidad de ejemplares");
        int ejemplares = input.nextInt();
        System.out.println("Ingrese el Título");
        input.nextLine();
        String titulo = input.nextLine();
        System.out.println("Ingrese el autor");
        String autor = input.nextLine();
        biblioteca.cargarLibro(biblioteca.crearLibro(isbn, ejemplares, titulo, autor));
    }
    
    public void prestarLibro(){
        System.out.println("Ingrese el ISBN del libro a prestar");
        int isbn = input.nextInt();
        biblioteca.prestarLibro(isbn);
    }
    
    public void devolverLibro(){
        System.out.println("Ingrese el ISBN del libro a devolver");
        int isbn = input.nextInt();
        biblioteca.devolverLibro(isbn);
    }
    
    public void modificarLibro(){
        System.out.println("Ingrese el ISBN del libro a modificar");
        int isbn = input.nextInt();
        Libro libro = biblioteca.obtenerLibro(isbn);
        System.out.println("Ingrese una opción");
        System.out.println("1 - Modificar ISBN");
        System.out.println("2 - Modificar existencias");
        System.out.println("3 - Modificar título");
        System.out.println("4 - Modificar autor");
        
        int opt = input.nextInt();
        
        switch(opt){
            case 1:
                System.out.println("Ingrese el nuevo ISBN");
                libro.setIsbn(input.nextInt());
                break;
            case 2:
                System.out.println("Ingrese la nueva cantidad de existencias");
                libro.setExistencias(input.nextInt());
                break;
            case 3:
                input.nextLine();
                System.out.println("Ingrese el nuevo título");
                libro.setTitulo(input.nextLine());
                break;
            case 4:
                input.nextLine();
                System.out.println("Ingres el nuevo autor");
                libro.setAutor(input.nextLine());
                break;
            default:
                System.out.println("Opción invalida");                
        }
        
        biblioteca.setLibro(isbn, libro);        
        
    }
    
    public void listarPorTitulo(){        
        ArrayList<Libro> listaLibros = new ArrayList (biblioteca.listarLibrosPorTitulo());
        for(Libro aux: listaLibros){
            System.out.println(aux.toString());
        }
    }
    
    public void listarPorAutor() {
        ArrayList<Libro> listaLibros = new ArrayList(biblioteca.listarLibrosPorAutor());
        for (Libro aux : listaLibros) {
            System.out.println(aux.toString());
        }
    }
    
    public void listarPorIsbn() {
        ArrayList<Libro> listaLibros = new ArrayList(biblioteca.listarLibrosPorIsbn());
        for (Libro aux : listaLibros) {
            System.out.println(aux.toString());
        }
    }
    
    
}
