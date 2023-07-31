/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import entity.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class ProductoService {
    
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    private HashMap<String, Producto> productos = new HashMap();

    public ProductoService() {
    }
    
    private Producto crearProducto(){
        System.out.println("Ingrese el nombre del producto");
        String nombre = input.nextLine();
        System.out.println("Ingrese el precio");
        float precio = input.nextFloat();
        Producto producto = new Producto(nombre, precio);
        return producto;
    }
    
    public void agregarProducto(){
        cargarProducto(crearProducto());
    }
    
    
    private void cargarProducto(Producto producto){
        productos.put(producto.getNombre(), producto);
    }
    
    public void modificarPrecio(){
        boolean check=false;
        Producto producto;
        String nombre;
        float precio;
        System.out.println("Ingrese el producto que desea actualizar");
        nombre = input.nextLine();
        System.out.println("Ingrese el nuevo precio");
        precio = input.nextFloat();
        
        for(Map.Entry<String, Producto> aux: productos.entrySet()){
            if(aux.getKey().equals(nombre)){
                producto = aux.getValue();
                producto.setPrecio(precio);
                aux.setValue(producto);
                check=true;
            }
        }
        
        if(!check){
            System.out.println("Producto ingresado invalido");
        }        
    }
    
    public void mostrar(){
        for (Map.Entry<String, Producto> aux : productos.entrySet()) {
            System.out.println(aux.toString());
        }     
    } 
    
    
    
    
}
