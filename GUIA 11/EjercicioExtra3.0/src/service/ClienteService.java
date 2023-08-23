/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import gestionClientes.BaseClientes;
import gestionClientes.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class ClienteService {
    
    Scanner input = new Scanner(System.in);

    public ClienteService() {
    }    
    
    public void mostrarClientes(BaseClientes baseClientes){
        ArrayList<Cliente> clientes = baseClientes.devolverClientes();
        for(Cliente aux: clientes){
            System.out.println(aux.toString());
        }      
    }
    
    public void crearCliente(BaseClientes baseClientes){
        int numeroCliente = baseClientes.getContador()+1;
        System.out.println("Ingrese el DNI");
        long dni = input.nextLong();
        input.nextLine();
        System.out.println("Ingrese el nombre");
        String nombre = input.nextLine();
        System.out.println("Ingrese el domicilio");
        String domicilio = input.nextLine();
        System.out.println("Ingrese el telefono");
        String telefono = input.nextLine();
        System.out.println("Ingrese el email");
        String email = input.nextLine();
        Cliente nuevoCliente = new Cliente(numeroCliente, dni, nombre, domicilio, telefono, email);
        baseClientes.agregarCliente(nuevoCliente);
    }        
}
