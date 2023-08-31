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
public class Yacht extends Ship {
    
    public int motorHp, stateroomQuantity;

    public int getMotorHp() {
        return motorHp;
    }

    public void setMotorHp(int motorHp) {
        this.motorHp = motorHp;
    }

    public int getStateroomQuantity() {
        return stateroomQuantity;
    }

    public void setStateroomQuantity(int stateroomQuantity) {
        this.stateroomQuantity = stateroomQuantity;
    }       
    
}
