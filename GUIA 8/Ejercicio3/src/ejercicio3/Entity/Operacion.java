/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3.Entity;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class Operacion {
        private float numero1, numero2;
    
    public Operacion(){
    }
    
    public Operacion(float num1, float num2){
    }
    
    public float getNumero1(){
        return numero1;
    }
    
    public void setNunmero1(float numero1){
        this.numero1=numero1;
    }

    public float getNumero2() {
        return numero2;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }

    public float sumar(){
        return numero1+numero2;
    }
    
    public float restar(){
        return numero1-numero2;
    }
    
    public float multiplicar(){
        if (numero1==0 || numero2==0){
            System.out.println("Error: Multiplicación por cero");
        }
        return numero1*numero2;        
    }
    
    public float dividir(){
        if (numero2==0){
            System.out.println("Error: División por cero");
            return 0;
        }else{
            return numero1/numero2;
        }
        
    }
    
}
