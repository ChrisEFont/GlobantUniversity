/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.OfficeBuilding;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class OfficeBuildingService {
        Scanner input = new Scanner(System.in);
    
    public OfficeBuilding createOfficeBuilding(){
        System.out.println("Ingrese el largo de la planta");
        float lenght = input.nextFloat();
        System.out.println("Ingrese el ancho de la planta");
        float width = input.nextFloat();
        System.out.println("Ingrese la atura de cada piso");
        float height = input.nextFloat();
        System.out.println("Ingrese la cantidad de oficinas");
        int officesQuantity = input.nextInt();
        System.out.println("Ingrese la cantidad de personas por oficina");
        int peoplePerOffice = input.nextInt();
        System.out.println("Ingrese la cantidad de pisos, sin contar PB");
        int floors = input.nextInt();        
        OfficeBuilding officeBuilding = new OfficeBuilding(officesQuantity, peoplePerOffice, floors, width, height, lenght);
        return officeBuilding;
    }
    
    public void showArea(OfficeBuilding officeBuilding){
        System.out.println("El area es: "+officeBuilding.calculateArea());
    }
    
    public void showVolume(OfficeBuilding officeBuilding){
        System.out.println("El volume es: "+officeBuilding.calculateVolume());
    }
    
    public void ShowTotalPeople(OfficeBuilding officeBuilding){
        System.out.println("El edificio es para un total de: "+officeBuilding.totalPeople());
    }
}
