/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import java.util.Scanner;
import service.AuthorService;
import service.BookService;
import service.PublisherService;

/**
 *
 * @author chris
 */
public class Libreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int option;
        Scanner input = new Scanner(System.in);
        
        
        
        do{
            System.out.println("Ingrese una opción");
            System.out.println("1 - Módulo de libros");
            System.out.println("2 - Módulo de Autores");
            System.out.println("3 - Módulo de Editoriales");
            System.out.println("0 - Salir");
            
            option = input.nextInt();
            input.nextLine();
            
            
            switch(option){
                case 1:
                    BookService.bookMenu();
                    break;
                case 2:
                    AuthorService.authorMenu();
                    break;
                case 3:
                    PublisherService.publisherMenu();
                case 0:
                    break;
                default:
                    System.out.println("Opción invalida");                    
            }
            
        }while(option != 0);
    }
    
}
