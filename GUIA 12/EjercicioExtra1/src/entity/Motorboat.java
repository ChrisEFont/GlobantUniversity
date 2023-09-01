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
public class Motorboat extends Ship {
    
    public int motorHp;

    public Motorboat() {
    }    

    public int getMotorHp() {
        return motorHp;
    }

    public void setMotorHp(int motorHp) {
        this.motorHp = motorHp;
    }    
    
}
