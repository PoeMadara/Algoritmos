import java.util.Scanner;

public class ArrayDeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de posiciones para el primer array: ");
        int numPosiciones1 = scanner.nextInt();

        int[] array1 = new int[numPosiciones1];

        for (int i = 0; i < numPosiciones1; i++) {
            System.out.print("Ingrese el valor para la posición " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }

        System.out.print("Ingrese el número de posiciones para el segundo array: ");
        int numPosiciones2 = scanner.nextInt();

        int[] array2 = new int[numPosiciones2];

        for (int i = 0; i < numPosiciones2; i++) {
            System.out.print("Ingrese el valor para la posición " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }

        int[] array3 = new int[numPosiciones1 + numPosiciones2];
        System.arraycopy(array1, 0, array3, 0, numPosiciones1);
        System.arraycopy(array2, 0, array3, numPosiciones1, numPosiciones2);

        System.out.println("Tercer array (combinación de los dos arrays anteriores):");
        for (int i = 0; i < array3.length; i++) {
            System.out.println("Número en la posición " + i + ": " + array3[i]);
        }
    }
}
