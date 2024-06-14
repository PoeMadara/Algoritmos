import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu contraseña:");
        String password = scanner.nextLine();
        scanner.close();

        if (!password.isEmpty() && password.length() <= 25 && password.matches("[^@.$#&/]*")) {
            password = password.substring(0, 1).toUpperCase() + password.substring(1, password.length() - 1) + password.substring(password.length() - 1).toUpperCase();
            System.out.println("La contraseña es válida: " + password);
        } else {
            System.out.println("La contraseña no es válida.");
        }
    }
}
