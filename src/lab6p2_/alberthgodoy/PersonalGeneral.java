
package lab6p2_.alberthgodoy;

/**
 *
 * @author godoy
 */
public class PersonalGeneral extends Personas{
    private String ocupacion;
    private String horarioTrabajo;
    private int tiempoTrabajo;
    private double sueldo;

    public PersonalGeneral() {
    }

    public PersonalGeneral(String ocupacion, String horarioTrabajo, int tiempoTrabajo, double sueldo, String iD, String nombrel, int edad, String sexo, String estadoCivil, double peso, double altura) {
        super(iD, nombrel, edad, sexo, estadoCivil, peso, altura);
        this.ocupacion = ocupacion;
        this.horarioTrabajo = horarioTrabajo;
        this.tiempoTrabajo = tiempoTrabajo;
        this.sueldo = sueldo;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getHorarioTrabajo() {
        return horarioTrabajo;
    }

    public void setHorarioTrabajo(String horarioTrabajo) {
        this.horarioTrabajo = horarioTrabajo;
    }

    public int getTiempoTrabajo() {
        return tiempoTrabajo;
    }

    public void setTiempoTrabajo(int tiempoTrabajo) {
        this.tiempoTrabajo = tiempoTrabajo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "PersonalGeneral{" + "ocupacion=" + ocupacion + ", horarioTrabajo=" + horarioTrabajo + ", tiempoTrabajo=" + tiempoTrabajo + ", sueldo=" + sueldo + '}';
    }
    
    
}
