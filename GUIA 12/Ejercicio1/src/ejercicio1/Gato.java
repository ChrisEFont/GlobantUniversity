/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author chris
 */
public class Gato extends Animal {
    
    public Gato(String nombre, String alimento, int edad, String raza){
        this.nombre= nombre;
        this.alimento=alimento;
        this.edad=edad;
        this.raza=raza;
    }
    
    @Override
    public void alimentarse(){
        System.out.println("Yo me alimento de "+alimento);        
    }
    
}
