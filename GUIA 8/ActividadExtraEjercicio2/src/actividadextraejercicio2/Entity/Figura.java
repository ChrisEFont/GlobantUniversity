/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadextraejercicio2.Entity;

/**
 *
 * @author chris
 */
public class Figura {
    
    private String tipoFigura;
    
    private float area, perimetro;
    

    public Figura() {
    }

    public Figura(String tipoFigura, float area, float perimetro) {
        this.tipoFigura = tipoFigura;
        this.area = area;
        this.perimetro = perimetro;
    }

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }

    
    
}
