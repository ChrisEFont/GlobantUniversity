package entity;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class Nif {
   private long dni;
   private char letra;

    public Nif() {
    }
    
    public Nif(long dni){
        this.dni=dni;
        this.setLetra(this.crearNif(dni));
    }

    public Nif(long dni, char letra) {
        this.dni = dni;
        this.letra = letra;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
    
    public char crearNif(long dni){
        long digitoVerificador = dni%23;
        switch((int)digitoVerificador){
            case 0: letra = 84;
            break;
            case 1: letra = 82;
            break;
            case 2: letra = 87;
            break;
            case 3: letra = 65;
            break;
            case 4: letra = 71;
            break;
            case 5: letra = 77;
            break;
            case 6: letra = 89;
            break;
            case 7: letra = 70;
            break;
            case 8: letra = 80;
            break;
            case 9: letra = 68;
            break;
            case 10: letra = 88;
            break;
            case 11: letra = 66;
            break;
            case 12: letra = 78;
            break;
            case 13: letra = 74;
            break;
            case 14: letra = 90;
            break;
            case 15: letra = 83;
            break;
            case 16: letra = 81;
            break;
            case 17: letra = 86;
            break;
            case 18: letra = 72;
            break;
            case 19: letra = 76;
            break;
            case 20: letra = 67;
            break;
            case 21: letra = 75;
            break;
            case 22: letra = 69;
            break;            
        }
        return letra;
    }
    
    public String mostrar(){
        return this.dni+"-"+this.letra;
    }   
}
