/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import enums.CivilStatus;
import java.util.ArrayList;

/**
 *
 * @author chris
 */
public class Student extends People{
    
    private ArrayList<String> courses = new ArrayList();

    public Student() {
    }

    public Student(String firstName, String secondName, String idNumber, CivilStatus civilStatus) {
        super(firstName, secondName, idNumber, civilStatus);
    }

    public ArrayList<String> getCourses() {
        return courses;
    }
    
    public void addCourse(String course){
        this.courses.add(course);
    }   
    
}
