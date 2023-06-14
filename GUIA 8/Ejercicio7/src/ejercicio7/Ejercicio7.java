/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import ejercicio7.Entity.Persona;
import ejercicio7.Service.PersonaService;

/**
 *
 * @author chris
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona personas[] = new Persona [4];
        int pesoBajo=0, pesoIdeal=0, pesoAlto=0, mayores=0, menores=0;
        float porMayores, porMenores;
        
        for (int i = 0; i < personas.length; i++) {
            PersonaService personaS = new PersonaService();
            Persona persona = personaS.crearPersona();
            personas[i]=persona; 
            System.out.println("--------------------------");
        }

//Carga del vector personas para evitar el ingreso manual de la informacion
//        personas[0]= new Persona("Juan Cruz", "H", 21, 70,  1.7f );
//        personas[1]= new Persona("Julieta", "M", 32, 65, 1.6f );
//        personas[2]= new Persona("Cecilia", "M", 15, 48, 1.5f );
//        personas[3]= new Persona("Mateo", "H", 12, 55, 1.65f );        
        
        
        for (int i = 0; i < personas.length; i++) {
            
            switch (personas[i].calcularImc(personas[i].getPeso(), personas[i].getAltura())) {
                case -1:
                    pesoBajo++;
                    break;
                case 0:
                    pesoIdeal++;
                    break;
                case 1:
                    pesoAlto++;
                    break;
            }
            
            if(personas[i].esMayorDeEdad(personas[i].getEdad())){
                mayores++;
            }else{
                menores++;
            }            
        }
        
        porMayores= (float) mayores/(menores+mayores)*100;
        porMenores=(float) menores/(menores+mayores)*100;
        
        System.out.println("Personas por debajod de su peso ideal: "+pesoBajo);
        System.out.println("Personas en su peso ideal: "+pesoIdeal);
        System.out.println("Personas por encima de su peso ideal: "+pesoAlto);
        System.out.println("Personas mayores: "+ porMayores +" %");
        System.out.println("Personas menosres: "+ porMenores +" %");        
        
        for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i].toString());         
        }        
    }
    
}
