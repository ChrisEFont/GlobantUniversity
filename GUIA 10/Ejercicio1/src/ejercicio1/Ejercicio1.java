/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import entity.Razas;
import java.util.Scanner;
import service.RazasService;

/**
 *
 * @author chris
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        int opt;
        
        RazasService razasServ = new RazasService();
        Razas razas = razasServ.crearRazas();
        
        do{
            System.out.println("Ingrese una opción");
            System.out.println("1 - Agregar una raza");
            System.out.println("2 - Eliminar una raza");
            System.out.println("0 - terminar y mostrar");
            opt=input.nextInt();
            
            switch(opt){
                case 1: razasServ.agregarRaza(razas);
                break;
                case 2: razasServ.eliminarRaza(razas);
                break;
                case 0: razasServ.mostrarRazas(razas);
                break;
                default: System.out.println("Opción invalida");
                break;
            }
            
        }while(opt!=0);
    }
}
