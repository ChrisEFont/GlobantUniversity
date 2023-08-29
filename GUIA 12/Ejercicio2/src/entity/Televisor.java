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
public class Televisor extends Electrodomestico {
    
    private int resolucion;
    private boolean sintonizadorTdt;

    public Televisor() {
    }

    public Televisor(String color, float precio, float peso, char consumo, int resolucion, boolean sintonizadorTdt) {
        super(color, precio, peso, consumo);
        this.resolucion = resolucion;
        this.sintonizadorTdt = sintonizadorTdt;
    }
    
    public void crearTelevisor(){
        super.crearElectrodomestico();
        System.out.println("Ingrese la resolucuón en pulgadas");
        resolucion = input.nextInt();
        System.out.println("Tiene sintonizador TDT? SI/NO");
        input.nextLine();
        String option = input.nextLine();
        if(option.equals("SI")){
            sintonizadorTdt=true;
        }else{
            sintonizadorTdt=false;
        }
    }
    
    @Override
    public void precioFinal(){
        if(40<resolucion){
            super.setPrecio(super.getPrecio()*1.3f);
        }
        if(sintonizadorTdt){
            super.setPrecio(super.getPrecio()+500);
        }
        super.precioFinal();
    }
    
    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTdt() {
        return sintonizadorTdt;
    }

    public void setSintonizadorTdt(boolean sintonizadorTdt) {
        this.sintonizadorTdt = sintonizadorTdt;
    }
    
        
    
}
