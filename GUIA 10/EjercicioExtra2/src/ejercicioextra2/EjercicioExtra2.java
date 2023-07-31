/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra2;

import entity.CantanteFamoso;
import java.util.ArrayList;
import java.util.Scanner;
import service.CantanteFamosoService;

/**
 *
 * @author chris
 */
public class EjercicioExtra2 {
    
    static Scanner input = new Scanner(System.in);
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        CantanteFamosoService cantanteServ = new CantanteFamosoService();
                
        ArrayList<CantanteFamoso> cantantes = new ArrayList();
        
        int opt=0;
        
        do{
            System.out.println("Ingrese una opción");
            System.out.println("1 - Agregar un cantante");
            System.out.println("2 - Mostrar todos los cantantes");
            System.out.println("3 - Eliminar un cantante");
            System.out.println("0 - Terminar");
            opt=input.nextInt();
            
            switch(opt){
                case 1:
                    cantantes.add(cantanteServ.crearCantante());
                    break;
                case 2:
                    mostrarCantantes(cantantes);
                    break;
                case 3:
                    eliminarCantante(cantantes);
                    break;
                case 0:
                    mostrarCantantes(cantantes);
                    break;                    
                default:
                    System.out.println("Opción invalida");
                    break;
            }
            
            
        }while(opt!=0);
        
        
    }
    
    public static void mostrarCantantes(ArrayList<CantanteFamoso> cantantes){
        for(CantanteFamoso aux: cantantes){
            System.out.println(aux.toString());
        }
    }
    
    public static void eliminarCantante(ArrayList<CantanteFamoso> cantantes){
        
        System.out.println("Ingrese le nombre del cantante que desea eliminar");
        input.nextLine();
        String nombre = input.nextLine();
        for(int i=0; i<cantantes.size(); i++){
            if(cantantes.get(i).getNombre().equals(nombre)){
                cantantes.remove(i);
            }
        }
    }
    
}
