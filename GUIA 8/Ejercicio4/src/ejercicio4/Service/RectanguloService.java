/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4.Service;

import ejercicio4.Entity.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class RectanguloService {
    
    public Rectangulo crearRectangulo(){
        Scanner input = new Scanner(System.in);
        Rectangulo rectangulo = new Rectangulo();
        System.out.println("Ingrese la base");
        rectangulo.setBase(input.nextInt());
        System.out.println("Ingrese la altura");
        rectangulo.setAltura(input.nextInt());        
        return rectangulo;
    } 
}
