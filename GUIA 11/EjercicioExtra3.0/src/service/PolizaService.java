/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import gestionClientes.BaseClientes;
import gestionClientes.Cliente;
import gestionPolizas.BasePolizas;
import gestionPolizas.Cuota;
import gestionPolizas.FormaPago;
import gestionPolizas.Poliza;
import gestionPolizas.TipoPoliza;
import gestionVehiculos.BaseVehiculos;
import gestionVehiculos.Vehiculo;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class PolizaService {
    
    Scanner input = new Scanner(System.in);

    public PolizaService() {
    }    
    
    public void mostrarPolizas(BasePolizas basePolizas){
        ArrayList<Poliza> polizas = basePolizas.devolverPolizas();
        for(Poliza aux: polizas){
            System.out.println(aux.toString());
        }
    }
    
    public void buscarPoliza(BasePolizas basePolizas){
        ArrayList<Poliza> polizas = basePolizas.devolverPolizas();
        System.out.println("Ingrese el numero de póliza");
        int numeroPoliza = input.nextInt();
        input.nextLine();
        for(Poliza aux: polizas){
            if(aux.getNumeroPoliza()==numeroPoliza){
                System.out.println(aux.toString());
                System.out.println("Desea ver las cuotas? S/N");
                String opt = input.nextLine();
                for(Cuota aux2: aux.devolverCuotas()){
                    System.out.println(aux2.toString());
                }
            } 
        }
    }
    
    public void pagarCuota(BasePolizas basePolizas) {
        ArrayList<Poliza> polizas = basePolizas.devolverPolizas();
        System.out.println("Ingrese el numero de póliza");
        int numeroPoliza = input.nextInt();
        input.nextLine();
        for (Poliza aux : polizas) {
            if (aux.getNumeroPoliza() == numeroPoliza) {
                for (Cuota aux2 : aux.devolverCuotas()) {
                    if(!aux2.isPaga()){
                        aux2.pagar();
                        System.out.println("Cuota "+aux2.getNumeroCuota()+" abonada");
                        break;
                    }
                    System.out.println(aux2.toString());
                }
            }
        }

    }
    
    public void crearPoliza (BasePolizas basePolizas, BaseClientes baseClientes, BaseVehiculos baseVehiculos){
        int numeroPoliza = basePolizas.getContador()+1;
        Cliente cliente=null;
        Vehiculo vehiculo=null;
        System.out.println("Ingrese el numero de Cliente");
        int numeroCliente = input.nextInt();
        for(Cliente aux: baseClientes.devolverClientes()){
            if(aux.getNumeroCliente()==numeroCliente){
                cliente = aux;
            }
        }
        input.nextLine();
        System.out.println("Ingrese el dominio del vehiculo");
        String dominio = input.nextLine();
        for(Vehiculo aux: baseVehiculos.devolverVehiculos()){
            if(aux.getDominio().equals(dominio)){
                vehiculo = aux;
            }
        }
        
        System.out.println("Vigencia de la póliza");
        System.out.println("Ingrese el mes de incio");
        int mes=input.nextInt()-1;
        System.out.println("Ingrese el año");
        int anio = input.nextInt()-1900;
        Date fechaInicio = new Date(anio, mes, 1);
        
        System.out.println("Ingrese el mes de fin");
        mes=input.nextInt()-1;
        System.out.println("Ingrese el año");
        anio = input.nextInt()-1900;
        Date fechaFin = new Date(anio, mes, 30);        
        if(mes==1){
            fechaFin.setDate(28);
        }
        
        System.out.println("Ingrese la cantidad de cuotas");
        int cantidadCuotas = input.nextInt();
        
        System.out.println("Ingrese la prima asegurada");
        float primaAsegurada = input.nextFloat();
        
        TipoPoliza tipoPoliza = null;
        
        int opt;
        do {
            System.out.println("Ingrese una opción");
            System.out.println("1 - Todo Riesgo");
            System.out.println("2 - Terceros Completo");
            System.out.println("3 - Responsabilidad Civil");
            opt = input.nextInt();
            switch (opt) {
                case 1:
                    tipoPoliza=tipoPoliza.TODO_RIESGO;
                    break;
                case 2:
                    tipoPoliza=tipoPoliza.TERCEROS_COMPLETO;
                    break;
                case 3:
                    tipoPoliza=tipoPoliza.TODO_RIESGO;
                    break;
                default:
                    System.out.println("Opción invalida");
            }
        } while (opt>3);
        
        input.nextLine();
        
        System.out.println("Incluye granizo? S/N");
        String granizoOpt = input.nextLine();
        boolean granizo;
        if(granizoOpt.equals("S")){
            granizo = true;
        }else{
            granizo = false;
        }
        
        FormaPago formaPago = null;
        
        do {
            System.out.println("Ingrese una opción");
            System.out.println("1 - Debito Automático");
            System.out.println("2 - tarjeta de Crédito");
            System.out.println("3 - Efectivo");
            System.out.println("0 - Finalizar");
            opt = input.nextInt();
            switch (opt) {
                case 1:
                    formaPago = formaPago.DEBITO_AUTOMATICO;
                    break;
                case 2:
                    formaPago = formaPago.TARJETA_CREDITO;
                    break;
                case 3:
                    formaPago = formaPago.EFECTIVO;
                    break;
                default:
                    System.out.println("Opción invalida");
            }
        } while (opt>3);
        
        Poliza nuevaPoliza = new Poliza(cliente, vehiculo, fechaInicio, fechaFin, numeroPoliza, cantidadCuotas, primaAsegurada, tipoPoliza, granizo, formaPago);
        
        basePolizas.agregarPoliza(nuevaPoliza);
        
        for (Vehiculo aux : baseVehiculos.devolverVehiculos()) {
            if (aux.getDominio().equals(dominio)) {
                aux.setNumeroPoliza(numeroPoliza);
            }
        }
        
    }
}
