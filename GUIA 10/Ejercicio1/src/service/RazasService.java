/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.Razas;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class RazasService {
    Scanner input = new Scanner(System.in).useDelimiter("\n");

    public RazasService() {
    }    
    
    public Razas crearRazas(){
       Razas razas = new Razas();
       return razas;
    }
    
    public void agregarRaza(Razas razas){
        System.out.println("Ingrese el nombre de la raza");
        razas.agregarRaza(input.nextLine());        
    }
    
    public void mostrarRazas(Razas razas){
        razas.ordenar();
        for (String aux: razas.getRazas()){
            System.out.println(aux);
        }
    }
    
    public void eliminarRaza(Razas razas){
        System.out.println("Ingrese la raza a elminar");
        if(razas.eliminarRaza(input.nextLine())){
            this.mostrarRazas(razas);
        }else{
            System.out.println("La raza ingresada no se encuentar en la lista");
        };
        
    }
        
    
}
