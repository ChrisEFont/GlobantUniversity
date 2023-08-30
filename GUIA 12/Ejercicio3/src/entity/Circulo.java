/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import intarface.calculosFormas;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class Circulo implements calculosFormas {
    
    Scanner input = new Scanner(System.in);

    public Circulo() {
    }    

    @Override
    public float calcularArea() {
        System.out.println("Ingrese el radio");
        float radio = input.nextFloat();
        return (float)(Math.pow(radio, 2)*calculosFormas.pi);
    }

    @Override  
    public float calcularPerimetro() {
        System.out.println("Ingrese el radio");
        float radio = input.nextFloat();
        return (float)(radio*2*calculosFormas.pi);
    }    
}
