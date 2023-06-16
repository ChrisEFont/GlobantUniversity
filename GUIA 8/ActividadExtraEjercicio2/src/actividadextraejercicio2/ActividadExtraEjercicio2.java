/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadextraejercicio2;

import Services.FiguraService;
import actividadextraejercicio2.Entity.Figura;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class ActividadExtraEjercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);       
        int opt;
        
        FiguraService figuraS = new FiguraService();
        Figura figura = new Figura();
        
        
        System.out.println("Elija una opción");
        System.out.println("1-Cuadrado");
        System.out.println("2-Rectángulo");
        System.out.println("3-Triángulo");
        System.out.println("4-Círculo");
        System.out.println("5-Hexágono");
        System.out.println("6-Pentágono");
        System.out.println("7-Rombo");
        
        opt=input.nextInt();
        
        switch(opt){
            case 1:
                figura.setTipoFigura("Cuadrado");
                figuraS.cuadrado(figura);
                break;
            default: System.out.println("Continuara...");    
                
        }
        
        
    }
    
}
