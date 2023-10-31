/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.Author;
import entity.Book;
import entity.Publisher;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import persistence.BookDAO;

/**
 *
 * @author chris
 */
public class BookService {
    
    static BookDAO bookDAO = new BookDAO();
    static Scanner input = new Scanner(System.in);

    public static void bookMenu() {

        int option;

        do {
            System.out.println("Ingrese una opción");
            System.out.println("1 - Buscar libro por título");
            System.out.println("2 - Buscar libro por ID");
            System.out.println("3 - Editar libro");
            System.out.println("4 - Crear un libro");
            System.out.println("5 - Eliminar un libro");
            System.out.println("6 - Listar todos los libros");
            System.out.println("0 - Salir");

            option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 1:
                    findBookByTitle();
                    break;
                case 2:
                    findBookByISBN();
                    break;
                case 3:
                    bookEdit();
                    break;
                case 4:
                    createBook();
                    break;
                case 5:
                    deleteBook();
                    break;
                case 6:
                    bookList();
                case 0:
                    break;
                default:
                    System.out.println("Opción invalida");
            }
        } while (option != 0);
    }

    public static void findBookByISBN() {
        long isbn;
        Book book;
        System.out.println("Ingrese el ISBN");
        isbn = input.nextLong();
        try {
            book = bookDAO.findBookByISBN(isbn);
            if (book == null) {
                System.out.println("-------------*------------");
                System.out.println("No se encontro el ISBN ingresado");
                System.out.println("-------------*------------");
            } else {
                System.out.println(book.toString());
            }
        } catch (Exception e) {
            e.getMessage();
            System.out.println("Continua ejecución del programa");
        }
    }

    public static void findBookByTitle() {
        List<Book> books = new ArrayList();
        String title;
        System.out.println("Ingrese el título del libro");
        title = input.nextLine();
        try {
            books = bookDAO.findBookByTitle(title);
            if (books.isEmpty()) {
                System.out.println("-------------*------------");
                System.out.println("No se encontraron coincidencias");
                System.out.println("-------------*------------");
            } else {
                //publishers.sort(Publisher.compareName);
                for (Book b : books) {
                    System.out.println(b.toString());
                }
            }
        } catch (Exception e) {
            e.getMessage();
            System.out.println("Continua ejecución del programa");
        }
    }

    public static void createBook() {
        long isbn;
        int copies, copiesAvailable, copiesBorroweds;
        Author author;        
        Publisher publisher;
        String title, publisherId;
        System.out.println("Ingrese el título del libro");
        title = input.nextLine();
        System.out.println("Ingrese el ISBN");
        isbn = input.nextLong();
        System.out.println("Ingrese el ID del autor");
        author = AuthorService.getAuthorById(input.nextInt());
        input.nextLine();
        System.out.println("Ingrese el CUIT de la editorial");
        publisher = PublisherService.getPublisherById(input.nextLine());
        System.out.println("Ingrese la cantidad ejemplares");
        copies = input.nextInt();        
        Book book = new Book(isbn, title, copies, 0, copies, author, publisher);
        System.out.println(book.toString());
        try {
            bookDAO.createBook(book);
            System.out.println("-------------*------------");
            System.out.println("Libro creado");
            System.out.println("-------------*------------");
        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }

    public static void bookEdit() {
        Book book;
        System.out.println("Ingrese el ISBN del libro a modificar");
        book = bookDAO.findBookByISBN(input.nextLong());
        if (book == null) {
            System.out.println("No se encontro libro con ese ISBN");
        } else {
            try {
                System.out.println("Ingrese el nuevo título");
                book.setTitle(input.nextLine());
                bookDAO.editBook(book);
                System.out.println("Libro modificado");
            } catch (Exception e) {
                System.out.println("Error al editar libro");
            }
        }
    }

    public static void deleteBook() {
        Book book;
        System.out.println("Ingrese el ID del libro que desea eliminar");
        book = bookDAO.findBookByISBN(input.nextLong());
        input.nextLine();
        if (book == null) {
            System.out.println("No se encontro libro con ese ISBN");
        } else {
            System.out.println("Confirma eliminar el libro: " + book.getTitle() + " (S/N)");
            if (input.nextLine().toUpperCase().equals("S")) {
                try {
                    bookDAO.deleteBook(book);
                    System.out.println("Libro eliminado");
                } catch (Exception e) {
                    System.out.println("Error al eliminar libro");
                }
            }
        }
    }

    public static void bookList() {
        try {
            List<Book> books = bookDAO.bookList();
            if (books.isEmpty()) {
                System.out.println("Sin resultados");
            } else {
                //publishers.sort(Publisher.compareName);
                for (Book b : books) {
                    System.out.println(b.toString());
                }
            }
        } catch (Exception e) {
            System.out.println("Continua ejecución del progarama");
        }
    }    
}
