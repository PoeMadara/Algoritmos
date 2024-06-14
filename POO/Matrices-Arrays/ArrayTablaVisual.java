import java.util.Scanner;

public class ArrayTablaVisual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el número de celdas: ");
        int numCeldas = scanner.nextInt();

        int[] arrayNumeros = new int[numCeldas];

        for (int i = 0; i < numCeldas; i++) {
            arrayNumeros[i] = i + 1;
        }

        System.out.println("Tabla visual:");
        System.out.print("+");
        for (int i = 0; i < numCeldas; i++) {
            System.out.print("---+");
        }
        System.out.println();

        for (int i = 0; i < numCeldas; i++) {
            System.out.print("| " + arrayNumeros[i] + " ");
        }
        System.out.println("|");

        System.out.print("+");
        for (int i = 0; i < numCeldas; i++) {
            System.out.print("---+");
        }
        System.out.println();
    }
}
