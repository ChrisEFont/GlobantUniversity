/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author chris
 */

@Entity

public class Person {
    
    @Id
    private String dni;
    private String name;
    private int age;

    public Person() {
    }

    public Person(String dni, String name, int age) {
        this.dni = dni;
        this.name = name;
        this.age = age;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }   
}
