
package lab6p2_.alberthgodoy;

import java.awt.Color;

/**
 *
 * @author godoy
 */
public class Ropa extends Objetos{
    private String talla;
    private String tipoTela;
    private String paisElaborado;

    public Ropa() {
    }

    public Ropa(String talla, String tipoTela, String paisElaborado, Color color, String descripcion, String marca, int size, String calidad, Personas persona) {
        super(color, descripcion, marca, size, calidad, persona);
        this.talla = talla;
        this.tipoTela = tipoTela;
        this.paisElaborado = paisElaborado;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getTipoTela() {
        return tipoTela;
    }

    public void setTipoTela(String tipoTela) {
        this.tipoTela = tipoTela;
    }

    public String getPaisElaborado() {
        return paisElaborado;
    }

    public void setPaisElaborado(String paisElaborado) {
        this.paisElaborado = paisElaborado;
    }

    @Override
    public String toString() {
        return "Ropa{" + "talla=" + talla + ", tipoTela=" + tipoTela + ", paisElaborado=" + paisElaborado + '}';
    }
    
    
}
