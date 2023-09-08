/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra4;

import entity.People;
import menues.ProfessorMenu;
import java.util.ArrayList;
import java.util.Scanner;
import menues.StaffMenu;
import menues.StudentMenu;

/**
 *
 * @author chris
 */
public class EjercicioExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<People> people = new ArrayList();
        
        Scanner input = new Scanner(System.in);
        
        int option;
        do {
            System.out.println("Ingrese una opción");
            System.out.println("1 - Ingresar sección de alumnos");
            System.out.println("2 - Ingresar sección de profesores");
            System.out.println("3 - Ingresar a la sección de staff");
            System.out.println("0 - Finalizar");
            option = input.nextInt();
            switch (option) {
                case 1:
                    StudentMenu.studentMenu(people);
                    break;
                case 2:
                    ProfessorMenu.professorMenu(people);
                    break;
                case 3:
                    StaffMenu.staffMenu(people);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción invalida");
            }
        } while (option != 0);
        

        
    }
    
}
