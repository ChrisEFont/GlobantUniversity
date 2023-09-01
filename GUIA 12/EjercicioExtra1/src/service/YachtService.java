/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.Yacht;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class YachtService {
    
    Scanner input = new Scanner(System.in);

    public YachtService() {
    }    
    
    public Yacht createYacht() {
        Yacht yacht = new Yacht();
        System.out.println("Ingrese la matícula");
        yacht.setRegistration(input.nextLine());
        System.out.println("Ingrese el año");
        yacht.setYear(input.nextInt());
        System.out.println("Ingrese la eslora");
        yacht.setLength(input.nextFloat());
        System.out.println("Ingrese la potemcia del motor");
        yacht.setMotorHp(input.nextInt());
        System.out.println("Ingrese la cantidad de camarotes");
        yacht.setStateroomQuantity(input.nextInt());
        return yacht;
    }
    
}
