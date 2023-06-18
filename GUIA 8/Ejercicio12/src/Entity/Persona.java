/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Date;

/**
 *
 * @author chris
 */
public class Persona {
    private String nombre;
    private int anio, mes, dia;
    private Date fechaNacimiento;

    public Persona() {
    }

    public Persona(String nombre, int anio, int mes, int dia) {
        this.nombre = nombre;
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
        fechaNacimiento = new Date(anio-1900, mes-1, dia);        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
    
    public int calcularEdad(){
        Date fechaActual = new Date();
        return fechaActual.getYear()-fechaNacimiento.getYear();
    }
    
    public boolean menorQue(int edad){
        if(this.calcularEdad()<edad){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + '}';
    }    
    
}
