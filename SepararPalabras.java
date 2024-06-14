import java.util.Scanner;

public class SepararPalabras {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Introduce un texto de varias palabras: ");
            String texto = scanner.nextLine();
            String[] palabras = texto.split(" ");
            
            for (String palabra : palabras) {
                System.out.println(palabra);
            }
        }
    }
}