/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class Electrodomestico {
    

    private String color;
    private float precio, peso;    
    private char consumo;
    
    Scanner input = new Scanner(System.in);

    public Electrodomestico() {
    }

    public Electrodomestico(String color, float precio, float peso, char consumo) {
        this.color = color;
        this.precio = precio;
        this.peso = peso;
        this.consumo = consumo;
    }
    
    public void crearElectrodomestico(){
        System.out.println("Ingrese el color");
        color = input.nextLine();
        System.out.println("Ingrese el peso");
        peso = input.nextFloat();
        System.out.println("Ingrese el consumo A-B-C-D-E-F");
        input.nextLine();
        consumo = input.nextLine().charAt(0);
        precio = 1000;
        comprobarConsumoEnergetico(consumo);
        comprobarColor(color);
    }
    
    private void comprobarConsumoEnergetico(char consumo){
        if(!(65<=consumo && consumo<=70)){
            consumo='F';
        }        
    }
    
    private void comprobarColor(String color){
        if(!color.equals("BLANCO")&&!color.equals("NEGRO")&&!color.equals("ROJO")&&!color.equals("AZUL")&&!color.equals("GRIS")){
            color = "BLANCO";            
        }
    }
    
    public void precioFinal(){
        switch(consumo){
            case 'A':
                precio = precio + 1000;
                break;
            case 'B':
                precio = precio + 800;
                break;
            case 'C':
                precio = precio + 600;
                break;
            case 'D':
                precio = precio + 500;
                break;
            case 'E':
                precio = precio + 300;
                break;
            case 'F':
                precio = precio + 100;
                break;
        }
        
        if (1 <= peso && peso <= 19) {
            precio = precio + 100;
        }

        if (20 <= peso && peso <= 49) {
            precio = precio + 100;
        }

        if (50 <= peso && peso <= 79) {
            precio = precio + 100;
        }

        if (80 <= peso) {
            precio = precio + 100;
        }
    }
    
    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }    
    
}
