import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaCLI {


    List<Persona> personas = new ArrayList<>();
    Scanner sc;



    public SistemaCLI(){
        sc = new Scanner(System.in);
    }

    public void crearPersona(){
        System.out.println("Ingrese los datos del usuario:");
        System.out.print("Nombre (no espacios en blanco): ");
        String name = sc.next();
        System.out.print("Id (no espacios en blanco): ");
        String id = sc.next();
        System.out.print("Password: ");
        String password = sc.next();
        Persona persona = new Persona(name,id,password);
        personas.add(persona);
        System.out.println("Persona creada");
    }

    public void mostrarPersonas(){
        System.out.printf("Id\t\tNombre\n");
        for (Persona persona : personas) {
            System.out.printf("%s\t\t%s\n",persona.getId(),persona.getNombre());
        }
    }

    public int menu(){
        System.out.println("Seleccione una opcion: ");
        System.out.println("1.Crear Persona");
        System.out.println("2.Mostrar Personas");
        int opc = sc.nextInt();
        return opc;
    }




}
