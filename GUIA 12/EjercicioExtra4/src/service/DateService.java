/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class DateService {
    
    public static Date setDate(){
        
        int year, day, month; 
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el año de ingreso");
        year = input.nextInt();
        System.out.println("Ingrese el día");
        day = input.nextInt();
        System.out.println("Ingrese el mes");
        month = input.nextInt();
        Calendar calendar = new GregorianCalendar();
        calendar.set(year, day, month);
        
        input.nextLine();
        
        return calendar.getTime();        
    }
        
}
