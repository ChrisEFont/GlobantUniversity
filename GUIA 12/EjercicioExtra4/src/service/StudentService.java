/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;
import entity.People;
import entity.Student;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class StudentService {
    
    static Scanner input = new Scanner(System.in);
    
    public static Student createStudent(){
        Student student = new Student();
        dataFill(student);
        return student;
    }
    
    private static void dataFill(Student student){
        System.out.println("Ingrese el nombre");
        student.setFirstName(input.nextLine());
        System.out.println("Ingrese el apellido");
        student.setSecondName(input.nextLine());
        System.out.println("Ingrese el DNI");
        student.setIdNumber(input.nextLine());
        System.out.println("Ingrese el estado civil");
        CivilStatusService.defineCivilStatus(student);                
    }
    
    public static void addCourse(Student student){
        System.out.println("Ingrese el curso que desea agregar");
        student.addCourse(input.nextLine());
    }
    
    public static void deleteCourse(Student student){
        System.out.println("Ingrese el curso que desea eliminar");
        student.getCourses().remove(input.nextLine());
    }
    
    public static void showCourses(Student student){
        for(String aux: student.getCourses()){
            System.out.println(aux);
        }
    }
    
    public static void showStudentInfo(Student student){
        student.toString();
    }
    
    
}
