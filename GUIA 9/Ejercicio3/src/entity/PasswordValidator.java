/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author chris
 */
public class PasswordValidator {

    public PasswordValidator() {
    }    
    
    public boolean longValidation(String password){
        return password.length()>=8;
    }
    
    public boolean numValidation(String password){
        boolean check=false;
        for(int i=0; i<password.length(); i++){
            if(48<=password.charAt(i) && password.charAt(i)<=57){
                check=true;
            }
        }
        return check;
    }
    
    public boolean specialCharValidation(String password){
        boolean check=false;
        for(int i=0; i<password.length(); i++){
            if(32<=password.charAt(i) && password.charAt(i)<=47 || password.charAt(i)==64 ){
                check=true;
            }
        }
        return check;
    }
    
    
    
    
    
}
