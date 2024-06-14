import java.util.Scanner;

public class PalabraMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una palabra: ");
        String palabra = scanner.nextLine();

        char[] letras = palabra.toCharArray();
        char[][] matriz = new char[letras.length][1];

        for (int i = 0; i < letras.length; i++) {
            matriz[i][0] = letras[i];
        }

        boolean hayRepetidos = false;
        for (int i = 0; i < letras.length; i++) {
            for (int j = i + 1; j < letras.length; j++) {
                if (matriz[i][0] == matriz[j][0]) {
                    hayRepetidos = true;
                    break;
                }
            }
            if (hayRepetidos) {
                break;
            }
        }

        if (hayRepetidos) {
            System.out.println("Hay valores repetidos en la matriz.");
        } else {
            System.out.println("No hay valores repetidos en la matriz.");
        }

        System.out.println("Matriz:");
        for (int i = 0; i < letras.length; i++) {
            System.out.print(matriz[i][0] + " ");
        }
        System.out.println();
    }
}
