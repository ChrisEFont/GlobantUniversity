/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

import Entity.Persona;
import Service.PersonaService;

/**
 *
 * @author chris
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaService personaServ = new PersonaService();
        Persona persona = personaServ.crearPersona();
        personaServ.mostrarEdad(persona);
        personaServ.mostrarMenorQue(persona);
        personaServ.mostrarPersona(persona);
        
    }
    
}
