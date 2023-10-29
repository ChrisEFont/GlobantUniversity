/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Comparator;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author chris
 */

@Entity
public class Publisher {
    
    @Id
    private String id;
    private String name;

    public Publisher() {
    }

    public Publisher(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public static Comparator<Publisher> compareName = new Comparator<Publisher>() {
        @Override
        public int compare(Publisher p1, Publisher p2) {
            return p1.getName().compareTo(p2.getName());
        }
    };

    @Override
    public String toString() {
        return id + "  " + name;
    }
    
    
    
}
