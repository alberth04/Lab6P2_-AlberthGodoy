
package lab6p2_.alberthgodoy;

import java.awt.Color;

/**
 *
 * @author godoy
 */
public class Zapatos extends Objetos{
    private double talla;
    private String descripcionSuela;
    private int comodidad;

    public Zapatos() {
    }

    public Zapatos(double talla, String descripcionSuela, int comodidad, Color color, String descripcion, String marca, int size, String calidad, Personas persona) {
        super(color, descripcion, marca, size, calidad, persona);
        this.talla = talla;
        this.descripcionSuela = descripcionSuela;
        this.comodidad = comodidad;
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    public String getDescripcionSuela() {
        return descripcionSuela;
    }

    public void setDescripcionSuela(String descripcionSuela) {
        this.descripcionSuela = descripcionSuela;
    }

    public int getComodidad() {
        return comodidad;
    }

    public void setComodidad(int comodidad) {
        this.comodidad = comodidad;
    }

    @Override
    public String toString() {
        return "Zapatos{" + "talla=" + talla + ", descripcionSuela=" + descripcionSuela + ", comodidad=" + comodidad + '}';
    }
    
    
}
