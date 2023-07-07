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
public class Partida {

    public Partida() {
    }    
    
    public Ahorcado nvoAhorcado(String palabraSecreta, int intentosPermitidos){
        Ahorcado nvoAhorcado = new Ahorcado(palabraSecreta, intentosPermitidos);
        return nvoAhorcado;
    }
    
    public void mostrarPalabra(Ahorcado nvoAhoracdo){
        nvoAhoracdo.mostrarPalabra();
        System.out.println("");
    }
    
    public boolean verificarIntentos(Ahorcado nvoAhorcado){
        return nvoAhorcado.getIntentosPermitidos()>0 && nvoAhorcado.getLetrasEncontradas()<nvoAhorcado.getPalabraSecreta().length;
    }
    
    public boolean verificarLetra(Ahorcado nvoAhorcado, String letra){
        boolean letraEncontrada=false;
        for(int i=0; i<nvoAhorcado.getPalabraSecreta().length; i++){
            if(letra.toUpperCase().equals(nvoAhorcado.getPalabraEnJuego()[i])){
                letraEncontrada=true;
            }
        }
        return letraEncontrada;
    }
    
    public boolean intentar(Ahorcado nvoAhorcado, String letra) {
        nvoAhorcado.intento(letra);
        return true;
    }
    
    
    public void finPartida(Ahorcado nvoAhorcado){
        if(nvoAhorcado.getLetrasEncontradas()==nvoAhorcado.getPalabraSecreta().length){
            System.out.println("*********Felicitaciones has ganado**************");
            nvoAhorcado.mostrarPalabra();
            System.out.println("");
        }else {
            System.out.println("<<<<<< Has perdido >>>>>>>>");
            System.out.println("La palabra secreta es:");
            for(int i=0; i<nvoAhorcado.getPalabraSecreta().length; i++){
                System.out.print(nvoAhorcado.getPalabraSecreta()[i]+" ");
            }
            System.out.println("");
        }
    }
}
