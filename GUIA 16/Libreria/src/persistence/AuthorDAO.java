/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import entity.Author;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chris
 */
public class AuthorDAO extends DAO {
    
    public void createAuthor(Author author){
        try {
            save(author);            
        } catch (Exception e) {
            System.out.println("Error al guardar el autor");
        }                
    }
    
    public void editAuthor(Author author){
        try {
            edit(author);
        } catch (Exception e) {
            System.out.println("Error al editar el autor");
        }
    }
    
    public void deleteAuthor(Author author){
        try {
            delete(author);
        } catch (Exception e) {
            System.out.println("Error al eliminar el autor");
        }
    }
    
    public List<Author> findAuthorByName(String name){
        List authors = new ArrayList();        
        try {
            connect();
            authors = em.createQuery("SELECT a FROM Author a WHERE a.name LIKE :name").
                setParameter("name", "%"+name+"%").getResultList();            
        } catch (Exception e) {
            System.out.println("Error");
        }finally{
            disconnect();
        }        
        return authors;
    }
    
    public Author finAuthordById(int id){
        Author author = null;
        try {
            author = (Author) findById(Author.class, id);          
        } catch (Exception e) {
            System.out.println("Error al buscar");
        }finally{
            return author;            
        }        
    }
    
    public List<Author> authorList(){
        try {
            return getList("Author");             
        } catch (Exception e) {
            System.out.println("Error al listar autores");
            return null;            
        }  
    }
    

    
    
    
    
    
    
}
