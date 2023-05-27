/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float importe;
        String moneda;
        boolean flag=true;        
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Por favor ingrese el importe");
        
        importe = input.nextFloat();
        
        do{
        
        System.out.println("Seleccione la moneda deseada USD/LIBRA/YEN");
        
        moneda=input.next();
        
        if (moneda.toLowerCase().equals("usd") ||
                moneda.toLowerCase().equals("libra") ||
                moneda.toLowerCase().equals("yen")){
            flag=false;
        }else{
            System.out.println("Moneda invalida");
        }
        
        }while(flag);        
        
        Conversor.Convertir(importe, moneda);
    }
    
}