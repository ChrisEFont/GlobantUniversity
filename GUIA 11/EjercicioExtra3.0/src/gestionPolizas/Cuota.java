/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionPolizas;

import java.util.Date;

/**
 *
 * @author chris
 */
public class Cuota {
    
    private int numeroPoliza, numeroCuota, cantidadCuotas;
    private float importe;
    private Date vencimiento;
    boolean paga;

    public Cuota(int numeroPoliza, int numeroCuota, int cantidadCuotas, float importe, Date vencimiento, boolean paga) {
        this.numeroPoliza = numeroPoliza;
        this.numeroCuota = numeroCuota;
        this.cantidadCuotas = cantidadCuotas;
        this.importe = importe;
        this.vencimiento = vencimiento;
        this.paga = false;
    }        
    
}
