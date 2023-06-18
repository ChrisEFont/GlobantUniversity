/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entity.Curso;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class CursoService {
    
    public Curso crearCurso(){
        Scanner input = new Scanner(System.in);
        String nombreCurso, turno;
        int cantidadHorasPorDia, cantidadDiasPorSemana;
        float precioPorHora;
        
        System.out.println("Ingrese el nombre del curso");        
        nombreCurso = input.nextLine();
        
        System.out.println("Ingrese el turno");
        turno = input.nextLine();
        
        System.out.println("Ingrese la cantidad de horas por dia");
        cantidadHorasPorDia = input.nextInt();
        
        System.out.println("Ingrese la cantidad de dias por semana");
        cantidadDiasPorSemana = input.nextInt();
        
        System.out.println("Ingrese el precio por hora");
        precioPorHora = input.nextFloat();        
        
        Curso curso = new Curso(nombreCurso, turno, cantidadHorasPorDia, cantidadDiasPorSemana, precioPorHora);
        return curso;
    }
    
    public void mostrarGananciaSemanal(Curso curso){
        System.out.println("La ganancia semanas es de : "+curso.calcularGananciaSemanal());
    }
    
    public void mostrarCurso(Curso curso){
        System.out.println("Los datos del curso son:");
        System.out.println(curso.toString());
        System.out.println("Lo alumnos inscriptos son:");
        curso.mostrarAlumnos();
    }
}
