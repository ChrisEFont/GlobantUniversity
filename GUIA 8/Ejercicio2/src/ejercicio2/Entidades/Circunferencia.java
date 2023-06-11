/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.Entidades;

/**
 *
 * @author chris
 */
public class Circunferencia {
    private float radio;

    public Circunferencia() {
    }

    public Circunferencia(float radio) {
        this.radio = radio;
    }
        

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    public float area(){
        float area;
        area=3.1416f*(float) Math.pow(radio, 2);
        return area;
    }
    
    public float perimetro(){
        float perimetro;
        perimetro=2*3.1416f*radio;
        return perimetro;
    }
    
    
}
