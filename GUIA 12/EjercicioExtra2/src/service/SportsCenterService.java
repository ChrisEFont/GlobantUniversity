/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.SportsCenter;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class SportsCenterService {
    
    Scanner input = new Scanner(System.in);
    
    public SportsCenter createSportsCenter(){
        System.out.println("Ingrese el nombre del polideportivo");
        String name = input.nextLine();
        System.out.println("Ingrese el largo de la planta");
        float lenght = input.nextFloat();
        System.out.println("Ingrese el ancho de la planta");
        float width = input.nextFloat();
        input.nextLine();
        System.out.println("Será techado? S/N");
        Boolean roofing=false;
        String option = input.nextLine().toUpperCase();
        switch(option){
            case "S":
                roofing=true;
                break;
            default:
                System.out.println("Opción invalida quedará por defecto (false)");
            break;
        }
        System.out.println("Ingrese la atura de la construcción");
        float height = input.nextFloat();
        SportsCenter sportsCenter = new SportsCenter(name, roofing, width, height, lenght);
        return sportsCenter;
    }
    
    public void showName(SportsCenter sportsCenter){
        System.out.println("El nombre es: "+sportsCenter.getName());
    }
    
    public void showArea(SportsCenter sportsCenter){
        System.out.println("El area es: "+sportsCenter.calculateArea());
    }
    
    public void showVolume(SportsCenter sportsCenter){
        System.out.println("El volumen es: "+sportsCenter.calculateVolume());
    }    
    
}
