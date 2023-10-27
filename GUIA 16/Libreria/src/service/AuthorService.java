/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.Author;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import persistence.AuthorDAO;

/**
 *
 * @author chris
 */
public class AuthorService {
    
    static AuthorDAO authorDAO = new AuthorDAO();
    static Scanner input = new Scanner(System.in);
        
    public static void authorMenu(){
        
        int option;
        
        do {
            System.out.println("Ingrese una opción");
            System.out.println("1 - Buscar autor por nombre");
            System.out.println("2 - Buscar autor por ID");
            System.out.println("3 - Editar autor");
            System.out.println("4 - Crear un autor");
            System.out.println("5 - Eliminar un autor");
            System.out.println("6 - Listar todos los autores");
            System.out.println("0 - Salir");
            
            option = input.nextInt();
            input.nextLine();
            
            switch(option){
                case 1:
                    findAuthorByName();
                    break;
                case 2:
                    findAuthorById();
                    break;
                case 4:
                    createAuthor();
                    break;
                case 6:
                    authorList();
                case 0:
                    break;
                default:
                    System.out.println("Opción invalida");
            }            
        }while (option != 0);        
    }
    
    public static void findAuthorById(){
        int id;
        Author author;
        System.out.println("Ingrese el ID");
        id = input.nextInt();
        author = authorDAO.finAuthordById(id);
        if(author == null){
            System.out.println("-------------*------------");
            System.out.println("No se encontro el ID ingresado");
            System.out.println("-------------*------------");
        }else{
            System.out.println(author.toString());            
        }        
    }
    
    public static void findAuthorByName(){
        List<Author> authors = new ArrayList();
        String name;
        System.out.println("Ingrese el nombre del autor buscado");
        name = input.nextLine();
        authors = authorDAO.findAuthorByName(name);
        if(authors.isEmpty()){
            System.out.println("-------------*------------");
            System.out.println("No se encontraron coincidencias");
            System.out.println("-------------*------------");
        }else{
            for (Author a : authors) {
                System.out.println(a.toString());
            }
        }        
    }
    
    public static void createAuthor(){
        String name;
        System.out.println("Ingrese el nombre del autor");
        name = input.nextLine();
        Author author = new Author(name);
        try {
            authorDAO.createAuthor(author);
            System.out.println("-------------*------------");
            System.out.println("Autor creado");
            System.out.println("-------------*------------");
        } catch (Exception e) {
            System.out.println("ERROR");
        }        
    }
    
    public static void authorList(){
        
        try {
            List<Author> authors = authorDAO.authorList();

            if (authors.isEmpty()) {
                System.out.println("Sin resultados");
            } else {
                for (Author a : authors) {
                    System.out.println(a.toString());
                }
            }            
        } catch (Exception e) {
            System.out.println("Continua ejecución del progarama");
        }
        
   
    }
}
