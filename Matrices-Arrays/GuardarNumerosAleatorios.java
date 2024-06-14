/*Diseña un programa que almacena n números aleatorios, positivos. Se pide:
 Imprimir todos los valores del arraylist
 Mostrar cual es el primer valor
 Mostrar el último valor
 Se pide por pantalla al usuario si desea almacenar algún valor, si teclea si, se almacena
el valor tecleado en el arralist. */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GuardarNumerosAleatorios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        Random rand = new Random();

        System.out.println("¿Cuántos números aleatorios deseas generar?");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            numeros.add(rand.nextInt(100));
        }

        System.out.println("Todos los números: " + numeros);

        if (!numeros.isEmpty()) {
            System.out.println("Primer número: " + numeros.get(0));
        }

        if (!numeros.isEmpty()) {
            System.out.println("Último número: " + numeros.get(numeros.size() - 1));
        }

        System.out.println("¿Deseas almacenar algún valor? (si/no)");
        String respuesta = scanner.next();

        if (respuesta.equalsIgnoreCase("si")) {
            System.out.println("Por favor, introduce el valor que deseas almacenar:");
            int valor = scanner.nextInt();
            numeros.add(valor);
            System.out.println("Valor añadido. Ahora los números son: " + numeros);
        }
    }
}