/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

import entity.Movil;
import service.MovilService;

/**
 *
 * @author chris
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MovilService movilSer = new MovilService();
        
        System.out.println("Cargar nuevo movil");
        
        Movil movil = movilSer.cargarCelular();
        
        movilSer.mostrarDatos(movil);

        
    }
    
}
