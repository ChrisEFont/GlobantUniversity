/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;
import entity.Professor;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class ProfessorService {    
    
    static Scanner input = new Scanner(System.in);
    
    public static Professor createProfessor(){
        Professor professor = new Professor();
        dataFill(professor);
        return professor;
    }
    
    private static void dataFill(Professor professor){
        System.out.println("Ingrese el nombre");
        professor.setFirstName(input.nextLine());
        System.out.println("Ingrese el apellido");
        professor.setSecondName(input.nextLine());
        System.out.println("Ingrese el DNI");
        professor.setIdNumber(input.nextLine());
        System.out.println("Ingrese el estado civil");
        CivilStatusService.defineCivilStatus(professor);
        System.out.println("Ingrese el año de inicio");
        professor.setStartDate(DateService.setDate());
        professor.setDepartment(DepartmentService.defineDeparment());
        System.out.println("Ingrese el numero de despacho");
        professor.setOfficeNumber(input.nextInt());
        input.nextLine();
    }    
}
