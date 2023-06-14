/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7.Entity;

/**
 *
 * @author chris
 */
public class Persona {
    private String nombre, sexo;
    private int edad;
    private float peso, altura;

    public Persona() {
    }    

    public Persona(String nombre, String sexo, int edad, float peso, float altura) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    
    
    public byte calcularImc(float peso, float altura){
        byte resultado;
        if(peso/(altura*altura)<20){
            resultado=-1;
        }else if(peso/(altura*altura)>20 && peso/(altura*altura)<25 ){
            resultado=0;
        }else{
            resultado=1;
        }        
        return resultado;        
    }
    
    public boolean esMayorDeEdad(int edad){
        boolean esMayor=false;
        if(edad>=18){
            esMayor=true;
        }
        return esMayor;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", peso=" + peso + ", altura=" + altura + '}';
    }
    
    

    

    
    
}
