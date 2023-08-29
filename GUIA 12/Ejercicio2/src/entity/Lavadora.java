package entity;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class Lavadora extends Electrodomestico {
        
    private int carga;

    public Lavadora() {
    }
    
    public Lavadora(String color, float precio, float peso, char consumo, int carga) {
        super(color, precio, peso, consumo);
        this.carga = carga;        
    }
    
    public void crearLavadora(){
        super.crearElectrodomestico();
        System.out.println("Ingrese la carga");
        carga = input.nextInt();
    }
    
    @Override
    public void precioFinal(){
        if(30<carga){
            super.setPrecio(super.getPrecio()+500);            
        }
        super.precioFinal();
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }
    
    
    
    
    
    
}
