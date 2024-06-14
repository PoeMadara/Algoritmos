import java.util.Random;

public class VectorApp {

    public static void main(String[] args) {
        int[] vector = new int[10];
        llenarVector(vector);
        System.out.println("Vector al derecho:");
        mostrarVector(vector);
        System.out.println("Vector al revés:");
        mostrarVectorReves(vector);
    }

    public static void llenarVector(int[] vector) {
        Random random = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(10) + 1;
        }
    }

    public static void mostrarVector(int[] vector) {
        for (int i : vector) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void mostrarVectorReves(int[] vector) {
        for (int i = vector.length - 1; i >= 0; i--) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }
}