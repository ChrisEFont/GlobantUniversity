/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.Meses;

/**
 *
 * @author chris
 */
public class MesesService {
    
    
    public Meses crearMeses(){
        Meses meses = new Meses();
        return meses;
    }
    
    public boolean adivinaMes(Meses meses, String mes){
        return mes.equals(meses.getMesSEcreto());
    }    
    
}
