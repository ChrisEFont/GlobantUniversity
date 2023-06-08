/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra10;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class EjercicioExtra10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numX, num, intentos;
        Scanner input = new Scanner(System.in);
        
        numX=(int) (Math.floor(Math.random()*10) * Math.floor(Math.random()*10));
        
        intentos=0;
        
        do{
            System.out.println("Ingrese su elección:");
            num=input.nextInt();
            intentos++; 
            if(num<numX){
                System.out.println("Debe eingresar un número mayor");
            }else if(num>numX){
                System.out.println("Debe ingresar un número menor");
            }else{System.out.println("Felicitaciones ha adivinado el número!!!");}   
        }while(numX!=num);
        
        System.out.println("Intentos:"+ intentos);
        
        
    }
    
}
