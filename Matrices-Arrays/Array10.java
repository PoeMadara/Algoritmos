public class Array10 {
    
    public static void main(String[] args) {
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println("Número en la posición " + i + ": " + numeros[i]);
        }
    }
}
