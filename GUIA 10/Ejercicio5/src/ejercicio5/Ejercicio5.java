/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;
import service.PaisService;

/**
 *
 * @author chris
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PaisService paisServ = new PaisService();
        
        int opt;
        
        do{
            System.out.println("Ingrese una opción");
            System.out.println("1 - Cargar un país");
            System.out.println("2 - Mostrar todos los países");
            System.out.println("3 - Buscar nu país");
            System.out.println("0 - Finalizar");
            
            opt=input.nextInt();
            
            switch(opt){
                case 1:
                    paisServ.crearPais();
                    break;
                case 2:
                    paisServ.mostrarPaises();
                    break;
                case 3:
                    break;
                case 0:
                    break;
                default: System.out.println("Opción invalida");
                
            }
            
        }while(opt!=0);
        

        
    }
    
}
