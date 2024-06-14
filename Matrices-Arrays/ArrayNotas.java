import java.util.Scanner;

public class ArrayNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] calificaciones = new double[6];

        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Introduce la calificación de la asignatura " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextDouble();
        }

        double sumaCalificaciones = 0;
        for (double calificacion : calificaciones) {
            sumaCalificaciones += calificacion;
        }
        double media = sumaCalificaciones / calificaciones.length;

        String calificacionFinal;
        if (media >= 9) {
            calificacionFinal = "sobresaliente";
        } else if (media >= 8.5) {
            calificacionFinal = "notable";
        } else if (media >= 6.5) {
            calificacionFinal = "bien";
        } else if (media >= 5) {
            calificacionFinal = "aprobado";
        } else {
            calificacionFinal = "suspenso";
        }
        scanner.close();

        System.out.println("La calificación final es: " + calificacionFinal);
    }
}
