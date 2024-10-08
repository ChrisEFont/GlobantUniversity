/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionPolizas;

import gestionClientes.Cliente;
import java.util.ArrayList;
import java.util.Date;
import gestionVehiculos.Vehiculo;

/**
 *
 * @author chris
 */
public class Poliza {
    

    private Cliente cliente;
    private Vehiculo vehiculo;
    private Date inicio, fin;
    private int numeroPoliza, cantidadCuotas;
    private float primaAsegurada;
    private TipoPoliza tipo;
    private boolean granizo;
    private FormaPago formaPago;
    
    ArrayList<Cuota> cuotas = new ArrayList();

    public Poliza(Cliente cliente, Vehiculo vehiculo, Date inicio, Date fin, int numeroPoliza, int cantidadCuotas, float primaAsegurada, TipoPoliza tipo, boolean granizo, FormaPago formaPago) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.inicio = inicio;
        this.fin = fin;
        this.numeroPoliza = numeroPoliza;
        this.cantidadCuotas = cantidadCuotas;
        this.primaAsegurada = primaAsegurada;
        this.tipo = tipo;
        this.granizo = granizo;
        this.formaPago = formaPago;
        this.crearCuotas();
    }
    
    private void crearCuotas(){
        for(int i=0; i<cantidadCuotas; i++){
            Cuota cuota = new Cuota(numeroPoliza, i+1, cantidadCuotas, tipo, primaAsegurada, granizo, inicio);
            cuotas.add(cuota);
        }
    }
    
    public ArrayList<Cuota> devolverCuotas(){
        return cuotas;
    }

    public int getNumeroPoliza() {
        return numeroPoliza;
    }    

    @Override
    public String toString() {
        return "Poliza{" + "cliente=" + cliente + ", vehiculo=" + vehiculo + ", inicio=" + inicio + ", fin=" + fin + ", numeroPoliza=" + numeroPoliza + ", cantidadCuotas=" + cantidadCuotas + ", primaAsegurada=" + primaAsegurada + ", tipo=" + tipo + ", granizo=" + granizo + ", formaPago=" + formaPago + '}';
    }        
    
}
