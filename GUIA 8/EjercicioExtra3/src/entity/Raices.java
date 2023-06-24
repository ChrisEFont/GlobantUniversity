/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author chris
 */
public class Raices {
    private float a, b, c;

    public Raices(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }
    
    public double getDiscriminante(){
        return (Math.pow(b, 2))-4*a*c;
    }
    
    public boolean tieneRaices(){
        if(this.getDiscriminante()>0){
            return true;
        }else{
            return false;
        }       
    }
    
    public boolean tieneRaiz(){
        if(this.getDiscriminante()==0){
            return true;
        }else{
            return false;
        }
    }
    
    public String obtenerRaices(){
        if(this.tieneRaices()){
            return "Las raices son: " + (-b+Math.sqrt(this.getDiscriminante()))/(2*a) + " y " + (-b-Math.sqrt(this.getDiscriminante()))/(2*a); 
        }else{
            return "No tiene raices multiples";
        } 
    }

    public String obtenerRaiz() {
        if (this.tieneRaiz()) {
            return "Las raiz es: " + -b / (2 * a);
        } else {
            return "No tiene raiz simple";
        }
    }
    
    public String calcular(){
        if (this.getDiscriminante()<0){
            return "La ecuación tiene raíces imaginarias";
        }else if(this.getDiscriminante()==0){
            return this.obtenerRaiz();
        }else{
            return this.obtenerRaices();
        }
    }
    
    
}
