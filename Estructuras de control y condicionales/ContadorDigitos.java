import java.util.Scanner;

public class ContadorDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número entre 0 y 999: ");
        int numero = scanner.nextInt();

        if (numero == 0) {
            System.out.println("Fin del juego.");
        } else if (numero >= 1 && numero <= 999) {
            int digitos = contarDigitos(numero);
            System.out.println("El número " + numero + " tiene " + digitos + " dígito(s).");
        } else {
            System.out.println("Número fuera de rango. Debe estar entre 0 y 999.");
        }
    }

    public static int contarDigitos(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (int) Math.log10(n) + 1;
        }
    }
}
