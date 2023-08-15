/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.Baraja;
import entity.Carta;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class BarajaService {
    
    Scanner input = new Scanner(System.in);
    
    public Baraja crearBaraja(){
        Baraja baraja = new Baraja();
        return baraja;
    }
    
    public void armarBaraja(Baraja baraja){
        baraja.armarBaraja();
    }
    
    public void barajar(Baraja baraja){
        baraja.barajar();
    }
    
    public void siguienteCarta(Baraja baraja){
        if(baraja.cartasDisponibles()==0){
            System.out.println("No hay mas cartas");
        }else{
            System.out.println(baraja.siguienteCarta().toString());
        }
    }
    
    public void cartasDisponibles(Baraja baraja){
        System.out.println("Quedan "+baraja.cartasDisponibles()+" cartas disponibles");
    }
    
    public void darCartas(Baraja baraja){
        int cantidad;
        System.out.println("Cuantas cartas desea dar?");
        cantidad = input.nextInt();
        ArrayList<Carta> mano = baraja.darCartas(cantidad);
        
        if(mano.isEmpty()){
            System.out.println("No hay suficientes cartas");
        }else{
            System.out.println("Sus cartas son");
            for (Carta aux : mano) {
                System.out.println(aux.toString());
            }
        }       
    }
    
    public void cartasMonton(Baraja baraja){
        ArrayList<Carta> monton = baraja.cartasMonton();
        System.out.println("Las cartas que ya han salido son:");
        
        if (monton.isEmpty()) {
            System.out.println("No ha salido ninguna carta");
        } else {
            for (Carta aux : monton) {
                System.out.println(aux.toString());
            }
        }        
    }
    
    public void mostrarBaraja(Baraja baraja){
        ArrayList<Carta> barajaServ = baraja.mostrarBaraja();
        System.out.println("Las cartas restantes son:");
        
        if (barajaServ.isEmpty()) {
            System.out.println("No quedan cartas");
        } else {
            for (Carta aux : barajaServ) {
                System.out.println(aux.toString());
            }
        }        
    }
    
    
    
    
}
