import java.util.Scanner;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la cantidad de números aleatorios a generar: ");
        int cantidadNumeros = scanner.nextInt();
        
        for (int i = 0; i < cantidadNumeros; i++) {
            int numeroAleatorio = (int) (Math.random() * 10000);
            System.out.println("Número aleatorio " + (i + 1) + ": " + numeroAleatorio);
        }
        scanner.close();
    }
}