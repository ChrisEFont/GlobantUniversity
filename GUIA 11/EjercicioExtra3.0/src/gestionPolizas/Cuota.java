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
    private float importe, primaAsegurada;
    private Date vencimiento;
    private boolean paga;
    private TipoPoliza tipoPoliza;

    public Cuota(int numeroPoliza, int numeroCuota, int cantidadCuotas, TipoPoliza tipoPoliza, float primaAsegurada, boolean granizo, Date inicio) {
        this.numeroPoliza = numeroPoliza;
        this.numeroCuota = numeroCuota;
        this.cantidadCuotas = cantidadCuotas;
        this.tipoPoliza = tipoPoliza;
        this.primaAsegurada = primaAsegurada;
        switch(tipoPoliza){
            case TODO_RIESGO:
                this.importe = primaAsegurada*2/100;
                break;
            case TERCEROS_COMPLETO:
                this.importe = primaAsegurada*1/100;
                break;
            case RESPONSABILIDAD_CIVIL:
                this.importe = primaAsegurada*5/1000;
        }
        if(granizo){
            this.importe=importe+importe/10;
        }
        this.importe=importe/cantidadCuotas;
        this.vencimiento = inicio;
        //this.vencimiento.setMonth(inicio.getMonth()+numeroCuota);
        this.paga = false;
    }
    
    public boolean pagar(){
        if(!paga){
            this.paga=true;
            return true;
        }else{
            return false;
        }        
    }

    public boolean isPaga() {
        return paga;
    }

    public int getNumeroCuota() {
        return numeroCuota;
    }
    
    

    

    @Override
    public String toString() {
        return "Cuota{" + "numeroPoliza=" + numeroPoliza + ", numeroCuota=" + numeroCuota + ", cantidadCuotas=" + cantidadCuotas + ", importe=" + importe + ", primaAsegurada=" + primaAsegurada + ", vencimiento=" + vencimiento + ", paga=" + paga + ", tipoPoliza=" + tipoPoliza + '}';
    }
    
    
    
}
