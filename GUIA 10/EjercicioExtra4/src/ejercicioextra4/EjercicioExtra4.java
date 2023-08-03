/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra4;

import java.util.Scanner;
import service.ServicioPostalService;

/**
 *
 * @author chris
 */
public class EjercicioExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ServicioPostalService servPostal = new ServicioPostalService();
        
        int opt;
        
        do{
            System.out.println("Ingrese una opción");
            System.out.println("1 - Crear nuevo código");
            System.out.println("2 - Buscar un codigo");
            System.out.println("3 - Eliminar un codigo");
            System.out.println("4 - Listar códigos");
            System.out.println("0 - Finalizar");
            
            opt = input.nextInt();
            
            switch(opt){
                case 1:
                    servPostal.nuevoCodigo();
                    break;
                case 2:
                    servPostal.buscarCodigo();
                    break;
                case 3:
                    servPostal.eliminarCodigo();
                    break;
                case 4:
                    servPostal.listarCodigos();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción invalida");
            }
            
            
        }while(opt!=0);
    }
    
}
