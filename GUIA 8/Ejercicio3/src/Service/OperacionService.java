/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import ejercicio3.Entity.Operacion;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class OperacionService {

    public OperacionService() {
    }

    public Operacion crearOperacion() {
        Scanner input = new Scanner(System.in);
        Operacion operacionS = new Operacion();
        System.out.println("Ingrese el primer numero");
        operacionS.setNunmero1(input.nextFloat());
        System.out.println("Ingrese el segundo numero");
        operacionS.setNumero2(input.nextFloat());
        return operacionS;
    }
}
