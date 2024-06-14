/*Crea un programa en Java para gestionar una lista de números utilizando tanto un ArrayList
como un array convencional. El programa permitirá realizar operaciones básicas como agregar
números, calcular la suma y encontrar el número más grande en ambas estructuras. */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class OperacionesListaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numerosArrayList = new ArrayList<>();
        int[] numerosArray = new int[10];
        int contador = 0;

        while (true) {
            System.out.println("1. Agregar número");
            System.out.println("2. Calcular suma");
            System.out.println("3. Encontrar el número más grande");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el número a agregar: ");
                    int numero = scanner.nextInt();
                    numerosArrayList.add(numero);
                    if (contador < numerosArray.length) {
                        numerosArray[contador] = numero;
                        contador++;
                    } else {
                        System.out.println("El array convencional está lleno.");
                    }
                    break;
                case 2:
                    int sumaArrayList = numerosArrayList.stream().mapToInt(Integer::intValue).sum();
                    int sumaArray = Arrays.stream(numerosArray).sum();
                    System.out.println("Suma de ArrayList: " + sumaArrayList);
                    System.out.println("Suma de Array: " + sumaArray);
                    break;
                case 3:
                    if (!numerosArrayList.isEmpty()) {
                        int maxArrayList = numerosArrayList.stream().mapToInt(Integer::intValue).max().getAsInt();
                        int maxArray = Arrays.stream(numerosArray).max().getAsInt();
                        System.out.println("Número más grande en ArrayList: " + maxArrayList);
                        System.out.println("Número más grande en Array: " + maxArray);
                    } else {
                        System.out.println("Las listas están vacías.");
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