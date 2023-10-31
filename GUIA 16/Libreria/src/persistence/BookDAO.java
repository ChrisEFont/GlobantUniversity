/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import entity.Book;
import java.util.List;

/**
 *
 * @author chris
 */
public class BookDAO extends DAO{
    
        public void createBook(Book book) {
        try {
            save(book);
        } catch (Exception e) {
            System.out.println("Error al guardar el libro");
        }
    }
    
    public void editBook(Book book){
        try {
            edit(book);
        } catch (Exception e) {
            System.out.println("Error al editar el libro");
        }
    }
    
    public void deleteBook(Book book){
        try {
            delete(book);
        } catch (Exception e) {
            System.out.println("Error al eliminar el libro");
        }
    }
    
    public List<Book> findBookByTitle(String title){    
        try {
            connect();
            return em.createQuery("SELECT b FROM Book b WHERE b.title LIKE :title").
                setParameter("title", "%"+title+"%").getResultList();            
        } catch (Exception e) {
            System.out.println("Error al buscar el libro");
            return null;
        }finally{
            disconnect();
        }
    }
    
    public Book findBookByISBN(long isbn){
        try {         
            return (Book) findById(Book.class, isbn);          
        } catch (Exception e) {
            System.out.println("Error al buscar el libro");
            return null;
        }       
    }
    
    public List<Book> bookList(){
        try {
            return getList("Book");             
        } catch (Exception e) {
            System.out.println("Error al listar libros");
            return null;            
        }  
    } 
    
}
