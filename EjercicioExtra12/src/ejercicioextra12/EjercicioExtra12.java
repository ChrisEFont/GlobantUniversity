/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra12;

/**
 *
 * @author chris
 */
public class EjercicioExtra12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String dig1, dig2, dig3;
        
        for (int k=0; k<10; k++){
            if (k==3){
                dig3="E";
            }else{dig3=Integer.toString(k);}            
            for(int j=0; j<10; j++){
                if(j==3){
                    dig2="E";
                }else{dig2=Integer.toString(j);}
                for(int i=0; i<10; i++){
                    if(i==3){
                        dig1="E";
                    }else{dig1=Integer.toString(i);}
                    System.out.println(dig3+"-"+dig2+"-"+dig1);
                }
            }
        }
        
        
    }   
}
