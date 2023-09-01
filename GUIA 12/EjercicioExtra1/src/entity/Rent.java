/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;
import java.util.Calendar;

/**
 *
 * @author chris
 */
public class Rent {
    
    private String customerName, customerId;
    private Calendar rentStart, rentEnd;
    private int mooringNumber, days;
    private Ship ship;
    private float price;

    public Rent() {
    }

    public Rent(String customerName, String customerId, Calendar rentStart, Calendar rentEnd, int mooringNumber, Ship ship) {
        this.customerName = customerName;
        this.customerId = customerId;
        this.rentStart = rentStart;
        this.rentEnd = rentEnd;
        this.mooringNumber = mooringNumber;
        this.ship = ship;
        this.days();
        this.price();
    }

    public void days(){
        days=(int)(rentEnd.getTimeInMillis()-rentStart.getTimeInMillis())/ (86400000);
    }
       
    
    public void price(){
        price=days*ship.length;
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

    @Override
    public String toString() {
        return "Rent{" + "customerName=" + customerName + ", customerId=" + customerId + ", mooringNumber=" + mooringNumber + ", days=" + days + ", ship=" + ship + ", price=" + price + '}';
    }  
}
