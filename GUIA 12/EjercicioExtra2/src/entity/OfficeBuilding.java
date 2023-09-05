/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author chris
 */
public class OfficeBuilding extends Building {
    
    private int officesQuantity, peoplePerOffice, floors;

    public OfficeBuilding() {
    }

    public OfficeBuilding(int officesQuantity, int peoplePerOffice, int floors, float width, float height, float lenght) {
        super(width, height, lenght);
        this.officesQuantity = officesQuantity;
        this.peoplePerOffice = peoplePerOffice;
        this.floors = floors;
    }    
    
    @Override
    public float calculateArea(){
        return super.getLenght()*super.getWidth()*(this.getFloors()+1);
    }
    
    @Override
    public float calculateVolume(){
        return super.getLenght()*super.getWidth()*super.getHeight()*(this.getFloors()+1);
    }
    
    public int calculatePeoplePerFloor(){
        return officesQuantity*peoplePerOffice;
    }
    
    public int totalPeople(){
        return officesQuantity*peoplePerOffice*floors;
    }

    public int getOfficesQuantity() {
        return officesQuantity;
    }

    public void setOfficesQuantity(int officesQuantity) {
        this.officesQuantity = officesQuantity;
    }

    public int getPeoplePerOffice() {
        return peoplePerOffice;
    }

    public void setPeoplePerOffice(int peoplePerOffice) {
        this.peoplePerOffice = peoplePerOffice;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    } 
    
}
