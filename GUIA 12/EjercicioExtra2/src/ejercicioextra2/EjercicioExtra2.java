/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra2;

import entity.Building;
import entity.OfficeBuilding;
import entity.SportsCenter;
import java.util.ArrayList;
import java.util.Scanner;
import service.OfficeBuildingService;
import service.SportsCenterService;

/**
 *
 * @author chris
 */
public class EjercicioExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Building> buildings = new ArrayList();
        
        OfficeBuildingService oBService = new OfficeBuildingService();
        
        SportsCenterService sCService = new SportsCenterService();
        
        Scanner input = new Scanner(System.in);
        
        int option;
        do {
            System.out.println("Que tipo de construcción desea");
            System.out.println("1 - Crear un edificio de oficinas");
            System.out.println("2 - Crear un polidportivo");
            System.out.println("0 - Finalizar");
            option = input.nextInt();
            switch (option) {
                case 1:                    
                    buildings.add(oBService.createOfficeBuilding());
                    break;
                case 2:
                    buildings.add(sCService.createSportsCenter());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción invalida");
            }
        } while (option != 0);
        
        for(Building aux: buildings){
            if(aux instanceof OfficeBuilding){
                oBService.showArea((OfficeBuilding) aux);
                oBService.showVolume((OfficeBuilding) aux);
                oBService.ShowTotalPeople((OfficeBuilding) aux);
            }
            if(aux instanceof SportsCenter){
                sCService.showName((SportsCenter) aux);
                sCService.showArea((SportsCenter) aux);
                sCService.showVolume((SportsCenter) aux);                
            }
        }        
    }    
}
