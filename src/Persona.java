import java.util.ArrayList;
import java.util.List;

public class Persona {

    private String nombre;
    private String id;
    private String password;
    private List<Usuario> cuentas = new ArrayList<>();

    public Persona(String nombre, String id, String password) {
        this.nombre = nombre;
        this.id = id;
        this.password = password;
    }

    public void crearCuenta(String sitio, String username, String password, int rol){
        Usuario usuario =  new Usuario(sitio,username,password,rol);
        cuentas.add(usuario);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Usuario> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<Usuario> cuentas) {
        this.cuentas = cuentas;
    }
}
