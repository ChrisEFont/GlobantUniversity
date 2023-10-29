/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.Publisher;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import persistence.PublisherDAO;

/**
 *
 * @author chris
 */
public class PublisherService {
    
    static PublisherDAO publisherDAO = new PublisherDAO();
    static Scanner input = new Scanner(System.in);
        
    public static void publisherMenu(){
        
        int option;
        
        do {
            System.out.println("Ingrese una opción");
            System.out.println("1 - Buscar editorial por nombre");
            System.out.println("2 - Buscar editorial por ID");
            System.out.println("3 - Editar editorial");
            System.out.println("4 - Crear un editorial");
            System.out.println("5 - Eliminar una editorial");
            System.out.println("6 - Listar todos las editoriales");
            System.out.println("0 - Salir");
            
            option = input.nextInt();
            input.nextLine();
            
            switch(option){
                case 1:
                    findPublisherByName();
                    break;
                case 2:
                    findPublisherById();
                    break;
                case 3:
                    publisherEdit();
                    break;
                case 4:
                    createPublisher();
                    break;
                case 5:
                    deletePublisher();
                    break;
                case 6:
                    publisherList();
                case 0:
                    break;
                default:
                    System.out.println("Opción invalida");
            }            
        }while (option != 0);        
    }
    
    public static void findPublisherById(){
        String id;
        Publisher publisher;
        System.out.println("Ingrese el ID");
        id = input.nextLine();
        try {
            publisher = publisherDAO.findPublisherdById(id);
            if (publisher == null) {
                System.out.println("-------------*------------");
                System.out.println("No se encontro el ID ingresado");
                System.out.println("-------------*------------");
            } else {
                System.out.println(publisher.toString());
            }            
        } catch (Exception e) {
            e.getMessage();
            System.out.println("Continua ejecución del programa");
        }        
    }
    
    public static void findPublisherByName(){
        List<Publisher> publishers = new ArrayList();
        String name;
        System.out.println("Ingrese el nombre de la editorial");
        name = input.nextLine();
        try {
            publishers = publisherDAO.findPublisherByName(name);
            if (publishers.isEmpty()) {
                System.out.println("-------------*------------");
                System.out.println("No se encontraron coincidencias");
                System.out.println("-------------*------------");
            } else {
                publishers.sort(Publisher.compareName);
                for (Publisher p : publishers) {
                    System.out.println(p.toString());
                }
            }
        } catch (Exception e) {
            e.getMessage();
            System.out.println("Continua ejecución del programa");
        }       
    }
    
    public static void createPublisher(){
        String id;
        String name;
        System.out.println("Ingrese el nombre de la editorial");
        name = input.nextLine();
        System.out.println("Ingrese el CUIT");
        id = input.nextLine();
        Publisher publisher = new Publisher(id, name);
        System.out.println(publisher.toString());
        try {
            publisherDAO.createPublisher(publisher);
            System.out.println("-------------*------------");
            System.out.println("Editorial creada");
            System.out.println("-------------*------------");
        } catch (Exception e) {
            System.out.println("ERROR");
        }        
    }
    
    public static void publisherEdit(){
        Publisher publisher;
        System.out.println("Ingrese el ID de la editorial a modificar");
        publisher = publisherDAO.findPublisherdById(input.nextLine());        
        if (publisher == null) {
            System.out.println("No se encontro editorial con ese ID");
        } else {
            try {
                System.out.println("Ingrese el nuevo nombre");
                publisher.setName(input.nextLine());
                publisherDAO.editPublisher(publisher);
                System.out.println("EDitorial modificada");
            } catch (Exception e) {
                System.out.println("Error al editar editorial");
            }
        }
    }
    
    public static void deletePublisher() {
        Publisher publisher;
        System.out.println("Ingrese el ID de la editorial que desea eliminar");
        publisher = publisherDAO.findPublisherdById(input.nextLine());
        if (publisher == null) {
            System.out.println("No se encontro editorial con ese ID");
        } else {
            System.out.println("Confirma eliminar el editorial: " + publisher.getName() + " (S/N)");
            if (input.nextLine().toUpperCase().equals("S")) {
                try {
                    publisherDAO.deletePublisher(publisher);
                    System.out.println("Editorial eliminada");
                } catch (Exception e) {
                    System.out.println("Error al eliminar editorial");
                }
            }
        }
    }
    
    public static void publisherList(){        
        try {
            List<Publisher> publishers = publisherDAO.publisherList();
            if (publishers.isEmpty()) {
                System.out.println("Sin resultados");
            } else {
                publishers.sort(Publisher.compareName);
                for (Publisher p : publishers) {
                    System.out.println(p.toString());
                }
            }            
        } catch (Exception e) {
            System.out.println("Continua ejecución del progarama");
        }   
    }
    
}
