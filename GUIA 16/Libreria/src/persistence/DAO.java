/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

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
            System.out.println("Error al conectar a la base de datos");
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
            entity = em.merge(entity);
            em.remove(entity);
            em.getTransaction().commit();            
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.out.println("Error al eliminar datos");
            System.out.println(e.getMessage());
        }finally{
            this.disconnect();
        }
    }
    
    protected Object findById(Class c, g id){
        try {
            connect();
            return em.find(c, id);
        } catch (Exception e) {
            System.out.println("Error al buscar datos");
            return null;
        }finally{
            disconnect();
        }     
    }
    
    protected List<Object> getList(g entity){        
        try {
           this.connect();
           return em.createQuery("SELECT e FROM " +entity+ " e").getResultList();
        } catch (Exception e) {
            System.out.println("Error al listar datos");
            return null;
        }finally{
            disconnect();
        }
    }            
}
