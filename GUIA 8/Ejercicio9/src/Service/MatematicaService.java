/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entity.Matematica;

/**
 *
 * @author chris
 */
public class MatematicaService {
    
    public Matematica crearMatematica(){
        float num1 = (float) Math.random()*10;
        float num2 = (float) Math.random()*10;
        Matematica matematica = new Matematica(num1, num2); 
        System.out.println("Matematica creada");
        return matematica;        
    }
    
    public void verMayorS(Matematica matematica){
        System.out.println("El mayor de los numeros es:" + matematica.devolverMayor());
    }
    
    public void calcularPotenciaS(Matematica matematica){
        System.out.println(matematica.devolverMayor()+"^"+matematica.devolverMenor()+"="+matematica.calcularPotencia());
    }
    
    public void calcularRaiz(Matematica matematica){
        System.out.println("raiz cuadrada de "+matematica.devolverMenor()+" es "+matematica.calculaRaiz());
    }
    
    public void ts(Matematica matematica){
        System.out.println(matematica.toString()); 
    }
    
}
