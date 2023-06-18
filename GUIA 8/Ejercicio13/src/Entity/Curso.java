/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class Curso {
    private String nombreCurso, turno;
    private String alumnos[] = new String[5];
    private int cantidadHorasPorDia, cantidadDiasPorSemana;
    
    private float precioPorHora;

    public Curso(String nombreCurso, String turno, int cantidadHorasPorDia, int cantidadDiasPorSemana, float precioPorHora) {
        this.nombreCurso = nombreCurso;
        this.turno = turno;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.precioPorHora = precioPorHora;
        cargarAlumnos();
    }
    
    
    
    public String[] cargarAlumnos(){
        
        Scanner input = new Scanner(System.in);
        
        for(int i=0; i<alumnos.length; i++){            
            System.out.println("Ingrese el nombre del alumno");
            alumnos[i]=input.nextLine();
        }
        
        return alumnos;
    }
    
    public float calcularGananciaSemanal(){
        return precioPorHora*cantidadHorasPorDia*cantidadDiasPorSemana*alumnos.length;
    }

    @Override
    public String toString() {
        return "Curso{" + "nombreCurso=" + nombreCurso + ", turno=" + turno + ", cantidadHorasPorDia=" + cantidadHorasPorDia + ", cantidadDiasPorSemana=" + cantidadDiasPorSemana + ", precioPorHora=" + precioPorHora + '}';
    }
    
    public void mostrarAlumnos(){
        for(String i: alumnos){
            System.out.println(i);
        }
    }
    
    
}
