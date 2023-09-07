/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import enums.CivilStatus;
import java.util.Date;

/**
 *
 * @author chris
 */
public class Employee extends People{    
        
    private Date startDate;
    private int officeNumber;

    public Employee() {
    }

    public Employee(Date startDate, int officeNumber, String firstName, String secondName, String idNumber, CivilStatus civilStatus) {
        super(firstName, secondName, idNumber, civilStatus);
        this.startDate = startDate;
        this.officeNumber = officeNumber;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public int getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(int officeNumber) {
        this.officeNumber = officeNumber;
    }    
    
}
