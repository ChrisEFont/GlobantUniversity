/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.Juego;
import entity.Jugador;
import entity.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class JuegoService {
    
    private Scanner input = new Scanner(System.in);
    
    private Juego juego = new Juego();
    
    private Revolver revolver = new Revolver();
    
    private ArrayList<Jugador> jugadores = new ArrayList();   
    
    private int turno;

    public JuegoService(){
        this.turno = 0;
    }
    
    public void iniciarJugador(){
        int cantidad;
        do{
            System.out.println("Ingrese la cantidad de juagdores entre 1 y 6");
            cantidad=input.nextInt();
            if(cantidad<1 || cantidad >6){
                System.out.println("Cantidad invalida");
            }
        }while(cantidad<1 || cantidad >6);
        
        for(int i=0; i<cantidad; i++){
            Jugador jugador = new Jugador(i, "Jugador"+" "+(i+1));
            jugadores.add(jugador);
        }
    }
    
    public void cargarJuego(){
        juego.llenarJuego(jugadores, revolver);
    }
    
    public boolean disparar(){
        boolean check=false;
        if(juego.ronda(turno)){
            System.out.println(" * * * Te has mojado * * * ");
            check=true;
        }else{
            System.out.println("Sigues seco");
        }
        if(turno+1<jugadores.size()){
            turno++;
        }else{
            turno=0;
        }
        
        return check;                
    }
    
    public void turno(){
        System.out.println("Turno de: " + jugadores.get(turno).getNombre());
    }
    
    public void finalizar(){
        System.out.println(revolver.toString());
    }
    
    
    
    
}
