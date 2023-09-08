/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import enums.CivilStatus;
import enums.Department;
import java.util.Date;

/**
 *
 * @author chris
 */
public class Professor extends Employee{
    
    private Department department;

    public Professor() {
    }

    public Professor(Department department, Date startDate, int officeNumber, String firstName, String secondName, String idNumber, CivilStatus civilStatus) {
        super(startDate, officeNumber, firstName, secondName, idNumber, civilStatus);
        this.department = department;
    }    

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Professor{" +super.getFirstName()+" "+super.getSecondName()+" "+ "department=" + department + '}';
    }   
    
}
