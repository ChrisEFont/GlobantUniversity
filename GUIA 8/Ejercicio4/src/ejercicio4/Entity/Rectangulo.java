/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4.Entity;

/**
 *
 * @author chris
 */
public class Rectangulo {
    private int base, altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public int superficie (){
        return base*altura;
    }
    
    public int perimetro(){
        return (base+altura)*2;
    }
    
    public void dibujar(){
        for(int i=0; i<altura; i++){
            for (int j=0; j<base; j++){
                if(i==0 || i==altura-1 || j==0 || j==base-1){
                    System.out.print(" *");
                }else{
                    System.out.print("  ");
                }                
            }
            System.out.println("");
        }
    }
}
