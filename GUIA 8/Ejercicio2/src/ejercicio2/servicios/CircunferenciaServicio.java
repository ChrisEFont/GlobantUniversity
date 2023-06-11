/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.servicios;

import ejercicio2.Entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class CircunferenciaServicio {
    
    public Circunferencia crearCircunferencia(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el radio");
        
        Circunferencia circunferencia = new Circunferencia(input.nextFloat());
        return circunferencia;        
    }    
}
