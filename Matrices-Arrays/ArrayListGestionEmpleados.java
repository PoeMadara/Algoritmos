/* 3. Realizar un programa para gestionar la lista de Empleados, en que tendremos el siguiente menú:
1. Agregar Nombres.
2. Modificar nombre
3. Borrar Nombres.
4. Visualizar un Nombre
5. Visualizar todos Nombres.
6. Salir.

Si se selecciona 1, nos pedirá cuantos nombres queremos introducir en el arraylist.
La opción 2 modificará los datos de un empleado.
La opción 3, nos dirá como queremos borrar, nos tiene que dar opción a borrar por posición o por nombre La opción.
4 muestra un nombre, según la posición que queremos, hay que comprobar si la posición es correcta.
La opción 5 muestra por pantalla un listado de todos los empleados Tras procesar cada opción, se debe mostrar de nuevo el menú inicial, hasta que se seleccione la opción.
6, que terminará el programa.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListGestionEmpleados {
    public static void main(String[] args) {
        ArrayList<String> empleados = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println(
                    "1. Agregar Nombres\n2. Modificar nombre\n3. Borrar Nombres\n4. Visualizar un Nombre\n5. Visualizar todos Nombres\n6. Salir");
            System.out.print("Elige una opción: ");
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Por favor, introduce un número.");
                scanner.next();
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.print("¿Cuántos nombres quieres introducir? ");
                    int numNombres = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < numNombres; i++) {
                        System.out.print("Introduce el nombre del empleado " + (i + 1) + ": ");
                        String nombre = scanner.nextLine();
                        empleados.add(nombre);
                    }
                    break;
                case 2:
                    System.out.print("¿Qué posición quieres modificar? ");
                    int posModificar = scanner.nextInt();
                    scanner.nextLine();
                    if (posModificar >= 0 && posModificar < empleados.size()) {
                        System.out.print("Introduce el nuevo nombre: ");
                        String nuevoNombre = scanner.nextLine();
                        empleados.set(posModificar, nuevoNombre);
                    } else {
                        System.out.println("Posición inválida.");
                    }
                    break;
                case 3:
                    System.out.print("¿Quieres borrar por posición o por nombre (p/n)? ");
                    char opcionBorrar = scanner.next().charAt(0);
                    scanner.nextLine();
                    if (opcionBorrar == 'p') {
                        System.out.print("¿Qué posición quieres borrar? ");
                        int posBorrar = scanner.nextInt();
                        if (posBorrar >= 0 && posBorrar < empleados.size()) {
                            empleados.remove(posBorrar);
                        } else {
                            System.out.println("Posición inválida.");
                        }
                    } else if (opcionBorrar == 'n') {
                        System.out.print("¿Qué nombre quieres borrar? ");
                        String nombreBorrar = scanner.nextLine();
                        empleados.remove(nombreBorrar);
                    }
                    break;
                case 4:
                    System.out.print("¿Qué posición quieres visualizar? ");
                    int posVisualizar = scanner.nextInt();
                    if (posVisualizar >= 0 && posVisualizar < empleados.size()) {
                        System.out.println("Nombre: " + empleados.get(posVisualizar));
                    } else {
                        System.out.println("Posición inválida.");
                    }
                    break;
                case 5:
                    System.out.println("Todos los empleados:");
                    for (int i = 0; i < empleados.size(); i++) {
                        System.out.println((i + 1) + ". " + empleados.get(i));
                    }
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, elige una opción del 1 al 6.");
                    break;
            }
        } while (opcion != 6);

        scanner.close();
    }
}
