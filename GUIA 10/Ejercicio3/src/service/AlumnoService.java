/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author chris
 */

public class AlumnoService {
    
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    ArrayList<Alumno> alumnos = new ArrayList();
    
    private static AlumnoService INSTANCE = null;
    
    private AlumnoService(){};
    
        private synchronized static void createInstance() {
        if (INSTANCE == null) { 
            INSTANCE = new AlumnoService();
        }
    }
        
    public static AlumnoService getInstance() {
        if (INSTANCE == null) {
            createInstance();
        }
        return INSTANCE;
    }    
    
    public void crearAlumnos(){
        int opt;
        do{
            System.out.println("Ingrese una opción");
            System.out.println("1 - Crear un alumno");
            System.out.println("0 - Terminar");
            opt=input.nextInt();
            input.nextLine();
            switch(opt){
                case 1:
                    System.out.println("Ingrese el nombre del alumno");
                    String nombre = input.nextLine();
                    System.out.println("Ingrese la primer nota");
                    int n1 = input.nextInt();
                    System.out.println("Ingrese la segunda nota");
                    int n2 = input.nextInt();
                    System.out.println("Ingrese la tercer nota");
                    int n3 = input.nextInt();
                    Alumno alumno = new Alumno(nombre, n1, n2, n3);
                    alumnos.add(alumno);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción invalida");
            }            
        }while(opt!=0);
    }
    
    public float notaFinal(){
        String nombre;
        float promedio=0;
        boolean flag=true;
        int index;
        
        do{
            System.out.println("Ingrese el nombre del alumno buscado");
            nombre = input.nextLine();
  
            for(Alumno aux: alumnos){
                if(aux.getNombre().equals(nombre)){
                    for (int i = 0; i < aux.getNotas().size(); i++) {
                        promedio += aux.getNotas().get(i);
                    }
                    flag=false;
                }              
            }

            if (flag) {
                System.out.println("El alumno ingresado no se encuentra en la lista");
            }

        }while(flag);
        return promedio/3;
    }   
}
