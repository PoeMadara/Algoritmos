/*Crea un programa en Java para gestionar una lista de nombres de asignaturas utilizando un
ArrayList. El programa permitirá agregar nuevas asignaturas, mostrar la lista de asignaturas y
buscar asignaturas por su nombre. */

import java.util.ArrayList;
import java.util.Scanner;

public class CrearListasAsignaturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> asignaturas = new ArrayList<>();

        while (true) {
            System.out.println("1. Agregar asignatura");
            System.out.println("2. Mostrar asignaturas");
            System.out.println("3. Buscar asignatura");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el nombre de la asignatura: ");
                    String asignatura = scanner.next();
                    asignaturas.add(asignatura);
                    break;
                case 2:
                    System.out.println("Asignaturas: " + asignaturas);
                    break;
                case 3:
                    System.out.print("Introduce el nombre de la asignatura a buscar: ");
                    String busqueda = scanner.next();
                    if (asignaturas.contains(busqueda)) {
                        System.out.println("La asignatura " + busqueda + " está en la lista.");
                    } else {
                        System.out.println("La asignatura " + busqueda + " no está en la lista.");
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }
    }
}
