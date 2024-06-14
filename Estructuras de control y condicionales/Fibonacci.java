//Calcular los n, los 10 primeros números de la serie de fibonnaci.

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int a = 0, b = 1;

        System.out.println("Los 10 primeros números de la secuencia de Fibonacci son:");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }
    }
}