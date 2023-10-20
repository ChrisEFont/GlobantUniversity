/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.Author;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author chris
 */
public class AuthorService {
    
    static Scanner input = new Scanner(System.in);
    static EntityManager em = Persistence.createEntityManagerFactory("LibreriaPU").createEntityManager();
    
    public static void authorMenu(){
        
        int option;
        
        do {
            System.out.println("Ingrese una opción");
            System.out.println("1 - Buscar autor por nombre");
            System.out.println("2 - Buscar autor por ID");
            System.out.println("3 - Editar autor");
            System.out.println("4 - Crear un autor");
            System.out.println("5 - Eliminar un autor");
            System.out.println("0 - Salir");
            
            option = input.nextInt();
            input.nextLine();
            
            switch(option){
                case 4:
                    crateAuthor();
                    break;
                default:
                    System.out.println("Opción invalida");
            }            
        }while (option != 0);        
    }
    
    public static void findAuthorByname(){
        String name;
        System.out.println("Ingrese el nombre del autor buscado");
        name = input.nextLine();
        em.createQuery("select a from author a where a.name like :%name%").setParameter("name", name).getSingleResult();
        
    }
    
    public static void crateAuthor(){
        String name;
        System.out.println("Ingrese el nombre del autor");
        name = input.nextLine();
        Author author = new Author(name);
        em.getTransaction().begin();
        em.persist(author);
        em.getTransaction().commit();
        System.out.println("Autor creado");
    }    
}
