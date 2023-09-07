/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import enums.CivilStatus;
import enums.Section;
import java.util.Date;

/**
 *
 * @author chris
 */
public class Staff extends Employee{
    
    private Section section;

    public Staff() {
    }

    public Staff(Section section, Date startDate, int officeNumber, String firstName, String secondName, String idNumber, CivilStatus civilStatus) {
        super(startDate, officeNumber, firstName, secondName, idNumber, civilStatus);
        this.section = section;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    } 
    
    
}
