/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

/**
 *
 * @author chris
 */
public class Conversor {
    
    public static void Convertir(float importe, String moneda){
        if (moneda.toLowerCase().equals("usd")){
            System.out.println("Sus "+importe+" euros, equivale a: "+ 1.28611*importe + " dolares.");
        } else if (moneda.toLowerCase().equals("libra")){
            System.out.println("Sus "+importe+" euros, equivale a: "+ 0.86*importe + " libras.");
        } else if (moneda.toLowerCase().equals("yen")){
            System.out.println("Sus "+importe+" euros, equivale a: "+ 129.852*importe + " yenes.");
        }           
    }    
}
