
package lab6p2_.alberthgodoy;

/**
 *
 * @author godoy
 */
public class Personas {
    private String iD;
    private String nombrel;
    private int edad;
    private String sexo;
    private String estadoCivil;
    private double peso;
    private double altura;

    public Personas(String iD, String nombrel, int edad, String sexo, String estadoCivil, double peso, double altura) {
        this.iD = iD;
        this.nombrel = nombrel;
        this.edad = edad;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.peso = peso;
        this.altura = altura;
    }

    public Personas() {
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getNombrel() {
        return nombrel;
    }

    public void setNombrel(String nombrel) {
        this.nombrel = nombrel;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Personas{" + "iD=" + iD + ", nombrel=" + nombrel + ", edad=" + edad + ", sexo=" + sexo + ", estadoCivil=" + estadoCivil + ", peso=" + peso + ", altura=" + altura + '}';
    }
    
    
    
}
