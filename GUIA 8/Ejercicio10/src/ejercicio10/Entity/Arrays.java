/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10.Entity;

/**
 *
 * @author chris
 */
public class Arrays {
    private float arregloA[] = new float[50];
    private float arregloB[] = new float[20];

    public Arrays() {
        for(int i=0; i<50; i++){
            arregloA[i]=(float) Math.round(Math.random()*100);
        } 
    }

    public float[] getArregloA() {
        return arregloA;
    }

    public void setArregloA(float[] arregloA) {
        this.arregloA = arregloA;
    }

    public float[] getArregloB() {
        return arregloB;
    }

    public void setArregloB(float[] arregloB) {
        this.arregloB = arregloB;
    }
    
    public void ordenarA(){
        float aux;
        boolean ordenado=false;
        int i=0;
        
        while(!ordenado){
            if(arregloA[i]>arregloA[i+1]){
                aux=arregloA[i+1];
                arregloA[i+1]=arregloA[i];
                arregloA[i]=aux;
                i=0;
            }else{
                i++;
                if(i==49){
                    ordenado=true;
                }
            }            
        }        
    }
    
    public void completarB(){
        for(int i=0; i<10; i++){
            arregloB[i]=arregloA[i];
        }
        for(int i=10; i<20; i++){
            arregloB[i]=0.5f;
        }            
    }    
    
    public void mostrarA(){
        for(int i=0; i<50; i++){
            System.out.print(arregloA[i]+", ");
            if(i==9||i==19||i==29||i==39){
                System.out.println("");
            }
        }
        System.out.println("");
    }
    
    public void mostrarB() {
        for (int i = 0; i < 20; i++) {
            System.out.print(arregloB[i] + ", ");
            if (i == 9) {
                System.out.println("");
            }
        }
        System.out.println("");
    }    

    @Override
    public String toString() {
        return "Arrays{" + "arregloA=" + arregloA + ", arregloB=" + arregloB + '}';
    }
    
    
    
}
