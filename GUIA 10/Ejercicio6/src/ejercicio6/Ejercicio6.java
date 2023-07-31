/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;


import Service.ProductoService;
import entity.Producto;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        ProductoService prodServ = new ProductoService();
               
        int opt;
        
        do{
            System.out.println("Ingrese una opción");
            System.out.println("1 - Agregar un producto");
            System.out.println("2 - Actualizar un producto");
            System.out.println("3 - Mostrar productos");
            System.out.println("0 - Finalizar");
            
            opt=input.nextInt();
            
            switch(opt){
                case 1:
                    prodServ.agregarProducto();
                    break;
                case 2:
                    prodServ.modificarPrecio();
                    break;
                case 3:
                    prodServ.mostrar();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
            //System.out.println(input.delimiter());
            
        }while(opt!=0);
        
        
        
    }
    
}
