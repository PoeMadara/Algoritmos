//Se pide por pantalla, un número, para comprobar si es primo. Si se introduce el número cero termina el juego.

import java.util.Scanner;

public class ComprobarPrimo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;

        do {
            System.out.println("Introduce un número (o introduce 0 para salir):");
            numero = teclado.nextInt();

            if (numero != 0) {
                System.out.println((esPrimo(numero) ? "Es primo." : "No es primo."));
            }
        } while (numero != 0);

        System.out.println("Juego terminado.");
        teclado.close();
    }

    private static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}