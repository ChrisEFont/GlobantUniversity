/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Arrays;

/**
 *
 * @author chris
 */
public class Ahorcado {
    private String[] palabraSecreta, palabraEnJuego;
    private int letrasEncontradas, intentosPermitidos;

    public Ahorcado(String palabraSecreta, int intentosPermitidos) {
        this.letrasEncontradas=0;
        this.intentosPermitidos=intentosPermitidos;
        this.palabraSecreta = new String[palabraSecreta.length()];
        this.palabraEnJuego = new String[palabraSecreta.length()];
        Arrays.fill(palabraEnJuego, "_");
        for(int i=0; i<palabraSecreta.length(); i++){
            this.palabraSecreta[i]=palabraSecreta.substring(i, i+1);            
        }        
    }

    public String[] getPalabraSecreta() {
        return palabraSecreta;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }    

    public int getIntentosPermitidos() {
        return intentosPermitidos;
    }    
    
    public void mostrarPalabra(){
        for(String letra: palabraEnJuego){
            System.out.print(letra+" ");
        }
    }
    
    
    
    
    public boolean buscarLetra(String letra){
        boolean check=false;
        for(int i=0; i<this.palabraSecreta.length; i++){
            if(letra.equals(this.palabraSecreta[i])){
               check=true;
            }
        }
        return check;
    }
    
    public void intento(String letra){
        if(this.buscarLetra(letra)){
            for (int i = 0; i < this.palabraSecreta.length; i++){
                if (letra.equals(this.palabraSecreta[i])) {
                    this.palabraEnJuego[i] = letra;
                    this.letrasEncontradas++;
                }
            }
            
            System.out.println("Felicitaciones has adivinado una letra");
            
        }else{
            this.intentosPermitidos--;
            System.out.println("No has acertado");
        }        
    }   
    
    
}
