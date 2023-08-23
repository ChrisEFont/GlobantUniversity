/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import gestionClientes.BaseClientes;
import gestionClientes.Cliente;
import gestionVehiculos.BaseVehiculos;
import gestionVehiculos.TipoVehiculo;
import gestionVehiculos.Vehiculo;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class VehiculoService {
    
    Scanner input = new Scanner(System.in);

    public VehiculoService() {
    }    
    
    public void mostrarVehiculos(BaseVehiculos baseVehiculos){
        for(Vehiculo aux: baseVehiculos.devolverVehiculos()){
            System.out.println(aux.toString());
        }        
    }
    
    public void crearVehiculo(BaseVehiculos baseVehiculos, BaseClientes baseClientes){
        
        Cliente cliente = null;
        
        
        System.out.println("Ingrese la marca");
        String marca = input.nextLine();
        System.out.println("Ingrese el modelo");
        String modelo = input.nextLine();
        System.out.println("Ingrese el dominio");
        String dominio = input.nextLine();
        System.out.println("Ingrese el número de chasis");
        String numeroChasis = input.nextLine();
        System.out.println("Ingrese el número de motor");
        String numeroMotor = input.nextLine();
        System.out.println("Ingrese el color");
        String color = input.nextLine();
        
        TipoVehiculo tipoVehiculo=null;
        
        int opt;
        
        do {
            System.out.println("Ingrese una opción");
            System.out.println("1 - Sedán 3 Ptas");
            System.out.println("2 - Sedán 5 Ptas");
            System.out.println("3 - Pick Up");
            System.out.println("4 - Utilitario");
            System.out.println("5 - Furgon");
            System.out.println("6 - SUV");
            System.out.println("7 - Camión");
            System.out.println("8 - Mini Bus");
            System.out.println("9 - Bus");
            System.out.println("10 - Moto");
            opt = input.nextInt();
            switch (opt) {
                case 1:
                    tipoVehiculo = tipoVehiculo.SEDAN_3;
                    break;
                case 2:
                    tipoVehiculo = tipoVehiculo.SEDAN_5;
                    break;
                case 3:
                    tipoVehiculo = tipoVehiculo.PICK_UP;
                    break;
                case 4:
                    tipoVehiculo = tipoVehiculo.UTIL;
                    break;
                case 5:
                    tipoVehiculo = tipoVehiculo.FURGON;
                    break;
                case 6:
                    tipoVehiculo = tipoVehiculo.SUV;
                    break;
                case 7:
                    tipoVehiculo = tipoVehiculo.CAMION;
                    break;
                case 8:
                    tipoVehiculo = tipoVehiculo.MINI_BUS;
                    break;
                case 9:
                    tipoVehiculo = tipoVehiculo.BUS;
                    break;
                case 10:
                    tipoVehiculo = tipoVehiculo.MOTO;
                    break;
                default:
                    System.out.println("Opción invalida");
            }
        } while (opt>10);

        System.out.println("Ingrese el año");
        int anio = input.nextInt();
        
        System.out.println("Ingrese numero de cliente");
        int numeroCliente = input.nextInt();
        
        for(Cliente aux: baseClientes.devolverClientes()){
            if(aux.getNumeroCliente()==numeroCliente){
                cliente=aux;
            }
        }
        
        Vehiculo nuevoVehiculo = new Vehiculo(marca, modelo, dominio, numeroChasis, numeroMotor, color, tipoVehiculo, anio, cliente);
        baseVehiculos.agregarVehiculo(nuevoVehiculo);
        
    }   
}
