package entity;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class TaskManager {

    public TaskManager() {
    }    
    
    ArrayList<Task> tareas = new ArrayList<>();
    
    public void crearTarea(String nombre, String descripcion){
        Task tarea = new Task(nombre, descripcion);
        tareas.add(tarea);
    }
    
    public void eliminarTarea(int indice){
        tareas.remove(indice);
    }
    
    public void listarTareas(){
        for(Task t: tareas){        
            System.out.println("Nombre: "+t.getNombre());
            System.out.println("Descripción:"+t.getDetalle());
            System.out.println("---------------------------");
        }
    }
    
    public String vertarea(int i){
        return tareas.get(i).getNombre();
    }
    
    public Task getTarea(int i){
        return tareas.get(i);
    }   
            
}
