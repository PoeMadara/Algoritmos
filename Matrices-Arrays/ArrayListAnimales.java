/*Realizar un programa donde se almacenan los nombres de diferentes animales. Se piden nombres por pantalla hasta que se
introduce la palabra salir. Se deben visualizar todos los valores introducidos y el número de valores que se introducen */

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListAnimales {

    public static void main(String[] args) {

        ArrayList<String> animales = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        String animal;
        do {
            System.out.print("Introduce un nombre de animal (Escribir salir para terminar): ");
            animal = scanner.next();
            if (!animal.equalsIgnoreCase("salir")) {
                animales.add(animal);
            }
        } while (!animal.equalsIgnoreCase("salir"));

        System.out.println("Animales introducidos:");
        for (String nombre : animales) {
            System.out.println(nombre);
        }

        System.out.println("Número de animales: " + animales.size());
    }
}
