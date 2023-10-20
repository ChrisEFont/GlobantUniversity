/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerproyectojpa;

import Entity.Person;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author chris
 */
public class PrimerProyectoJPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EntityManager em = Persistence.createEntityManagerFactory("PrimerProyectoJPAPU").createEntityManager();
        
        Person persona = new Person("F1234", "Ceci", 35);
        
        em.getTransaction().begin();
        em.persist(persona);
        em.getTransaction().commit();
        
        System.out.println("Persona creada");
        
        
    }
    
}
