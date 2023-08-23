/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionClientes;

import java.util.ArrayList;
import gestionPolizas.Poliza;

/**
 *
 * @author chris
 */
public class Cliente {
    private int numeroCliente;
    private long dni;
    String nombre;
    String domicilio;
    String telefono;
    String email;
    
    ArrayList<Poliza> polizas = new ArrayList();

    public Cliente(int numeroCliente, long dni, String nombre, String domicilio, String telefono, String email) {
        this.numeroCliente = numeroCliente;
        this.dni = dni;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.email = email;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }    

    @Override
    public String toString() {
        return "Cliente{" + "numeroCliente=" + numeroCliente + ", dni=" + dni + ", nombre=" + nombre + ", domicilio=" + domicilio + ", telefono=" + telefono + ", email=" + email + '}';
    }
    
    
    
    
    
}
