/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.Ship;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class ShipService {
    
    private Ship ship;
    
    SailboatService sailboatService = new SailboatService();
    MotorboatService motorboatService = new MotorboatService();
    YachtService yachtService = new YachtService();    
    
    Scanner input = new Scanner(System.in);
    
    public Ship createShip(){
        int option;
        do {
            System.out.println("Ingrese el tipo de embarcación");
            System.out.println("1 - Velero");
            System.out.println("2 - Motorizado");
            System.out.println("3 - Yate");
            option = input.nextInt();
            switch (option) {
                case 1:
                    ship = sailboatService.createSailboat();
                    break;
                case 2:
                    ship = motorboatService.createMotorboat();
                    break;
                case 3:
                    ship = yachtService.createYacht();
                    break;
                default:
                    System.out.println("Opción invalida");
            }
        } while (option != 1 && option != 2 && option != 3);
        return ship;
    }
    
    
    
}
