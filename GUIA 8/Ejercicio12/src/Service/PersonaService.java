/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entity.Persona;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class PersonaService {

    public PersonaService() {
    }    
    
    public Persona crearPersona(){
        Persona persona;
        Scanner input = new Scanner(System.in);
        String nombre;
        int anio, mes, dia;
        System.out.println("Ingrese el nombre de la persona");
        nombre = input.nextLine();
        System.out.println("Ingrese la fecha de nacimiento año / mes / dia");
        anio = input.nextInt();
        mes = input.nextInt();
        dia = input.nextInt();
        persona = new Persona(nombre, anio, mes , dia);
        return persona;        
    }
    
    public void mostrarEdad(Persona persona){
        System.out.println("La persona tiene "+persona.calcularEdad()+" años.");
    }
    
    public void mostrarMenorQue(Persona persona){
        Scanner input = new Scanner(System.in);
        int edad;
        
        System.out.println("Ingrese una edad");
        edad=input.nextInt();
        
        if(persona.menorQue(edad)){
            System.out.println("La persona es menor que la edad ingresada");
        }else{
            System.out.println("La persona es mayor que la edad ingresada");
        }
    }
    
    public void mostrarPersona(Persona persona){
        System.out.println(persona.toString());
    }
}
