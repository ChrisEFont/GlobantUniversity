/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionClientes;

import java.util.ArrayList;

/**
 *
 * @author chris
 */
public class BaseClientes {
    
    ArrayList<Cliente> clientes = new ArrayList();
    
    private int contador;
    
    private static BaseClientes INSTANCE;
    
    private BaseClientes(){
        contador=0;
    }
    
    public static BaseClientes getInstance(){
        if(INSTANCE == null){
            INSTANCE = new BaseClientes();
        }
        return INSTANCE;
    }
    
    public void agregarCliente(Cliente cliente){
        contador++;
        clientes.add(cliente);
    }
    
    public ArrayList<Cliente> devolverClientes(){
        return clientes;
    }

    public int getContador() {
        return contador;
    }
    
    
    
    
    
}
