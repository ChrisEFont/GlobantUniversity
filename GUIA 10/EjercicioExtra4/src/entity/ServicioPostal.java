/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author chris
 */
public class ServicioPostal {
    
    HashMap<Integer, String> codigosPostales = new HashMap();

    public ServicioPostal() {
    }    
    
    public void crearCodigo(int codigo, String ciudad){        
        codigosPostales.put(codigo, ciudad);
    }
    
    public String buscarCodigo(int codigo){
        
        String ciudad=null;
        boolean check=false;
        
        for(Map.Entry<Integer, String> entry: codigosPostales.entrySet()){
            
            if(entry.getKey().equals(codigo)){
                ciudad=entry.getValue();
                check=true;
            }            
        }
        
        if(check){
            return ciudad;
        }else{
            return "El código no existe";
        }
        
    }
    
        public void listarCodigos(){       
        for(Map.Entry<Integer, String> entry: codigosPostales.entrySet()){            
            System.out.println("CP: "+entry.getKey()+" Ciudad: "+entry.getValue());
        }        
    }
    
    
    
    public void eliminarCodigo(int codigo) {

        boolean check = false;

        for (Map.Entry<Integer, String> entry : codigosPostales.entrySet()) {

            if (entry.getKey().equals(codigo)) {
                check = true;
            }
        }

        if (check) {
            codigosPostales.remove(codigo);
        } else {
            System.out.println("El código no existe");
        }
    }
}
