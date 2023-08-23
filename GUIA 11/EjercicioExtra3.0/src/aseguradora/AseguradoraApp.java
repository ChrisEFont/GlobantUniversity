/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aseguradora;

import gestionClientes.BaseClientes;
import gestionPolizas.BasePolizas;
import gestionVehiculos.BaseVehiculos;
import java.util.Scanner;
import service.ClienteService;
import service.PolizaService;
import service.VehiculoService;

/**
 *
 * @author chris
 */
public class AseguradoraApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        BaseClientes baseClientes = BaseClientes.getInstance();
        BaseVehiculos baseVehiculos = BaseVehiculos.getInstance();
        BasePolizas basePolizas = BasePolizas.getInstance();
        
        ClienteService clienteServ = new ClienteService();
        VehiculoService vehiculoServ = new VehiculoService();
        PolizaService polizaServ = new PolizaService();
        
        int opt;
        
        do {
            System.out.println("Ingrese una opción");
            System.out.println("1 - Dar de alta un cliente");
            System.out.println("2 - Dar de alta un vehículo");
            System.out.println("3 - Dar de alta una poliza");
            System.out.println("4 - Mostrar Clientes");
            System.out.println("5 - Mostrar Vehículos");
            System.out.println("6 - Mostrar Pólizas");
            System.out.println("0 - Finalizar");
            opt = input.nextInt();
            switch (opt) {
                case 1:
                    clienteServ.crearCliente(baseClientes);
                    break;
                case 2:
                    vehiculoServ.crearVehiculo(baseVehiculos, baseClientes);
                    break;
                case 3:
                    polizaServ.crearPoliza(basePolizas, baseClientes, baseVehiculos);
                    break;
                case 4:
                    clienteServ.mostrarClientes(baseClientes);
                    break;
                case 5:
                    vehiculoServ.mostrarVehiculos(baseVehiculos);
                    break;
                case 6:
                    polizaServ.mostrarPolizas(basePolizas);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción invalida");
            }
        } while (opt != 0);
        
        
    }
    
}
