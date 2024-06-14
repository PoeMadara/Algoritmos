import java.util.Scanner;

public class PersonaApp {

    public static void main(String[] args) {
        PersonaManager manager = new PersonaManager();
        manager.cargarDatos();
        System.out.println("Datos iniciales:");
        manager.mostrarDatos();

        System.out.print("¿Desea cambiar los datos? (s/n): ");
        Scanner scanner = new Scanner(System.in);
        String respuesta = scanner.nextLine();

        if (respuesta.equalsIgnoreCase("s")) {
            manager.cambiarDatos();
            System.out.println("Datos modificados:");
            manager.mostrarDatos();
        }

        scanner.close();
    }
}

class Persona {
    private String nombre;
    private String apellido;
    private String calle;
    private String telefono;
    private String[] aficiones;

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String[] getAficiones() {
        return aficiones;
    }

    public void setAficiones(String[] aficiones) {
        this.aficiones = aficiones;
    }
}

class PersonaManager {
    private Persona persona;

    public PersonaManager() {
        this.persona = new Persona();
    }

    public void cargarDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nombre: ");
        persona.setNombre(scanner.nextLine());
        System.out.print("Introduce el apellido: ");
        persona.setApellido(scanner.nextLine());
        System.out.print("Introduce la calle: ");
        persona.setCalle(scanner.nextLine());
        System.out.print("Introduce el teléfono: ");
        persona.setTelefono(scanner.nextLine());

        String[] aficiones = new String[3];
        for (int i = 0; i < aficiones.length; i++) {
            System.out.print("Introduce la afición " + (i + 1) + ": ");
            aficiones[i] = scanner.nextLine();
        }
        persona.setAficiones(aficiones);
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());
        System.out.println("Calle: " + persona.getCalle());
        System.out.println("Teléfono: " + persona.getTelefono());
        System.out.println("Aficiones:");
        for (String aficion : persona.getAficiones()) {
            System.out.println("- " + aficion);
        }
    }

    public void cambiarDatos() {
        cargarDatos();
    }
}