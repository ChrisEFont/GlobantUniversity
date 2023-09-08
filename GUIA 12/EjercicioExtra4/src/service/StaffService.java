/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.Staff;
import java.util.Scanner;
import service.SectionService;

/**
 *
 * @author chris
 */
public class StaffService {
    
    static Scanner input = new Scanner(System.in);
    
    public static Staff createStaff(){
        Staff staff = new Staff();
        dataFill(staff);
        return staff;
    }
    
    private static void dataFill(Staff staff){
        System.out.println("Ingrese el nombre");
        staff.setFirstName(input.nextLine());
        System.out.println("Ingrese el apellido");
        staff.setSecondName(input.nextLine());
        System.out.println("Ingrese el DNI");
        staff.setIdNumber(input.nextLine());
        System.out.println("Ingrese el estado civil");
        CivilStatusService.defineCivilStatus(staff);
        System.out.println("Ingrese el año de inicio");
        staff.setStartDate(DateService.setDate());
        System.out.println("Ingrese la sección");
        staff.setSection(SectionService.defineSection());
        System.out.println("Ingrese el numero de despacho");
        staff.setOfficeNumber(input.nextInt());
        input.nextLine();        
    }
    
    public static void setSection(Staff staff){
       staff.setSection(SectionService.defineSection()); 
    }
    
    public static void showStaffInfo(Staff staff){
        System.out.println(staff.toString());
    }
    
}
