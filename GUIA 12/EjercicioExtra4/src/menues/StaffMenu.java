/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menues;

import entity.People;
import entity.Staff;
import java.util.ArrayList;
import java.util.Scanner;
import service.StaffService;

/**
 *
 * @author chris
 */
public class StaffMenu {
    
    static Scanner input = new Scanner(System.in);
    
    public static void staffMenu(ArrayList<People> people){
        
        int option;
        do {
            System.out.println("Ingrese una opción");
            System.out.println("1 - Mostrar la nómina de Staff");
            System.out.println("2 - Dar de alta un miembro del Staff");
            System.out.println("3 - Modificar la sección de un miembro");
            System.out.println("4 - Mostrar la información de un miembro");
            System.out.println("0 - Finalizar");
            option = input.nextInt();
            switch (option) {
                case 1:
                    showStaff(people);
                    break;
                case 2:
                    people.add(StaffService.createStaff());
                    break;
                case 3:
                    changeSection(people);
                    break;
                case 4:
                    showStaffInfo(people);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción invalida");
            }
        } while (option != 0);
        
        input.nextInt();
    }
    
    public static void showStaff(ArrayList<People> people) {
        for (People aux : people) {            
            if (aux instanceof Staff) {
                System.out.println(aux.getSecondName() + "," + aux.getFirstName());
            }
        }
    }
    
    public static void changeSection(ArrayList<People> people) {
        input.nextLine();
        System.out.println("Ingrese el DNI del miembro buscado");
        String idNumber = input.nextLine();
        for (People aux : people) {
            if (aux.getIdNumber().equals(idNumber)) {
                StaffService.setSection((Staff) aux);
            }
        }
    }
    
    public static void showStaffInfo(ArrayList<People> people) {
        input.nextLine();
        System.out.println("Ingrese el DNI del miembro buscado");
        String idNumber = input.nextLine();
        for (People aux : people) {
            if (aux.getIdNumber().equals(idNumber)) {
                StaffService.showStaffInfo((Staff)aux);
            }
        }
    }
    
    
    
}
