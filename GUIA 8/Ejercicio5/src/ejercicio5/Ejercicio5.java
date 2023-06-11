/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import ejercicio5.Entity.Cuenta;
import ejercicio5.Service.CuentaService;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        int opt;
        
        CuentaService cuentaS = new CuentaService();
        
        Cuenta cuenta = cuentaS.crearCuenta();
        
        do{
            System.out.println("Ingrese una opción");
            System.out.println("(1) Ingresar dinero.");
            System.out.println("(2) Retirar dinero.");
            System.out.println("(3) Retiro rapido.");
            System.out.println("(4) Consultar saldo.");
            System.out.println("(5) Consultar datos.");
            System.out.println("(0) Terminar.");
            opt=input.nextInt();
            
            switch(opt){
                case 1: cuentaS.ingresarDinero(cuenta);
                break;
                case 2: cuentaS.retirarDinero(cuenta);
                break;
                case 3: cuentaS.retiroRapido(cuenta);
                break;
                case 4: cuentaS.consultarSaldo(cuenta);
                break;
                case 5: cuentaS.consultarDatos(cuenta);
                break;
                case 0:
                    System.out.println("-------------------------------------");
                    System.out.println("Operacion finalizada");
                    System.out.println("-------------------------------------");
                break;
                default: System.out.println("Opción invalida");
                break;
            }           
        }while(opt!=0);        
    }    
}
