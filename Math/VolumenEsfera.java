import java.util.Scanner;

public class VolumenEsfera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio de la esfera: ");

        double radio = scanner.nextDouble();

        double volumen = calcularVolumenEsfera(radio);

        System.out.println("El volumen de la esfera con radio " + radio + " es: " + volumen);

        scanner.close();
    }

    private static double calcularVolumenEsfera(double radio) {
        //La fórmula: V = (4/3) * PI * r^3
        double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
        return volumen;
    }
}
