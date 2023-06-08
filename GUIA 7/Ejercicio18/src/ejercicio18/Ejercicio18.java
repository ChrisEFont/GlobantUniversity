/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio18;

/**
 *
 * @author chris
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz= new int[4][4];
        
        System.out.println("Matriz original:");
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                matriz[i][j]=(int) Math.floor(Math.random()*100); 
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("---------------------------------");
        System.out.println("");        
        System.out.println("Matriz traspuesta:");        

        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                System.out.print(matriz[j][i]+" ");
            }
            System.out.println("");
        }
    }
    
}
