/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerccioextra6logicapropia;

import entity.Ahorcado;
import entity.Partida;
import service.PartidaService;

/**
 *
 * @author chris
 */
public class EjerccioExtra6LogicaPropia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PartidaService nvoServicio = new PartidaService();
        Partida nvaPartida = nvoServicio.crearPartida();
        Ahorcado nvoAhorcado = nvoServicio.iniciarPartida(nvaPartida);
        nvaPartida.mostrarPalabra(nvoAhorcado);
        
        do{            
            nvoServicio.intentar(nvaPartida, nvoAhorcado);
            nvaPartida.mostrarPalabra(nvoAhorcado);
            System.out.println("---------------------------------------------");
        }while(nvaPartida.verificarIntentos(nvoAhorcado));
        
        System.out.println("/////////////////////////////////////////////////");
        nvaPartida.finPartida(nvoAhorcado);
        
    }
    
}
