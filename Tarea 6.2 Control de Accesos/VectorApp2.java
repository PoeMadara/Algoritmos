import java.util.Random;

public class VectorApp2 {

    public static void main(String[] args) {
        int[] vectorA = new int[20];
        int[] vectorB = new int[20];
        int[] vectorC = new int[20];

        llenarVector(vectorA);
        llenarVector(vectorB);
        calcularVectorC(vectorA, vectorB, vectorC);

        System.out.println("Vector A:");
        mostrarVector(vectorA);
        System.out.println("Vector B:");
        mostrarVector(vectorB);
        System.out.println("Vector C (A + B):");
        mostrarVector(vectorC);
    }

    public static void llenarVector(int[] vector) {
        Random random = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(20) + 1;
        }
    }

    public static void calcularVectorC(int[] vectorA, int[] vectorB, int[] vectorC) {
        for (int i = 0; i < vectorA.length; i++) {
            vectorC[i] = vectorA[i] + vectorB[i];
        }
    }

    public static void mostrarVector(int[] vector) {
        for (int i : vector) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
