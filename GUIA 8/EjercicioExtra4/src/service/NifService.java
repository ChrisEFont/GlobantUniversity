package service;

import java.util.Scanner;
import entity.Nif;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class NifService {
    public Nif crearNif(){
        Scanner input = new Scanner(System.in);
        System.out.println("Por favor ingrese el numero de DNI");
        Nif nif = new Nif(input.nextLong());
        return nif;
    }
    
    public void mostrarNif(Nif nif){
        System.out.println("El nif es: " + nif.mostrar());
    }
}
