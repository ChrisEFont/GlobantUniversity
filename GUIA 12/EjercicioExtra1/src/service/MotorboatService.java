/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.Motorboat;
import java.util.Scanner;


/**
 *
 * @author chris
 */
public class MotorboatService {
    
    Scanner input = new Scanner(System.in);

    public MotorboatService() {
    }    

    public Motorboat createMotorboat() {
        Motorboat motorboat = new Motorboat();
        System.out.println("Ingrese la matícula");
        motorboat.setRegistration(input.nextLine());
        System.out.println("Ingrese el año");
        motorboat.setYear(input.nextInt());
        System.out.println("Ingrese la eslora");
        motorboat.setLength(input.nextFloat());
        System.out.println("Ingrese la potemcia del motor");
        motorboat.setMotorHp(input.nextInt());
        return motorboat;
    }
}
