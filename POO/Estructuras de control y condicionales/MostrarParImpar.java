/*Se pide un número por pantalla, comprobar si el número es par o impar. En el caso de que sea par se muestra el mensaje:"El número es par",
 en el caso de que sea impar aparece el mensaje "El número es impar". */

import java.util.Scanner;

public class MostrarParImpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        if (teclado.hasNextInt()) {
            int numero = teclado.nextInt();
            if (numero % 2 == 0) {
                System.out.println("El numero: " + numero + " es par");
            } else {
                System.out.println("El numero: " + numero + " es impar");
            }
        } else {
            System.err.println("No se ha introducido un numero");
        }
        teclado.close();
    }
}