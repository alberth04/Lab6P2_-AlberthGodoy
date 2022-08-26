
package lab6p2_.alberthgodoy;

import java.awt.Color;

/**
 *
 * @author godoy
 */
public class Objetos {
    private Color color;
    private String descripcion;
    private String marca;
    private int size;
    private String calidad;
    private Personas persona;

    public Objetos() {
    }

    public Objetos(Color color, String descripcion, String marca, int size, String calidad, Personas persona) {
        this.color = color;
        this.descripcion = descripcion;
        this.marca = marca;
        this.size = size;
        this.calidad = calidad;
        this.persona = persona;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public Personas getPersona() {
        return persona;
    }

    public void setPersona(Personas persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Objetos{" + "color=" + color + ", descripcion=" + descripcion + ", marca=" + marca + ", size=" + size + ", calidad=" + calidad + ", persona=" + persona + '}';
    }
    
    
}
