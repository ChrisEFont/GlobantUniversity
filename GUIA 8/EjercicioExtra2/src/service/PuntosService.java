/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.Puntos;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class PuntosService {
    Scanner input = new Scanner(System.in);
    public Puntos crearPuntos(){
        Puntos puntos = new Puntos();
        System.out.println("Ingrese x1");
        puntos.setX1(input.nextFloat());
        System.out.println("Ingrese y1");
        puntos.setY1(input.nextFloat());
        System.out.println("Ingrese x2");
        puntos.setX2(input.nextFloat());
        System.out.println("Ingrese y2");
        puntos.setY2(input.nextFloat());
        return puntos;
    }
    
    public void calcularDistancia(Puntos puntos){
        System.out.println("La distancia es de "+ puntos.calcularDistancia());
    }
}
