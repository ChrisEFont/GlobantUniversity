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
public class SportsCenter extends Building{    
    
    private String name;
    private boolean roofing;

    public SportsCenter() {
    }

    public SportsCenter(String name, boolean roofing, float width, float high, float lenght) {
        super(width, high, lenght);
        this.name = name;
        this.roofing = roofing;
    }    
        
    @Override
    public float calculateArea(){
        return super.getLenght()*super.getWidth();
    }
    
    @Override
    public float calculateVolume(){
        return super.getLenght()*super.getWidth()*super.getHeight();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isRoofing() {
        return roofing;
    }

    public void setRoofing(boolean roofing) {
        this.roofing = roofing;
    }   
    
}
