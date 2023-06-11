/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5.Service;

import ejercicio5.Entity.Cuenta;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class CuentaService {
    
    public Cuenta crearCuenta(){
        Scanner input = new Scanner(System.in);
        Cuenta cuentaS = new Cuenta();
        System.out.println("Ingrese el numero de cuenta");
        cuentaS.setNumeroCuenta(input.nextInt());
        System.out.println("Ingrese el DNI del titular");
        cuentaS.setDni(input.nextLong());
        System.out.println("Ingrese el saldo inicial");
        cuentaS.setSaldo(input.nextDouble());        
        return cuentaS;        
    }
    
    public void ingresarDinero(Cuenta cuenta){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el monto deseado");
        cuenta.ingresar(input.nextDouble());
        System.out.println("-------------------------------------------------");
        System.out.println("Operación exitosa");
        System.out.println("-------------------------------------------------");
    }
    
    public void retirarDinero(Cuenta cuenta){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el monto a retirar");
        cuenta.retirar(input.nextDouble());
        System.out.println("-------------------------------------------------");        
        System.out.println("Operación exitosa");
        System.out.println("-------------------------------------------------");        
    }
    
    public void retiroRapido(Cuenta cuenta){
        cuenta.extracionRapida();
        System.out.println("-------------------------------------------------");        
        System.out.println("Operación exitosa");
        System.out.println("-------------------------------------------------");           
    }
    
    public void consultarSaldo(Cuenta cuenta){
        System.out.println("-------------------------------------------------");
        System.out.println("El saldo actual es de: "+cuenta.getSaldo());
        System.out.println("-------------------------------------------------");
    }
    
    public void consultarDatos(Cuenta cuenta){
        System.out.println("-------------------------------------------------");
        System.out.println(cuenta.toString());
        System.out.println("-------------------------------------------------");
    }
    
    
    
}
