/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eggnews.eggnews.utilities;

/**
 *
 * @author chris
 */
public class PasswordValidator {

    static public int validate(String p1, String p2) {
        int response = 0;

        if (p1.isEmpty() || p1 == null) {
            response = 1;
        }

        if (p1.length() < 8 && response == 0) {
            response = 2;
        }

        if (!p1.equals(p2) && response == 0) {
            response = 3;
        }

        if (response == 0) {
            response = 4;
            for (int i = 0; i < p1.length(); i++) {
                if ((p1.charAt(i) >= 48 && p1.charAt(i) <= 57)) {
                    response = 0;
                }
            }
        }

        if (response == 0) {
            response = 5;
            for (int i = 0; i < p1.length(); i++) {
                if ((p1.charAt(i) >= 65 && p1.charAt(i) <= 90)) {
                    response = 0;
                }
            }
        }

        if (response == 0) {
            response = 6;
            for (int i = 0; i < p1.length(); i++) {
                if ((p1.charAt(i) >= 97 && p1.charAt(i) <= 122)) {
                    response = 0;

                }
            }

        }
        System.out.println(response);
        return response;
    }

    static public int validate(String p1) {
        int response = 0;

        if (p1.isEmpty() || p1 == null) {
            response = 1;
        }

        if (p1.length() < 8 && response == 0) {
            response = 2;
        }

        if (response == 0) {
            response = 4;
            for (int i = 0; i < p1.length(); i++) {
                if ((p1.charAt(i) >= 48 && p1.charAt(i) <= 57)) {
                    response = 0;
                }
            }
        }

        if (response == 0) {
            response = 5;
            for (int i = 0; i < p1.length(); i++) {
                if ((p1.charAt(i) >= 65 && p1.charAt(i) <= 90)) {
                    response = 0;
                }
            }
        }

        if (response == 0) {
            response = 6;
            for (int i = 0; i < p1.length(); i++) {
                if ((p1.charAt(i) >= 97 && p1.charAt(i) <= 122)) {
                    response = 0;

                }
            }

        }
        System.out.println(response);
        return response;
    }

}
