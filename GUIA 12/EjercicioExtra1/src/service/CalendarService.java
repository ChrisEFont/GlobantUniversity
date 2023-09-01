/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class CalendarService {
    
    private int num;
    
    Scanner input = new Scanner(System.in);

    public CalendarService() {
    }    
    
    
    public Calendar setDate(Calendar date){
        System.out.println("Ingrese el año");
        num=input.nextInt();
        date.set(Calendar.YEAR, num);
        input.nextLine();
        System.out.println("Ingrese el mes");
        num=input.nextInt();
        date.set(Calendar.MONTH, num);
        input.nextLine();
        System.out.println("Ingrese el día");
        num=input.nextInt();
        date.set(Calendar.DATE, num);
        return date;
    }
    
}
