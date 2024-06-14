import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListInteger {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce números enteros (termina con -99):");

        while (true) {
            int numero = scanner.nextInt();
            if (numero == -99) {
                break;
            }
            numeros.add(numero);
        }

        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }

        double media = (double) suma / numeros.size();

        int contadorMayoresQueMedia = 0;
        for (int numero : numeros) {
            if (numero > media) {
                contadorMayoresQueMedia++;
            }
        }

        System.out.println("Número de valores leídos: " + numeros.size());
        System.out.println("Suma de los valores: " + suma);
        System.out.println("Media de los valores: " + media);
        System.out.println("Valores mayores que la media: " + contadorMayoresQueMedia);
    }
}
