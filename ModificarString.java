import java.util.Scanner;

public class ModificarString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una cadena de texto:");
        String inputString = scanner.nextLine();

        imprimirPrimeraMitad(inputString);

        imprimirUltimoCaracter(inputString);

        imprimirInversa(inputString);

        imprimirConGuion(inputString);

        imprimirCantidadVocales(inputString);

        verificarPalindromo(inputString);

        scanner.close();
    }

    private static void imprimirPrimeraMitad(String str) {
        int longitud = str.length();
        int mitad = longitud / 2;
        System.out.println("a) Primera mitad de los caracteres: " + str.substring(0, mitad));
    }

    private static void imprimirUltimoCaracter(String str) {
        System.out.println("b) Último carácter: " + str.charAt(str.length() - 1));
    }

    private static void imprimirInversa(String str) {
        StringBuilder inversa = new StringBuilder(str).reverse();
        System.out.println("c) Cadena en forma inversa: " + inversa.toString());
    }

    private static void imprimirConGuion(String str) {
        System.out.print("d) Cada carácter separado con guión: ");
        for (char c : str.toCharArray()) {
            System.out.print(c + "-");
        }
        System.out.println();
    }

    private static void imprimirCantidadVocales(String str) {
        int contadorVocales = 0;
        for (char c : str.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                contadorVocales++;
            }
        }
        System.out.println("e) Cantidad de vocales: " + contadorVocales);
    }

    private static void verificarPalindromo(String str) {
        String strInversa = new StringBuilder(str).reverse().toString();
        boolean esPalindromo = str.equalsIgnoreCase(strInversa);
        System.out.println("f) La cadena es un palíndromo: " + esPalindromo);
    }
}
