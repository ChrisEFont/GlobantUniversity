/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.util.Date;

/**
 *
 * @author chris
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int anio=89, mes=5, dia=15;
        Date fecha = new Date(anio, mes, dia);
        System.out.println(fecha);
        Date fechaActual = new Date();
        System.out.println(fechaActual);
    }
    
}
