/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        boolean flag=true;
        String message;
        int validos=0, invalidos=0;
        Scanner input = new Scanner(System.in);
        
        
        do{
          System.out.println("Ingrese el mensaje (*) para termimar");  
          message=input.nextLine();
          if(message.equals("*")){
              flag=false;
          }else if (message.substring(0, 1).equals("X") 
                  && message.substring(4, 5).equals("O") 
                  && message.length()==5){
              validos++;             
          }else{
              invalidos++;
          }
        }while(flag);
        
        System.out.println("Mensajes validos: "+validos);
        System.out.println("mensajes invalidos: "+invalidos);
        
    }

    
    
}
