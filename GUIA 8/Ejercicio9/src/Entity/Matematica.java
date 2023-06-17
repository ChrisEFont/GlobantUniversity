/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author chris
 */
public class Matematica {
    private float num1, num2;

    public Matematica() {
    }

    public Matematica(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }
    
    public float devolverMayor(){
        if(num1>num2){
            return num1;
        }else{
            return num2;
        }
    }

    public float devolverMenor(){
        if(num1>num2){
            return num2;
        }else{
            return num1;
        }
    } 
    
    public float calcularPotencia(){
        return (float) Math.pow((double) this.devolverMayor(), (double) this.devolverMenor());
    }
    
    public float calculaRaiz(){
       return (float) Math.sqrt((double) Math.abs(this.devolverMenor()));       
    }

    @Override
    public String toString() {
        return "Matematica{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }
}
