import java.util.Scanner;

public class EjercicioExcepciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Introduce el primer número (mayor que 100): ");
            int num1 = scanner.nextInt();

            if (num1 <= 0) {
                throw new IllegalArgumentException("El primer número no puede ser cero o menor que cero.");
            }
            if (num1 <= 100) {
                throw new IllegalArgumentException("El primer número debe ser mayor que 100.");
            }

            System.out.print("Introduce el segundo número (diferente de cero): ");
            int num2 = scanner.nextInt();

            if (num2 == 0) {
                throw new ArithmeticException("El segundo número no puede ser cero.");
            }

            double result = divide(num1, num2);
            System.out.println("El resultado de la división es: " + result);
        } catch (IllegalArgumentException | ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static double divide(int a, int b) {
        return (double) a / b;
    }
}
