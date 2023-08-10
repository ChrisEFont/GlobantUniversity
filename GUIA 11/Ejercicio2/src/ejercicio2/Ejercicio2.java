/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;
import service.JuegoService;

/**
 *
 * @author chris
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        JuegoService juegoServ = new JuegoService();
        
        System.out.println("Comenzadon Ruleta Rusa de Agua");        

        
        juegoServ.iniciarJugador();
        juegoServ.cargarJuego();
        
        String opt;
        
        do{
            juegoServ.turno();
            System.out.println("Desea disparar S/N");
            
            opt = input.nextLine();
            
            if(opt.equals("S")){
                if(juegoServ.disparar()){
                opt="N";
                juegoServ.finalizar();
                };
            }else if(opt.equals("N")){
                juegoServ.finalizar();
            }else{
                System.out.println("Opción invalida");
            }
            
        }while(!opt.equals("N"));
        
    }
    
}
