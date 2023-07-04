/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra6;

import entity.Ahorcado;
import service.Juego;

/**
 *
 * @author chris
 */
public class EjercicioExtra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Juego juego = new Juego();
        Ahorcado ahorcado = juego.crearJuego();
        juego.jugar(ahorcado);
    }
    
}
