/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra1;

import entity.Rent;
import java.util.ArrayList;
import java.util.Scanner;
import service.RentService;

/**
 *
 * @author chris
 */
public class EjercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Rent> rents = new ArrayList();
        RentService rentService = new RentService();
        
        Scanner input = new Scanner(System.in);
        
        int opt;
        do {
            System.out.println("Ingrese una opción");
            System.out.println("1 - Crear una renta");
            System.out.println("2 - Mostrar rentas");
            System.out.println("0 - Finalizar");
            opt = input.nextInt();
            switch (opt) {
                case 1:
                    rents.add(rentService.createRent());                   
                    break;
                case 2:
                    rentService.showRents(rents);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción invalida");
            }
        } while (opt != 0);
        
        
    }
    
}
