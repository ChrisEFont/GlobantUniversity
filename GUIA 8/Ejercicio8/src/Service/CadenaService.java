/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entity.Cadena;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class CadenaService {
    
    
    public Cadena crearCadena(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la frase deseada");
        Cadena cadena = new Cadena(input.nextLine());
        return cadena;
    }
    
    public void mostrarVocalesS(Cadena cadena){
        System.out.println("La frase tiene "+cadena.mostrarVocales()+" vocales");
    }
    
    public void invertirFraseS(Cadena cadena){
        System.out.println("La frase invertida queda de la seiguiente forma:");
        cadena.invertirFrase();
    }
    
    public void vecesRepetidoS(Cadena cadena){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la letra que desea contar");
        String letra=input.nextLine();        
        System.out.println("La letra se repite "+cadena.vecesRepetido(letra)+" veces");
    }
    
    public void compararLongitudS(Cadena cadena){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la frase que desea comparar:");
        String frase=input.nextLine();
        if(cadena.compararLongitud(frase)){
            System.out.println("Las frases tienen la misma longitud");
        }else{
            System.out.println("La frases NO tienen la misma longitud");
        }       
    }
    
    public void unirFrasesS(Cadena cadena){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la frase que desea agregar");
        String frase=input.nextLine();
        cadena.unirFrases(frase);        
    }
    
    public void reemplazarS(Cadena cadena){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la letra con la que desea reemplazar la 'a'");
        String letra=input.nextLine();
        cadena.reemplazar(letra);        
    }
    
    public void contieneS(Cadena cadena) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la letra con la que desea encontrar");
        String letra = input.nextLine();
        System.out.println(cadena.contiene(letra));
        
    }
    
    public void toString(Cadena cadena){
        System.out.println(cadena.toString());
    }
        
        
    
}
