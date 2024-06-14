import java.util.Scanner;

public class CorreoValidoSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un correo electrónico (debe tener @ y un punto en el dominio para ser válido): ");

        String correo = scanner.nextLine();
        if (verificarCorreo(correo)) {
            System.out.println("La dirección de correo electrónico es válida.");
        } else {
            System.out.println("La dirección de correo electrónico no es válida.");
        }
    }

    private static boolean verificarCorreo(String correo) {
        return correo.contains("@") && correo.contains(".");
    }
}
