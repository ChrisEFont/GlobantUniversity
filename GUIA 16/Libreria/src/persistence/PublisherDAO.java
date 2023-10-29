/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import entity.Publisher;
import java.util.List;

/**
 *
 * @author chris
 */
public class PublisherDAO extends DAO{
    
    public void createPublisher(Publisher publisher) {
        try {
            save(publisher);
        } catch (Exception e) {
            System.out.println("Error al guardar la editorial");
        }
    }
    
    public void editPublisher(Publisher publisher){
        try {
            edit(publisher);
        } catch (Exception e) {
            System.out.println("Error al editar la editorial");
        }
    }
    
    public void deletePublisher(Publisher publisher){
        try {
            delete(publisher);
        } catch (Exception e) {
            System.out.println("Error al eliminar la editorial");
        }
    }
    
    public List<Publisher> findPublisherByName(String name){    
        try {
            connect();
            return em.createQuery("SELECT p FROM Publisher p WHERE p.name LIKE :name").
                setParameter("name", "%"+name+"%").getResultList();            
        } catch (Exception e) {
            System.out.println("Error al buscar editorial");
            return null;
        }finally{
            disconnect();
        }
    }
    
    public Publisher findPublisherdById(String id){
        try {         
            return (Publisher) findById(Publisher.class, id);          
        } catch (Exception e) {
            System.out.println("Error al buscar editorial");
            return null;
        }       
    }
    
    public List<Publisher> publisherList(){
        try {
            return getList("Publisher");             
        } catch (Exception e) {
            System.out.println("Error al listar editoriales");
            return null;            
        }  
    }   
    
}
