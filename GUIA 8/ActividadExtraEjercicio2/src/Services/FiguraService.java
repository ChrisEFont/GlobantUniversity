/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import actividadextraejercicio2.Entity.Figura;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class FiguraService {
    
    public void cuadrado(Figura figura){
        int lado;
        Scanner input = new Scanner(System.in);
        System.out.println("INgrese el lado del cuadrado");
        lado = input.nextInt();
        figura.setArea((float)lado*lado);
        figura.setPerimetro((float)lado*4);
        System.out.println("El area del cuadrado es "+figura.getArea());
        System.out.println("El perimetro del cuadrado es "+figura.getPerimetro());        
    }

}
