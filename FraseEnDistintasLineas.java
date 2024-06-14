import java.util.Scanner;

public class FraseEnDistintasLineas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Introduce una frase y será dividida por palabras en distintas líneas:");

        String frase = scanner.nextLine();
        String[] palabras = frase.split(" ");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
        scanner.close();
    }
}