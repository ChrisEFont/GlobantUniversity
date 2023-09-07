/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.People;
import enums.CivilStatus;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class CivilStatusService { 
    
    public static void defineCivilStatus(People people){
        
    int option;
    
    Scanner input = new Scanner(System.in);  
    
        do {
            System.out.println("Ingrese una opción");
            System.out.println("1 - Soltero / a");
            System.out.println("2 - Concuvinato");
            System.out.println("3 - Casado / a");
            System.out.println("4 - Divorciado / a");
            System.out.println("5 - Viudo / a");
            option = input.nextInt();
            switch (option) {
                case 1:
                    people.setCivilStatus(CivilStatus.SOLTERO);
                    break;
                case 2:
                    people.setCivilStatus(CivilStatus.CONCUVINATO);
                    break;
                case 3:
                    people.setCivilStatus(CivilStatus.CASADO);
                    break;                    
                case 4:
                    people.setCivilStatus(CivilStatus.DIVORCIADO);
                    break;
                case 5:
                    people.setCivilStatus(CivilStatus.VIUDO);
                    break;
                default:
                    System.out.println("Opción invalida");
            }
        } while (option != 0);
    }
}
