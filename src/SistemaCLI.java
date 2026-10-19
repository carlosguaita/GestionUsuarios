import java.util.Scanner;

public class SistemaCLI {


    Usuario[] usuarios = new Usuario[5];
    Scanner sc;
    int contU = 0;


    public SistemaCLI(){
        sc = new Scanner(System.in);
    }

    public void crearUsuario(){
        System.out.println("Ingrese los datos del usuario:");
        System.out.print("Username (no espacios en blanco): ");
        String username = sc.next();
        System.out.print("Password: ");
        String password = sc.next();
        System.out.print("Rol (1.Admin., 2.Normal): ");
        int rol = sc.nextInt();
        Usuario usuario = new Usuario(username,password,rol);
        usuarios[contU] = usuario;
        contU++;
        System.out.println("Usuario creado");
    }

    public void mostrarUsuarios(){
        System.out.printf("#\t\tUsername\t\tRol\n");
        for (int i = 0; i < contU; i++){
            System.out.printf("%d\t\t%s\t\t%d\n",i,usuarios[i].getUsername(),usuarios[i].getRol());
        }
    }

    public int menu(){
        System.out.println("Seleccione una opcion: ");
        System.out.println("1.Crear Usuario");
        System.out.println("2.Mostrar Usuarios");
        int opc = sc.nextInt();
        return opc;
    }

    public boolean validarUsuario(){
        System.out.println("Ingrese los datos del usuario: ");
        System.out.print("Username: ");
        String username = sc.next();
        System.out.print("Password: ");
        String password = sc.next();

        for (int i = 0; i < contU; i++){
            if (username.equals(usuarios[i].getUsername()) && password.equals(usuarios[i].getPassword())){
                System.out.println("Acceso");
                break;
            }
        }
    }


}
