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
public class Rectangulo implements calculosFormas {
    
    Scanner input = new Scanner(System.in);

    public Rectangulo() {
    }    

    @Override
    public float calcularArea() {
        System.out.println("Ingrese la base");
        float base = input.nextFloat();
        System.out.println("Ingrese la altura");
        float altura = input.nextFloat();        
        return base*altura;
    }

    @Override
    public float calcularPerimetro() {
        System.out.println("Ingrese la base");
        float base = input.nextFloat();
        System.out.println("Ingrese la altura");
        float altura = input.nextFloat();
        return (base+altura)*2;
    }
    
    
}
