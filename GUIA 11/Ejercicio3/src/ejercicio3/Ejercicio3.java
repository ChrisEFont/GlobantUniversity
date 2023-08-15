/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import entity.Baraja;
import java.util.Scanner;
import service.BarajaService;

/**
 *
 * @author chris
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        BarajaService barajaServ = new BarajaService();
        
        Baraja baraja = barajaServ.crearBaraja();
        
        barajaServ.armarBaraja(baraja);
        
        int opt;
        do {
            System.out.println("Ingrese una opción");
            System.out.println("1 - Barajar");
            System.out.println("2 - Obtener siguiente carta");
            System.out.println("3 - Cartas disponibles");
            System.out.println("4 - Dar cartas");
            System.out.println("5 - Ver montón");
            System.out.println("6 - Mostrar baraja");
            System.out.println("0 - Finalizar");
            opt = input.nextInt();
            switch (opt) {
                case 1:
                    barajaServ.barajar(baraja);
                    break;
                case 2:
                    barajaServ.siguienteCarta(baraja);
                    break;
                case 3:
                    barajaServ.cartasDisponibles(baraja);
                    break;
                case 4:
                    barajaServ.darCartas(baraja);
                    break;
                case 5:
                    barajaServ.cartasMonton(baraja);
                    break;
                case 6:
                    barajaServ.mostrarBaraja(baraja);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción invalida");
            }
        } while (opt != 0);
        
        System.out.println(baraja.mostrarBaraja().toString());
        
    }
    
}
