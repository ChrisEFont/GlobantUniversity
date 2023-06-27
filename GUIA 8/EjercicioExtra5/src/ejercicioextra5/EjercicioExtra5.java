/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra5;

import entity.Meses;
import java.util.Scanner;
import service.MesesService;

/**
 *
 * @author chris
 */
public class EjercicioExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MesesService mesesServ = new MesesService();
        Meses meses = mesesServ.crearMeses();
        String mes;
        int intentos=0;
        
        do{
            intentos++;
            System.out.println("Ingrese un mes");
            mes = input.nextLine().toLowerCase();
            if(mesesServ.adivinaMes(meses, mes)){
                System.out.println("Felicitaciones ha acertado el mes secreto en "+intentos+" intentos");
            }else{
                System.out.println("Mes incorrecto");
            }                        
        }while(!mesesServ.adivinaMes(meses, mes));        
        
    }
    
}
