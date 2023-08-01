/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra3;

import java.util.Scanner;
import service.BibliotecaService;

/**
 *
 * @author chris
 */
public class EjercicioExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        BibliotecaService bibliotecaServ = new BibliotecaService();
        
        int opt;
        
        do{
            System.out.println("Ingrese una opción");
            System.out.println("1 - Crear libro");
            System.out.println("2 - Prestar libro");
            System.out.println("3 - Devolver libro");
            System.out.println("4 - Modificar libro");
            System.out.println("5 - Listar por Autor");
            System.out.println("6 - Listar por Titulo");
            System.out.println("7 - Listar por ISBN");
            System.out.println("0 - Finalizar");
            
            opt = input.nextInt();
            
            switch(opt){
                case 1:
                    bibliotecaServ.crearLibro();
                    break;
                case 2:
                    bibliotecaServ.prestarLibro();
                    break;
                case 3:
                    bibliotecaServ.devolverLibro();
                    break;
                case 4:
                    bibliotecaServ.modificarLibro();
                    break;
                case 5:
                    bibliotecaServ.listarPorAutor();
                    break;
                case 6:
                    bibliotecaServ.listarPorTitulo();
                    break;
                case 7:
                    bibliotecaServ.listarPorIsbn();
                    break;
                case 0:
                    System.out.println("Finalizando...");
                    break;
                default:
                    System.out.println("Opción invalida");
                    break;
            }
            
        }while(opt!=0);
        
    }
    
}
