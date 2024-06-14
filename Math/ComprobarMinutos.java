import java.util.Scanner;

public class ComprobarMinutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;

        do {
            System.out.print("Introduzca el valor de segundos: ");
            int segundos = scanner.nextInt();

            int minuto = (int) Math.floor(segundos / 60.0) + 1;

            System.out.println("El minuto es el " + minuto);

            System.out.print("¿Otro valor (s/n)? ");
            continuar = scanner.next().charAt(0);
        } while (continuar == 's' || continuar == 'S');

        System.out.println("¡Hasta luego!");
    }
}
