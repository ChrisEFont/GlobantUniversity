/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author chris
 */
public class Cadena {
    private String frase;
    private int longitud;

    public Cadena(String frase) {
        this.frase=frase;
        longitud=this.frase.length();
    }    

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }    
    
    public int mostrarVocales(){
        frase=frase.toLowerCase();
        int vocales=0;
        for (int i=0; i<this.longitud; i++){
            if(this.frase.substring(i, i+1).equals("a")){
                vocales++;
            }
            if(this.frase.substring(i, i+1).equals("e")){
                vocales++;
            }
            if(this.frase.substring(i, i+1).equals("i")){
                vocales++;
            }
            if(this.frase.substring(i, i+1).equals("o")){
                vocales++;
            }
            if(this.frase.substring(i, i+1).equals("u")){
                vocales++;
            }            
        }
        return vocales;
    }
    
    public void invertirFrase(){
        for(int i=0; i<longitud; i++){
             System.out.print(frase.substring(longitud-1-i, longitud-i));            
        }
    }
    
    public int vecesRepetido(String letra){
        int repeticiones=0;
        for (int i=0; i<longitud; i++){
            if(frase.substring(i, i+1).equals(letra)){
                repeticiones++;
            }}
        return repeticiones;
    }
    
    public boolean compararLongitud(String frase){
        boolean iguales=false;
        if(longitud==frase.length()){
            iguales=true;
        }        
        return iguales;
    }
    
    public String unirFrases(String frase){
        this.frase=this.frase.concat(frase);
        return this.frase;
    }
    
    public String reemplazar(String letra){
        frase=frase.replaceAll("a", letra);
        return frase;
    }
    
    public boolean contiene(String letra){
        return frase.contains(letra);
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", longitud=" + longitud + '}';
    }
    
    
     
    
}
