import java.util.Scanner;

public class NumerosAleatoriosEntreEllos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();
        
        int numeroAleatorio = (int) (Math.random() * (num2 - num1 + 1)) + num1;
        
        System.out.println("Número aleatorio entre " + num1 + " y " + num2 + ": " + numeroAleatorio);
        scanner.close();
    }
}
