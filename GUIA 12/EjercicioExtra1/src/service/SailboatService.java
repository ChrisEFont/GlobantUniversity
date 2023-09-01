/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.Sailboat;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class SailboatService {
    
    Scanner input = new Scanner(System.in);

    public SailboatService() {
    }    
    
    public Sailboat createSailboat(){
        Sailboat sailboat = new Sailboat();
        System.out.println("Ingrese la matícula");
        sailboat.setRegistration(input.nextLine());
        System.out.println("Ingrese el año");
        sailboat.setYear(input.nextInt());
        System.out.println("Ingrese la eslora");
        sailboat.setLength(input.nextFloat());
        System.out.println("Ingrese la cantidad de mástiles");
        sailboat.setMastsQuantity(input.nextInt());
        return sailboat;
    }   
}
