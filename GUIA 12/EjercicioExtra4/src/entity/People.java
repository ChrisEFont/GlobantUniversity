/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import enums.CivilStatus;

/**
 *
 * @author chris
 */
public class People {
    
    private String firstName, secondName, idNumber;
    private CivilStatus civilStatus;

    public People() {
    }

    public People(String firstName, String secondName, String idNumber, CivilStatus civilStatus) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.idNumber = idNumber;
        this.civilStatus = civilStatus;
    }   

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public CivilStatus getCivilStatus() {
        return civilStatus;
    }

    public void setCivilStatus(CivilStatus civilStatus) {
        this.civilStatus = civilStatus;
    }    
    
}
