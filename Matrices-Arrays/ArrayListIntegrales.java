/*Diseña un programa que pide por pantalla 5 datos de tipo int, y se almacenan en un arraylist. Posteriormente se pregunta si se desean imprimir los datos, en caso afirmativo mostrar
los datos por pantalla.*/

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListIntegrales {

    public static void main(String[] args) {

        ArrayList<Integer> datos = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce un número: ");
            int dato = scanner.nextInt();
            datos.add(dato);
        }

        System.out.print("¿Deseas mostrar los datos? (S/N): ");
        String respuesta = scanner.next();

        if (respuesta.equalsIgnoreCase("S")) {
            for (int dato : datos) {
                System.out.println(dato);
            }
        }
    }
}
