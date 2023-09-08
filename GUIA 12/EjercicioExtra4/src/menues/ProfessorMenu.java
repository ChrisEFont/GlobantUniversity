/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menues;

import entity.People;
import entity.Professor;
import java.util.ArrayList;
import java.util.Scanner;
import service.ProfessorService;

/**
 *
 * @author chris
 */
public class ProfessorMenu {
    
    static Scanner input = new Scanner(System.in);
    
    public static void professorMenu(ArrayList<People> people){
        
        int option;
        do {
            System.out.println("Ingrese una opción");
            System.out.println("1 - Mostrar nómina profesores");
            System.out.println("2 - Dar de alta un profesor");
            System.out.println("3 - Reasugnar departamento");
            System.out.println("4 - Mostrar datos de un profesor");
            System.out.println("0 - Finalizar");
            option = input.nextInt();
            switch (option) {
                case 1:
                    showProfessors(people);
                    break;
                case 2:
                    people.add(ProfessorService.createProfessor());
                    break;
                case 3:
                    changeDepartment(people);
                    break;
                case 4:
                    showProfessorInfo(people);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción invalida");
            }
        } while (option != 0);    
        
    }
    
    public static void showProfessors(ArrayList<People> people) {
        for (People aux : people) {
            if (aux instanceof Professor) {
                System.out.println(aux.getSecondName() + "," + aux.getFirstName());
            }
        }
    }
    
    public static void changeDepartment(ArrayList<People> people) {
        System.out.println("Ingrese el DNI del profesor buscado");
        String idNumber = input.nextLine();
        for (People aux : people) {
            if (aux.getIdNumber().equals(idNumber)) {
                ProfessorService.setDepartment((Professor) aux);
            }
        }
    }
    
    public static void showProfessorInfo(ArrayList<People> people) {
        System.out.println("Ingrese el DNI del profesor buscado");
        String idNumber = input.nextLine();
        for (People aux : people) {
            if (aux.getIdNumber().equals(idNumber)) {
                ProfessorService.showProfessorInfo((Professor)aux);
            }
        }
    }
    
    
    
    
}
