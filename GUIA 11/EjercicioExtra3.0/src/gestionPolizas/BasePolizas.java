/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionPolizas;

import java.util.ArrayList;

/**
 *
 * @author chris
 */
public class BasePolizas {
    
    ArrayList<Poliza> polizas = new ArrayList();
    
    private int contador;
    
    private static BasePolizas INSTANCE;
    
    private BasePolizas(){
        contador=0;
    }
    
    public static BasePolizas getInstance(){
        if(INSTANCE == null){
            INSTANCE = new BasePolizas();            
        }
        return INSTANCE;
    }
    
    public void agregarPoliza(Poliza poliza){
        contador++;
        polizas.add(poliza);
    }
    
    public ArrayList<Poliza> devolverPolizas(){
        return polizas;
    }
    
}
