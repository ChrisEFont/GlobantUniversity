/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication116;

/**
 *
 * @author chris
 */
public class JavaApplication116 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String password, passwordVerification;

        password = "A234567z";

        passwordVerification = "A234567z";

        int response = 0;

        if (password.isEmpty() || password == null) {
            response = 1;
        }

        if (password.length() < 8 && response == 0) {
            response = 2;
        }

        if (!password.equals(passwordVerification) && response == 0) {
            response = 3;
        }

        if (response == 0) {
            response=4;
            for (int i = 0; i < password.length(); i++) {
                if ((password.charAt(i) >= 48 && password.charAt(i) <= 57)) {
                    response = 0;
                }
            }
        }

        if (response == 0) {
            response=5;
            for (int i = 0; i < password.length(); i++) {
                if ((password.charAt(i) >= 65 && password.charAt(i) <= 90)) {
                    response = 0;
                }
            }
        }

        if (response == 0) {
            response=6;
            for (int i = 0; i < password.length(); i++) {
                if ((password.charAt(i) >= 97 && password.charAt(i) <= 122)) {
                    response = 0;

                }
            }

        }

        System.out.println(response);
    }
}
