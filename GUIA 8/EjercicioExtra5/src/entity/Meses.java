package entity;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class Meses {

    public Meses() {
        
    }    
    
    static private final String meses[] = {"enero", "febrero", "marzo","abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    private String mesSEcreto = meses[(int) Math.round(Math.random()*12)];

    public String getMesSEcreto() {
        return mesSEcreto;
    }
    
}
