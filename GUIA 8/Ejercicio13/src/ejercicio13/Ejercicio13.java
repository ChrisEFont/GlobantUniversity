/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

import Entity.Curso;
import Service.CursoService;

/**
 *
 * @author chris
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CursoService cursoService = new CursoService();
        Curso curso = cursoService.crearCurso();
        cursoService.mostrarGananciaSemanal(curso);
        cursoService.mostrarCurso(curso);
    }
    
}
