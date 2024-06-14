import java.util.Scanner;

public class EjercicioString {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Introduce un grupo de dos a a tres palabras: ");
            String cadena = scanner.nextLine();

            imprimirPrimeraMitad(cadena);
            imprimirUltimoCaracter(cadena);
            imprimirInversa(cadena);
            imprimirConGuiones(cadena);
            imprimirCantidadVocales(cadena);
            verificarPalindromo(cadena);
        }
    }

    public static void imprimirPrimeraMitad(String cadena) {
        int mitad = cadena.length() / 2;
        System.out.println("Primera mitad de la cadena: " + cadena.substring(0, mitad));
    }

    public static void imprimirUltimoCaracter(String cadena) {
        System.out.println("Último carácter de la cadena: " + cadena.charAt(cadena.length() - 1));
    }

    public static void imprimirInversa(String cadena) {
        System.out.println("Cadena invertida: " + new StringBuilder(cadena).reverse());
    }

    public static void imprimirConGuiones(String cadena) {
        System.out.println("Cada carácter del String separado por un guión: " + String.join("-", cadena.split("")));
    }

    public static void imprimirCantidadVocales(String cadena) {
        long cantidadVocales = cadena.toLowerCase().chars().filter(c -> "aeiou".indexOf(c) != -1).count();
        System.out.println("Cantidad de vocales en la cadena: " + cantidadVocales);
    }

    public static void verificarPalindromo(String cadena) {
        String cadenaInvertida = new StringBuilder(cadena).reverse().toString();
        String mensaje = cadena.equalsIgnoreCase(cadenaInvertida) ? "La cadena es un palíndromo." : "La cadena no es un palíndromo.";
        System.out.println(mensaje);
    }
}