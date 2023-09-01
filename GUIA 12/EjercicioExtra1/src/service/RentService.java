package service;

import entity.Rent;
import entity.Ship;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class RentService {
    
    Scanner input = new Scanner(System.in);
    
    
    public Rent createRent(){
        
        CalendarService calendarService = new CalendarService();
        
        System.out.println("Ingrese el nombre del cliente");
        String customerName = input.nextLine();
        System.out.println("Ingrese el DNI del cliente");
        String customerId = input.nextLine();
        ShipService shipService = new ShipService();
        Ship ship = shipService.createShip();
        System.out.println("Ingrese el numero de amarre");
        int mooringNumber = input.nextInt();        
        Calendar rentStart = Calendar.getInstance();
        System.out.println("Fecha de inicio");
        calendarService.setDate(rentStart);
        System.out.println("Fecha de fin");
        Calendar rentEnd = Calendar.getInstance();
        calendarService.setDate(rentEnd);
        Rent rent = new Rent(customerName, customerId, rentStart, rentEnd, mooringNumber, ship);
        return rent;        
    }
    
    public void showRents(ArrayList<Rent> rents){
        for(Rent aux: rents){
            System.out.println(aux.toString());
        }
    }
    
    
}
