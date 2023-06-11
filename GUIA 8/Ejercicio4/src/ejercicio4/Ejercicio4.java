/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import ejercicio4.Entity.Rectangulo;
import ejercicio4.Service.RectanguloService;

/**
 *
 * @author chris
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        RectanguloService rectanguloS = new RectanguloService();
        
        Rectangulo rectangulo = rectanguloS.crearRectangulo();
        
        rectangulo.dibujar();
        
        System.out.println("El perimetro es: "+ rectangulo.perimetro());
        
        System.out.println("La superficie es: "+ rectangulo.superficie());        
    }
    
}
