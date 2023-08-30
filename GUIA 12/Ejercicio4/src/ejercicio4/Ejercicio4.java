/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import entity.Circulo;
import entity.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Circulo circulo = new Circulo();
        Rectangulo rectangulo = new Rectangulo();

        int opt;
        do {
            System.out.println("Ingrese una opción");
            System.out.println("1 - Calcular area de un círculo");
            System.out.println("2 - Calcular perimetro de un círculo");
            System.out.println("3 - Calcular area de un rectángulo");
            System.out.println("4 - Calcular perimetro de un rectángulo");
            System.out.println("0 - Finalizar");
            opt = input.nextInt();
            switch (opt) {
                case 1:
                    System.out.println(circulo.calcularArea());;
                    break;
                case 2:
                    System.out.println(circulo.calcularPerimetro());
                    break;
                case 3:
                    System.out.println(rectangulo.calcularArea());
                    break;
                case 4:
                    System.out.println(rectangulo.calcularPerimetro());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción invalida");
            }
        } while (opt != 0);
        

        
    }
    
}
