/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.Pais;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class PaisService {
    
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    private HashSet<Pais> paises = new HashSet();
    
    public PaisService(){        
    }
    
    public void crearPais(){
        System.out.println("Ingrese el nombre del país");
        Pais pais = new Pais(input.nextLine());
        guardarPais(pais);
    }
    
    public void guardarPais(Pais pais){
        paises.add(pais);
    }
    
    public void mostrarPaises(){
        ArrayList<Pais> paisesLista=this.ordenarPaises();        
        for(Pais aux: paisesLista){
            System.out.println(aux.getNombre());
        }
    }
    
    public ArrayList<Pais> ordenarPaises(){
        ArrayList<Pais> paisesLista = new ArrayList(paises);
        paisesLista.sort(Pais.compararNombre);
        return paisesLista;
    }
    
    public void eliminarPais(){
        String paisDel;
        System.out.println("Ingrese el país quedesea eliminar");
        paisDel = input.nextLine();
        Iterator<Pais> iterator = paises.iterator();
        while(iterator.hasNext()){
            if(iterator.next().getNombre().equals(paisDel)){
                iterator.remove();
            }
        }        
    }   
}
