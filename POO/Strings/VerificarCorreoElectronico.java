import java.util.Scanner;

public class VerificarCorreoElectronico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingrese una dirección de correo electrónico que cumpla con las siguientes condiciones:");
        System.out.println("1) Que contenga la @");
        System.out.println("2) Que no se teclee más de 1 @");
        System.out.println("3) Que aparezca un punto después de la @ en el dominio del correo electrónico");
        System.out.println("4) Que la longitud mínima sea de 20 caracteres");
        System.out.println("5) Que los textos aparezcan en minúsculas");
        
        System.out.println("Ingrese su dirección de correo electrónico:");
        String correoElectronico = scanner.nextLine();

        if (verificarArroba(correoElectronico) &&
            verificarUnicaArroba(correoElectronico) &&
            verificarPuntoDespuesArroba(correoElectronico) &&
            verificarLongitudMinima(correoElectronico) &&
            verificarMinusculas(correoElectronico)) {
            System.out.println("La dirección de correo electrónico es válida.");
        } else {
            System.out.println("La dirección de correo electrónico no es válida.");
        }
    }
    private static boolean verificarArroba(String correo) {
        return correo.contains("@");
    }
    private static boolean verificarUnicaArroba(String correo) {
        return correo.indexOf("@") == correo.lastIndexOf("@");
    }
    private static boolean verificarPuntoDespuesArroba(String correo) {
        int indiceArroba = correo.indexOf("@");
        return correo.substring(indiceArroba).contains(".");
    }
    private static boolean verificarLongitudMinima(String correo) {
        return correo.length() >= 20;
    }
    private static boolean verificarMinusculas(String correo) {
        return correo.equals(correo.toLowerCase());
    }
}
