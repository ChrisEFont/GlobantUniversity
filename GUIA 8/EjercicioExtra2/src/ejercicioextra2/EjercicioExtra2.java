/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra2;

import entity.Puntos;
import service.PuntosService;

/**
 *
 * @author chris
 */
public class EjercicioExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PuntosService puntosServ = new PuntosService();
        Puntos puntos = puntosServ.crearPuntos(); 
        puntosServ.calcularDistancia(puntos);
        System.out.println(puntos.toString());
        
        
    }
    
}
