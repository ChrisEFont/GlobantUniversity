/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7.Service;

import ejercicio7.Entity.Persona;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class PersonaService {
    
    private String nombre, sexo;
    private int edad;
    private float peso, altura;

    public Persona crearPersona() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre");
        nombre=input.nextLine();
        
        System.out.println("Ingrese la edad");
        edad=input.nextInt();
        input.nextLine();

        System.out.println("Ingrese el el sexo (H/M/O)");
        sexo = input.nextLine().toUpperCase();

        while (!sexo.equals("H") && !sexo.equals("M") && !sexo.equals("O")) {
            System.out.println("Opción no valida");
            System.out.println("Vuelva a ingresar el sexo");
            sexo = input.nextLine().toUpperCase();
        }

        System.out.println("Ingrese el peso en Kg");
        peso = input.nextFloat();
        System.out.println("Ingrese la altura en mts");
        altura = input.nextFloat();
        Persona personaS = new Persona(nombre, sexo, edad, peso, altura);
        return personaS;
    }       
}
