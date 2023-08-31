/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;
import java.util.Date;

/**
 *
 * @author chris
 */
public class Rent {
    
    private String customerName, customerId;
    private Date rentStart, rentEnd;
    private int mooringNumber, dias;
    private Ship ship;
    private float price;

    public Rent() {
    }    
    
    public void price(){
        price=dias*ship.length;
        if(ship instanceof Sailboat){
            Sailboat sailboat = new Sailboat();
            sailboat = (Sailboat) ship;
            price += sailboat.getMastsQuantity();            
        }
        if (ship instanceof Motorboat){
            Motorboat motorboat = new Motorboat();
            motorboat = (Motorboat) ship;
            price += motorboat.getMotorHp();            
        }
        if(ship instanceof Yacht){
            Yacht yacht = new Yacht();
            yacht = (Yacht) ship;
            price += yacht.getMotorHp() + yacht.getStateroomQuantity();
        }        
    }    
}
