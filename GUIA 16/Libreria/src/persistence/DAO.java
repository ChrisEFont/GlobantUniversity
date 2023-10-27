/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import entity.Author;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author chris
 */
public abstract class DAO <g> {
    
    EntityManager em;
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
   
    
    protected void connect(){        
        try{
            this.em = emf.createEntityManager();            
        }        
        catch(Exception e){
            System.out.println("Error al concetar a la base de datos");
        }        
    }
    
    protected void disconnect(){
        if(em.isOpen()){
            em.close();
        }
    }    
    
    protected void save(g entity){
        try {
            this.connect();
            em.getTransaction().begin();
            em.persist(entity);
            em.getTransaction().commit();            
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.out.println("Error al guardar datos");
        } finally{
            this.disconnect();            
        }        
    }
    
    protected void edit(g entity){
        try {
            this.connect();
            em.getTransaction().begin();
            em.merge(entity);
            em.getTransaction().commit();            
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.out.println("Error al editar datos");
        }finally{
            this.disconnect();
        }
    }
    
    protected void delete(g entity){
        try {
            this.connect();
            em.getTransaction().begin();
            em.remove(entity);
            em.getTransaction().commit();            
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.out.println("Error al eliminar datos");
        }finally{
            this.disconnect();
        }
    }
    
    protected Object findById(Class c, g id){
        connect();
        Object o = null;
        try {
        o = em.find(c, id);           
        } catch (Exception e) {
            System.out.println("Error al buscar datos");
        }
        disconnect();
        return o;       
    }
    
    protected List<Object> getList(g entity){
        //this.connect();
        try {
           return em.createQuery("SELECT e FROM " +entity+ " e").getResultList();
        } catch (Exception e) {
            System.out.println("Error al listar datos");
        }
        disconnect();
        return null;
    }
            
}
