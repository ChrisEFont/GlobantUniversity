/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import Entity.Cadena;
import Service.CadenaService;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int opt;
        
        CadenaService cadenaS = new CadenaService();
        Cadena cadena = cadenaS.crearCadena();
        
        
        do{
        System.out.println("Ingrese una opción");
        System.out.println("1-Mostrar Vocales");
        System.out.println("2-invertir frase");
        System.out.println("3-Contar una letra");
        System.out.println("4-Comparar longitudes");
        System.out.println("5-Extender frase ");
        System.out.println("6-Reemplazar 'a' con otro caracter");
        System.out.println("7-Buscar una letra");
        System.out.println("8-Mostrar datos");
        System.out.println("0-Para finalizar");
        
        opt=input.nextInt();
        
        switch(opt){
            case 1: cadenaS.mostrarVocalesS(cadena);
            break;
            case 2: cadenaS.invertirFraseS(cadena);
            break;
            case 3: cadenaS.vecesRepetidoS(cadena);
            break;
            case 4: cadenaS.compararLongitudS(cadena);
            break;
            case 5: cadenaS.unirFrasesS(cadena);
            break;
            case 6: cadenaS.reemplazarS(cadena);
            break;
            case 7: cadenaS.contieneS(cadena);
            break;
            case 8: cadenaS.toString(cadena);
            break;
            default: System.out.println("Opcion invalida");;
            break;
            
        }
        
            System.out.println("-------------------------------");        
        
        }while(opt!=0);
        
        
        
        
 
        

    }
    
}
