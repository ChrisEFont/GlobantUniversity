/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.Staff;
import enums.Section;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class SectionService {
    
    public static Section defineSection(){
        
        int option;
        Section section=null;
        
        Scanner input = new Scanner(System.in);
        
                do {
            System.out.println("Ingrese una opción");
            System.out.println("1 - Administración");
            System.out.println("2 - Decanato");
            System.out.println("3 - Biblioteca");
            System.out.println("4 - Secretaría");
            option = input.nextInt();
            switch (option) {
                case 1:
                    section=Section.ADMINISTRATION;
                    break;
                case 2:
                    section=Section.DEANER;
                    break;
                case 3:
                    section=Section.LIBRARY;
                    break;
                case 4:
                    section=Section.SECRETARIAT;
                    break;
                default:
                    System.out.println("Opción invalida");
            }
        } while (option!=1 && option!=2 && option!=3 && option!=4 && option!=5);
        
        input.nextLine();
        
        return section;        
    }
    
}
