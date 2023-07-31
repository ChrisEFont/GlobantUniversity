/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra1;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class EjercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Numeros numeros = new Numeros();
        
        int opt;
        
        do{
            System.out.println("Ingrese unnumero, -99 para terminar");
            opt=input.nextInt();
            if(opt!=-99){
                numeros.agregarNumero(opt);
            }
                        
        }while(opt!=-99);
        
        numeros.obtenerDatos();
    }
    
    
}
