
package lab6p2_.alberthgodoy;

import java.awt.Color;

/**
 *
 * @author godoy
 */
public class ObjetosHogar extends Objetos{
    private String descripcionHogar;
    private String instruccionFuncionamiento;
    private String tiempoGarantia;

    public ObjetosHogar() {
    }

    public ObjetosHogar(String descripcionHogar, String instruccionFuncionamiento, String tiempoGarantia, Color color, String descripcion, String marca, int size, String calidad, Personas persona) {
        super(color, descripcion, marca, size, calidad, persona);
        this.descripcionHogar = descripcionHogar;
        this.instruccionFuncionamiento = instruccionFuncionamiento;
        this.tiempoGarantia = tiempoGarantia;
    }

    public String getDescripcionHogar() {
        return descripcionHogar;
    }

    public void setDescripcionHogar(String descripcionHogar) {
        this.descripcionHogar = descripcionHogar;
    }

    public String getInstruccionFuncionamiento() {
        return instruccionFuncionamiento;
    }

    public void setInstruccionFuncionamiento(String instruccionFuncionamiento) {
        this.instruccionFuncionamiento = instruccionFuncionamiento;
    }

    public String getTiempoGarantia() {
        return tiempoGarantia;
    }

    public void setTiempoGarantia(String tiempoGarantia) {
        this.tiempoGarantia = tiempoGarantia;
    }

    @Override
    public String toString() {
        return "ObjetosHogar{" + "descripcionHogar=" + descripcionHogar + ", instruccionFuncionamiento=" + instruccionFuncionamiento + ", tiempoGarantia=" + tiempoGarantia + '}';
    }

    
    
    
}
