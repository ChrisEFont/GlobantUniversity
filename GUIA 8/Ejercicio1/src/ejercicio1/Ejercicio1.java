/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import Entity.Libro;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        mostrarLibro(cargarLibro());
        
    }
    
    public static Libro cargarLibro() {
        int isbn;
        String titulo;
        String autor;
        int numeroPaginas;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el numero ISBN");        
        isbn = input.nextInt();
        input.nextLine();
        
        System.out.println("Ingrese el título del libro");        
        titulo = input.nextLine();
        
        System.out.println("INgrese el autor del libro");
        autor = input.nextLine();
        
        System.out.println("Ingrese el numero de páginas");
        numeroPaginas = input.nextInt();
        input.nextLine();

        Libro nvoLibro = new Libro(isbn, titulo, autor, numeroPaginas);
        
        return nvoLibro;
    }
    
    public static void mostrarLibro(Libro libro){
            System.out.println(libro.isbn);   
    }

}
