/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import Entity.Matematica;
import Service.MatematicaService;

/**
 *
 * @author chris
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MatematicaService matematicaS = new MatematicaService();
        Matematica matematica = matematicaS.crearMatematica();
        
        matematicaS.verMayorS(matematica);
        matematicaS.calcularPotenciaS(matematica);
        matematicaS.calcularRaiz(matematica);
        matematicaS.ts(matematica);       
    }
    
}
