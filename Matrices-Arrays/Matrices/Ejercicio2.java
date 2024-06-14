import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el tamaño de las matrices (n): ");
        int n = scanner.nextInt();

        int[][] matriz1 = new int[n][n];
        int[][] matriz2 = new int[n][n];
        int[][] resultado = new int[n][n];

        System.out.println("Introduce los valores para la matriz 1:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Introduce los valores para la matriz 2:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz2[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("Matriz 1:");
        imprimirMatriz(matriz1);
        System.out.println("Matriz 2:");
        imprimirMatriz(matriz2);

        System.out.println("Matriz resultante:");
        imprimirMatriz(resultado);
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
