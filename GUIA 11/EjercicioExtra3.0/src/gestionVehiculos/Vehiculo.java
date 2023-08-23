/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionVehiculos;

import gestionClientes.Cliente;

/**
 *
 * @author chris
 */
public class Vehiculo {
    
    private String marca, modelo, dominio, nChasis, nMotor, color;
    private TipoVehiculo tipoVehiculo;
    private int anio, numeroPoliza;
    private Cliente titular;

    public Vehiculo(String marca, String modelo, String dominio, String nChasis, String nMotor, String color, TipoVehiculo tipoVehiculo, int anio, Cliente titular) {
        this.marca = marca;
        this.modelo = modelo;
        this.dominio = dominio;
        this.nChasis = nChasis;
        this.nMotor = nMotor;
        this.color = color;
        this.tipoVehiculo = tipoVehiculo;
        this.anio = anio;
        this.titular = titular;
    }

    public String getDominio() {
        return dominio;
    }

    public void setNumeroPoliza(int numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }    

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", dominio=" + dominio + ", nChasis=" + nChasis + ", nMotor=" + nMotor + ", color=" + color + ", tipoVehiculo=" + tipoVehiculo + ", anio=" + anio + ", numeroPoliza=" + numeroPoliza + '}';
    }
    
    
    
    
    
}
