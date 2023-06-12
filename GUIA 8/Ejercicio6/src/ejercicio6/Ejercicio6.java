/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import ejercicio6.Entity.Cafetera;
import ejercicio6.Service.CafeteraService;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opt;
        
        CafeteraService cafeteraS= new CafeteraService();
        Cafetera cafetera = cafeteraS.crearCafetera();
        
        
        do{
            System.out.println("Ingrese una opción");
            System.out.println("(1) Llenar cafetera");
            System.out.println("(2) Servir taza");
            System.out.println("(3) Vaciar Cafetera");
            System.out.println("(4) Agregar cafe");
            System.out.println("(0) Apagar");
            
            opt=input.nextInt();
            
            switch(opt){
                case 1: cafeteraS.llenarCafetera(cafetera);
                break;
                case 2: cafeteraS.servirTaza(cafetera);
                break;
                case 3: cafeteraS.vaciarCafetera(cafetera);
                break;
                case 4: cafeteraS.agregarCafe(cafetera);
                break;
                case 0: System.out.println("Apagando");
                break;
                default:
                    System.out.println("-------------------------------------------------");
                    System.out.println("Opcion invalida");
                    System.out.println("-------------------------------------------------");
            }
            
        }while(opt!=0);
        
    }
    
}
