/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5.Entity;

/**
 *
 * @author chris
 */
public class Cuenta {
    private int numeroCuenta;
    private double saldo;
    private long dni;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, double saldo, long dni) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.dni = dni;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }
    
    public void ingresar(double ingreso){
        saldo+=ingreso;
    }
    
    public void retirar(double retiro){
        if(retiro>saldo){
            saldo=0;
        }else{
            saldo-=retiro;
        }        
    }
    
    public void extracionRapida(){
        saldo-=saldo*0.2;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", dni=" + dni + '}';
    }    
}
