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
public abstract class Building {
    
    private float width, height, lenght;
    
    public abstract float calculateArea();
    public abstract float calculateVolume();

    public Building() {
    }

    public Building(float width, float height, float lenght) {
        this.width = width;
        this.height = height;
        this.lenght = lenght;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getLenght() {
        return lenght;
    }

    public void setLenght(float lenght) {
        this.lenght = lenght;
    }
    
    


    
    
}
