import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeActoresApp {

    public static void main(String[] args) {
        ListaDeActores lista = new ListaDeActores();
        menu(lista);
    }

    public static void menu(ListaDeActores lista) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\nMENU");
            System.out.println("1. Agregar Nombre");
            System.out.println("2. Modificar Nombre");
            System.out.println("3. Borrar Nombre");
            System.out.println("4. Buscar Nombre");
            System.out.println("5. Visualizar Nombres");
            System.out.println("6. Cantidad de Actores");
            System.out.println("7. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del actor: ");
                    String nombreAgregar = scanner.nextLine();
                    lista.agregarNombre(nombreAgregar);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del actor a modificar: ");
                    String nombreModificarAnterior = scanner.nextLine();
                    System.out.print("Ingrese el nuevo nombre del actor: ");
                    String nombreModificarNuevo = scanner.nextLine();
                    lista.modificarNombre(nombreModificarAnterior, nombreModificarNuevo);
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del actor a borrar: ");
                    String nombreBorrar = scanner.nextLine();
                    lista.borrarNombre(nombreBorrar);
                    break;
                case 4:
                    System.out.print("Ingrese el nombre del actor a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    lista.buscarNombre(nombreBuscar);
                    break;
                case 5:
                    lista.visualizarNombres();
                    break;
                case 6:
                    System.out.println("Cantidad de actores: " + lista.cantidadActores());
                    break;
                case 7:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción del 1 al 7.");
            }
        } while (opcion != 7);

        scanner.close();
    }
}

class ListaDeActores {
    private ArrayList<String> actores;

    public ListaDeActores() {
        this.actores = new ArrayList<>();
    }

    public void agregarNombre(String nombre) {
        if (!actores.contains(nombre)) {
            actores.add(nombre);
            System.out.println("Nombre agregado correctamente.");
        } else {
            System.out.println("El nombre ya existe en la lista.");
        }
    }

    public void modificarNombre(String nombreAnterior, String nuevoNombre) {
        if (actores.contains(nombreAnterior)) {
            int indice = actores.indexOf(nombreAnterior);
            actores.set(indice, nuevoNombre);
            System.out.println("Nombre modificado correctamente.");
        } else {
            System.out.println("El nombre no existe en la lista.");
        }
    }

    public void borrarNombre(String nombre) {
        if (actores.contains(nombre)) {
            actores.remove(nombre);
            System.out.println("Nombre borrado correctamente.");
        } else {
            System.out.println("El nombre no existe en la lista.");
        }
    }

    public void buscarNombre(String nombre) {
        if (actores.contains(nombre)) {
            int indice = actores.indexOf(nombre);
            System.out.println("El nombre '" + nombre + "' se encuentra en la posición " + (indice + 1) + ".");
        } else {
            System.out.println("El nombre no existe en la lista.");
        }
    }

    public void visualizarNombres() {
        if (actores.isEmpty()) {
            System.out.println("La lista de actores está vacía.");
        } else {
            System.out.println("Lista de actores:");
            for (String actor : actores) {
                System.out.println("- " + actor);
            }
        }
    }

    public int cantidadActores() {
        return actores.size();
    }
}