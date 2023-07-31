/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.CantanteFamoso;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class CantanteFamosoService {
    
    Scanner input = new Scanner(System.in);
    
    public CantanteFamoso crearCantante(){
        System.out.println("Ingrese el nombre del cantante");
        String nombre = input.nextLine();
        System.out.println("Ingrese el disco con mas ventas");
        String disco = input.nextLine();
        
       CantanteFamoso cantanteFamoso = new CantanteFamoso(nombre, disco);
       
       return cantanteFamoso;        
    }
    
    
    
}
