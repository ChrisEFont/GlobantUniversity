/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.Raices;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class RaicesService {
    
    public Raices crearRaices(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese los coeficientes a, b, y c");
        Raices raices = new Raices(input.nextFloat(), input.nextFloat(), input.nextFloat());
        return raices;
    }
    
    public String calcularRaices(Raices raices){
        return raices.calcular();
    }
    
}
