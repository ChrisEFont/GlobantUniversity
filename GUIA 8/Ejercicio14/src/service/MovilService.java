package service;


import entity.Movil;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class MovilService {

    public MovilService() {
    }    
    
    public Movil cargarCelular(){
        Scanner input = new Scanner(System.in);        
        Movil movil = new Movil();
        System.out.println("Ingrese la marca");
        movil.setMarca(input.nextLine());
        System.out.println("Ingrese el modelo");
        movil.setModelo(input.nextLine());
        System.out.println("Ingrese el código");        
        movil.setCodigo(ingresarCodigo(input.nextLine()));
        return movil;        
    }
    
    public int[] ingresarCodigo(String cod){
        int codigo[] = new int[7];        
        for(int i=0; i<7; i++){
            codigo[i]=(int) Integer.parseInt(cod.substring(i, i+1));
        }
        return codigo;
    }
    
    public void mostrarDatos(Movil movil){
        System.out.println(movil.toString());
        System.out.print("Codigo: ");
        for(int c: movil.codigo){
            System.out.print(c);
        }
        System.out.println("");
    }
    
}
