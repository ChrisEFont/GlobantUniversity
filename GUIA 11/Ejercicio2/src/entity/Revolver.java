/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author chris
 */
public class Revolver {

    public Revolver() {
        llenarRevolver();
    }
    
    
    
    private int posicionActual, posicionAgua;
    
    private void llenarRevolver(){
        posicionActual=(int) Math.floor(Math.random()*12);
        posicionAgua=(int) Math.floor(Math.random()*12);
    }
    
    public Boolean mojar(){
        return posicionActual==posicionAgua;
    }    
    
    public void suguienteChorro(){
        if(posicionActual<12){
            posicionActual++;
        }else{
            posicionActual=1;
        }
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
    
    
    
}
