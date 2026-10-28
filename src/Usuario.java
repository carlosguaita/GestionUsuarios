public class Usuario {

    private String username;
    private String password;
    private String sitio;
    private int rol; //1: administrador 2: usuario normal
    private int contIntentosFallidos = 0;
    private boolean bloqueo = false;

    public Usuario(String sitio, String username, String password, int rol) {
        this.sitio = sitio;
        this.username = username;
        this.password = password;
        this.rol = rol;
    }

    public int intentoFallido(){
        contIntentosFallidos++;
        return  contIntentosFallidos;
    }

    public boolean bloquarUsuario(){
        if (contIntentosFallidos == 3){
            bloqueo = true;
        }
        return bloqueo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }
}
