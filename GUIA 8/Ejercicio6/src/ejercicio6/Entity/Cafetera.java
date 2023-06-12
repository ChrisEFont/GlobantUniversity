/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6.Entity;

/**
 *
 * @author chris
 */
public class Cafetera {
    private int capacidadMaxima=1000, cantidadActual=0;

    public Cafetera() {
    }
    
    
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima=capacidadMaxima;
        this.cantidadActual=cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }    
    
        
    public void llenarCafetera(){
        cantidadActual=capacidadMaxima;
    }
    
    public void servirTaza(int tamanoTaza){
        if (tamanoTaza<cantidadActual){
            cantidadActual-=tamanoTaza;
            System.out.println("La taza se lleno correctamente");
        }else{            
            System.out.println("No hay suficiente cafe, la taza se lleno "+ cantidadActual);
            cantidadActual=0;
        }
    }
    
    public void vaciaCafetera(){
        cantidadActual=0;
        System.out.println("Cafetera vaciada correctamente");
    }
    
    public void agregarCafe(int cantidad){
        if(capacidadMaxima<cantidadActual+cantidad){
            System.out.println("No es posible ingresar esa cantidad de cafe");
            System.out.println("Se ha ingresado "+(capacidadMaxima-cantidadActual)+" cm3 de cafe");
            cantidadActual=capacidadMaxima;            
        }else{
            cantidadActual+=cantidad;
            System.out.println("Agregado correcto");
            System.out.println("La cantidad actual es "+cantidadActual);
        }
    }
    
}
