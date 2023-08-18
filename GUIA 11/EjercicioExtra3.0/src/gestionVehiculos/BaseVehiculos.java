/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionVehiculos;

import java.util.ArrayList;

/**
 *
 * @author chris
 */
public class BaseVehiculos {
    
    private ArrayList<Vehiculo> vehiculos = new ArrayList();
    
    private static BaseVehiculos INSTANCE;
    
    private BaseVehiculos(){
    }
    
    public static BaseVehiculos getInstance(){
        if(INSTANCE == null){
            INSTANCE = new BaseVehiculos();
        }
        return INSTANCE;
    }
    
    public void agregarVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }
    
    public ArrayList<Vehiculo> devolverVehiculos(){
        return vehiculos;
    }
    
}
