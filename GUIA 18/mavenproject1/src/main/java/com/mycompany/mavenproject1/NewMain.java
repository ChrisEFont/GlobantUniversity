/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author chris
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String password, passwordVerification;
        
        password="holachola";
        
        passwordVerification="holachola";

        int response = 0;

        if (password.isEmpty() || password == null) {
            response = 1;
        }

        if (password.length() < 8) {
            response = 2;
        }

        if (!password.equals(passwordVerification)) {
            response = 3;
        }

        for (int i = 0; i < password.length(); i++) {

            if (!(password.charAt(i) >= 48 && password.charAt(i) <= 57)) {
                response = 4;
            }

            if (!(password.charAt(i) >= 65 && password.charAt(i) <= 90)) {
                response = 5;
            }

            if (!(password.charAt(i) >= 97 && password.charAt(i) <= 122)) {
                response = 6;
            }
        }

        System.out.println(response);

    }
}

}
