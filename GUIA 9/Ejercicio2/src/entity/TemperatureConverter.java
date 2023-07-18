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
public class TemperatureConverter {

    public TemperatureConverter() {
    }    
    
    public float celciusToKelvin(float celcius){
        return celcius+273.15f;
    }
    
    public float farenheitToKelvin(float farenheit){
        return (farenheit-32f)*5/9+273.15f;
    }
    
    public float kelvinToCelcius(float kelvin){
        return kelvin-273.15f;
    }
    
    public float kelvinToFarenheit(float kelvin){
        return (kelvin-273.15f)*9/5+32f;
    }
    
    public float celciusToFarenheit(float celcius){
        return this.kelvinToFarenheit(this.celciusToKelvin(celcius));
    }
    
    public float farenheitToCelcius(float farenheit){
        return this.kelvinToCelcius(this.farenheitToKelvin(farenheit));
    }   
    
}
