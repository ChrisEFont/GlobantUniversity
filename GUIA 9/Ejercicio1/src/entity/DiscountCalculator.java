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
public class DiscountCalculator {
    
    public DiscountCalculator(Float maxDiscount){
        this.maxDiscount=maxDiscount;        
    }
    
    private float maxDiscount;
    
    public float discount(float importe, float discount){
        return importe*((100-discount)/100);
    }
    
    public float maxDiscount(float importe){
        return importe*((100-maxDiscount)/100);
    }
}
