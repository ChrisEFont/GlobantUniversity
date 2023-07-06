/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.Ahorcado;
import entity.Partida;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class PartidaService {
    Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private String palabraSecreta;
    private int intentosPermitidos;
    
    public PartidaService(){
        System.out.println("Ingrese la palabra Secreta");
        this.palabraSecreta=input.nextLine();
        System.out.println("Ingrese la cantidad de intentos permitidos");
        this.intentosPermitidos=input.nextInt();
        input.nextLine();
    }
    
    public Partida crearPartida(){
        Partida nvaPartida = new Partida();
        return nvaPartida;
    }
    
    public Ahorcado iniciarPartida(Partida partida){
        return partida.nvoAhorcado(this.palabraSecreta, this.intentosPermitidos);        
    }
    
    public void intentar(Partida nvaPartida, Ahorcado nvoAhorcado){
        if (nvaPartida.verificarIntentos(nvoAhorcado)) {
            System.out.println("Ingrese una letra");
            nvaPartida.intentar(nvoAhorcado, input.nextLine());
        } else {
            nvaPartida.finPartida(nvoAhorcado);
        }      
    }
    
    
}
