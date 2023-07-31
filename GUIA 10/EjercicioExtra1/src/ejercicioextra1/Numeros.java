package ejercicioextra1;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class Numeros {
    private ArrayList<Integer> numeros = new ArrayList();
    
    public void agregarNumero(int numero){
        this.numeros.add(numero);
    }
    
    public int sumatoria(){
        int suma=0;
        for(Integer aux: numeros){
            suma += aux;
        }
        return suma;
    }   
    
    
    public void obtenerDatos(){
        System.out.println("Cantidad de elementos ingresados: "+numeros.size());
        System.out.println("La suma de los elementos es: "+ sumatoria());
        System.out.println("La media es: "+ sumatoria()/numeros.size());
    }
    
}
