/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra4;

import entity.Nif;
import service.NifService;

/**
 *
 * @author chris
 */
public class EjercicioExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NifService nifServ = new NifService();
        Nif nif = nifServ.crearNif();
        nifServ.mostrarNif(nif);       
    }
    
}
