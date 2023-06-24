/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra3;

import entity.Raices;
import service.RaicesService;

/**
 *
 * @author chris
 */
public class EjercicioExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RaicesService raicesServ = new RaicesService();
        Raices raices = raicesServ.crearRaices();
        System.out.println(raicesServ.calcularRaices(raices));
    }
    
}
