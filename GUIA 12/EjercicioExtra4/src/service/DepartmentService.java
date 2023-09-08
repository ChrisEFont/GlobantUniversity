/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.Professor;
import enums.Department;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class DepartmentService {
    
    
    
    public static Department defineDeparment(){
        
        int option;
        Department department=null;
        
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Ingrese una opción");
            System.out.println("1 - Maths");
            System.out.println("2 - Lenguages");
            System.out.println("3 - Engineering");
            System.out.println("4 - Architectura");
            System.out.println("5 - History");
            option = input.nextInt();
            switch (option) {
                case 1:
                    department=Department.MATHS;
                    break;
                case 2:
                    department=Department.LENGUAGES;
                    break;
                case 3:
                    department=Department.ENGINEERING;
                    break;
                case 4:
                    department=Department.ARCHITECTURA;
                    break;
                case 5:
                    department=Department.HISTORY;
                    break;
                default:
                    System.out.println("Opción invalida");
            }
        } while (option!=1 && option!=2 && option!=3 && option!=4 && option!=5);
        
        input.nextLine();
        
        return department;        
    }
    

}
