import java.util.Scanner;

public class CalculadoraApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    double[] numeros = pedirNumeros(scanner);
                    System.out.println("Resultado de la suma: " + sumar(numeros[0], numeros[1]));
                    break;
                case 2:
                    numeros = pedirNumeros(scanner);
                    System.out.println("Resultado de la resta: " + restar(numeros[0], numeros[1]));
                    break;
                case 3:
                    numeros = pedirNumeros(scanner);
                    System.out.println("Resultado de la multiplicación: " + multiplicar(numeros[0], numeros[1]));
                    break;
                case 4:
                    numeros = pedirNumeros(scanner);
                    if (numeros[1] != 0) {
                        System.out.println("Resultado de la división: " + dividir(numeros[0], numeros[1]));
                    } else {
                        System.out.println("Error: No se puede dividir por cero.");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println("Menú Calculadora:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public static double[] pedirNumeros(Scanner scanner) {
        double[] numeros = new double[2];
        System.out.print("Introduzca el primer número: ");
        numeros[0] = scanner.nextDouble();
        System.out.print("Introduzca el segundo número: ");
        numeros[1] = scanner.nextDouble();
        return numeros;
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }
}