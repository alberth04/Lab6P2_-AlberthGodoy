
package lab6p2_.alberthgodoy;

/**
 *
 * @author godoy
 */
public class Gerente extends Personas{
    private String usuario;
    private String password;
    private String cargo;

    public Gerente() {
    }

    public Gerente(String usuario, String password, String cargo, String iD, String nombrel, int edad, String sexo, String estadoCivil, double peso, double altura) {
        super(iD, nombrel, edad, sexo, estadoCivil, peso, altura);
        this.usuario = usuario;
        this.password = password;
        this.cargo = cargo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
