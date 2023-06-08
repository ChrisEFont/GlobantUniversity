/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra23;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class EjercicioExtra23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cont=0, fila=0, pos;
        String palabra;
        String sopa[][] = new String[20][20], palabras[][] = new String [5][5];
        //char letra = (char) Math.floor(90+(Math.random()*32));
        Scanner input = new Scanner(System.in);
        
        
        //Completa la matriz de palabra ingresadas con caracteres aleatorio para evitarr null
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                char letra = (char) Math.floor(97 + (Math.random() * 25));
                palabras[i][j] = String.valueOf(letra);
            }
        }        
        
        //guardo las palabras ingresadas en una matriz 5x5
        
        do{
            System.out.println("Por favor ingrese una palabra de 3 a 5 letras");
            palabra = input.next();
            if(palabra.length()<3 || palabra.length()>5 ){
                System.out.println("Palabra Invalida");
            }else{
                for (int i=0; i<palabra.length(); i++){
                    palabras[cont][i]=palabra.substring(i, i+1) ;
                }
                cont++;
            }
        }while(cont<5);  
        
        //Llena la sopa de letras con caracteres aleatorios
        for(int i=0; i<20; i++){
            for(int j=0; j<20; j++){
                char letra = (char) Math.floor(97 + (Math.random() * 25));
                sopa[i][j] = String.valueOf(letra);
            }
        }        

        //Completa la sopa de letras con las palabras ingresadas    
        for (int k = 0; k < 5; k++) {
            pos = (int) Math.floor(Math.random() * 15);
            for (int i = 0; i < 5; i++) {
                sopa[fila][pos + i] = palabras[k][i];
            }
            fila = fila + 4;
        }        

        
//        if(!sopa[0][0].equals("a")){
//            System.out.println("Lindo cartel");
//        }

        //Muestra la sopa de letras
        for(int i=0; i<20;i++){
            for(int j=0; j<20;j++){
                System.out.print(sopa[i][j]+" ");
            }
            System.out.println("");
        }        
        
        //Muestra matriz de palabras ingresadas
//        for(int i=0; i<5;i++){
//            for(int j=0; j<5;j++){
//                System.out.print(palabras[i][j]);
//            }
//            System.out.println("");
//        }        
        
    }
    
}
