/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.ServicioPostal;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class ServicioPostalService {
    
    Scanner input = new Scanner(System.in);
    
    ServicioPostal servicioPostal = new ServicioPostal();
    
    public void nuevoCodigo(){
        System.out.println("Ingrese el código");
        int codigo=input.nextInt();
        System.out.println("Ingrese la ciudad");
        input.nextLine();
        String ciudad = input.nextLine();
        servicioPostal.crearCodigo(codigo, ciudad);
    }
    
    public void buscarCodigo(){
        System.out.println("Ingrese el codigo a buscar");
        int codigo = input.nextInt();
        System.out.println(servicioPostal.buscarCodigo(codigo));
    }
    
    public void listarCodigos(){
        servicioPostal.listarCodigos();
    }
    
    public void eliminarCodigo(){
        System.out.println("Ingrese el codigo que desea eliminar");
        int codigo = input.nextInt();
        servicioPostal.eliminarCodigo(codigo);
    }
    
}
