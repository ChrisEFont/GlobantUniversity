/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.lang.reflect.Array;

/**
 *
 * @author chris
 */
public class Ahorcado {
    
    private String palabra[];
    private int encontradas, intentos, totalLetras;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int encontradas, int intentos) {
        this.palabra = palabra;
        this.encontradas = encontradas;
        this.intentos = intentos;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getEncontradas() {
        return encontradas;
    }

    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public int getTotalLetras() {
        return totalLetras;
    }

    public void setTotalLetras(int totalLetras) {
        this.totalLetras = totalLetras;
    }
    
    

    
    
    public void crearJuego(String palabra, int intentos){
        
        this.palabra = new String[palabra.length()];
        
        for (int i=0; i<palabra.length(); i++){
            this.palabra[i]=palabra.substring(i, i+1);
        }
        
        totalLetras=palabra.length();
        
        this.encontradas=0;
        
        this.intentos=intentos;
    }
    
    public int longitud(){
        return Array.getLength(this.palabra);
    }
    
    public boolean buscar(String letra){
        boolean chek = false;
        
        for (int i=0; i<this.longitud(); i++){
            if(letra.equals(palabra[i])){
                chek=true;                
            }
        }
        
        if(!chek){
            this.intentos--;
        }
        
        return chek;        
    }    
    
    
    public void encontrada(String letra){    
        
        for (int i = 0; i < this.longitud(); i++) {
            if (letra.equals(palabra[i])) {
                this.encontradas++;
            }
        }
        
    }
    
    public int intentos(){
        return this.intentos;
    }    
    
}
