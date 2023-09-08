/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menues;

import entity.People;
import entity.Student;
import java.util.ArrayList;
import java.util.Scanner;
import service.StudentService;




/**
 *
 * @author chris
 */
public class StudentMenu {
    
    static Scanner input = new Scanner(System.in);
    
    public static void studentMenu(ArrayList<People> people){
        

        
        int option;
    
        do {
            System.out.println("Ingrese una opción");
            System.out.println("1 - Mostrar alumnos");
            System.out.println("2 - Dar de alta un alumno");
            System.out.println("3 - Agregar matricula a un alumno");
            System.out.println("4 - Eliminar matrícula de un alumno");
            System.out.println("5 - Mostrar datos de un alumno");
            System.out.println("0 - Finalizar");
            option = input.nextInt();
            switch (option) {
                case 1:
                    showStudents(people);
                    break;
                case 2:
                    people.add(StudentService.createStudent());
                    break;
                case 3:
                    addCourse(people);
                    break;
                case 4:
                    removeCourse(people);
                    break;
                case 5:
                    showStudentInfo(people);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción invalida");
            }
        } while (option!= 0);       
    }
    
    public static void showStudents(ArrayList<People> people) {
        for (People aux : people) {            
            if (aux instanceof Student) {
                System.out.println(aux.getSecondName() + "," + aux.getFirstName());
            }
        }
    }

    public static void addCourse(ArrayList<People> people) {
        System.out.println("Ingrese el DNI del alumno deseado");
        String idNumber = input.nextLine();
        for (People aux : people) {
            if (aux.getIdNumber().equals(idNumber)) {
                StudentService.addCourse((Student)aux);
            }
        }
    }
    
    public static void removeCourse(ArrayList<People> people) {
        System.out.println("Ingrese el DNI del alumno deseado");
        String idNumber = input.nextLine();
        for (People aux : people) {
            if (aux.getIdNumber().equals(idNumber)) {
                StudentService.deleteCourse((Student) aux);
            }
        }
    }
    
    
    public static void showStudentInfo(ArrayList<People> people) {
        System.out.println("Ingrese el DNI del alumno deseado");
        String idNumber = input.nextLine();
        for (People aux : people) {
            if (aux.getIdNumber().equals(idNumber)) {
                StudentService.showStudentInfo((Student)aux);
            }
        }
    }

    
    
}
