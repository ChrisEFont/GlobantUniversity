/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;
import service.AlumnoService;

/**
 *
 * @author chris
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n") ;
        int opt;
        AlumnoService alumnoService = AlumnoService.getInstance();
        do{
            System.out.println("Ingrese una opción");
            System.out.println("1 - Ingresar alumnos");
            System.out.println("2 - Consultar nota final");
            System.out.println("0 - Finalizar");
            opt = input.nextInt();
            switch(opt){
                case 1:
                    alumnoService.crearAlumnos();
                    break;
                case 2: System.out.println(alumnoService.notaFinal());
                    break;
                case 0:
                    System.out.println("Sesion terminada");
                default:
                    System.out.println("Opción invalida");
                    break;
            }
        }while(opt!=0);

    }
    
}
