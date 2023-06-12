/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6.Service;

import ejercicio6.Entity.Cafetera;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class CafeteraService {
    public Cafetera crearCafetera(){
        Cafetera cafeteraS = new Cafetera();
        return cafeteraS;
    }
    
    public void llenarCafetera(Cafetera cafetera){
        System.out.println("-------------------------------------------------");
        System.out.println("Llenando cafetera");        
        cafetera.llenarCafetera();
        System.out.println("-------------------------------------------------");
    }
    
    public void servirTaza(Cafetera cafetera){
        Scanner input = new Scanner(System.in);
        System.out.println("-------------------------------------------------");
        System.out.println("Ingrese el tamaño de la taza");        
        cafetera.servirTaza(input.nextInt());
        System.out.println("-------------------------------------------------");        
    }
    
    public void vaciarCafetera(Cafetera cafetera){
        System.out.println("-------------------------------------------------");
        cafetera.vaciaCafetera();
        System.out.println("-------------------------------------------------");
    }
    
    public void agregarCafe(Cafetera cafetera){
        Scanner input = new Scanner(System.in);
        System.out.println("-------------------------------------------------");
        System.out.println("Ingrese la cantidad de cafe que desa agregar");        
        cafetera.agregarCafe(input.nextInt());
        System.out.println("-------------------------------------------------");
    }
    
}
