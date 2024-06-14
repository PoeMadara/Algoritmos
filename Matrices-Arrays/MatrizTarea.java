public class MatrizTarea {
    public static void main(String[] args) {
        int[][] numeros = {
            {3, 4, 5, 78},
            {0, 0, 0, 0},
            {1, 1, 1, 1},
            {6, 6, 6, -1}
        };

        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if (numeros[i][j] > mayor) {
                    mayor = numeros[i][j];
                }
                if (numeros[i][j] < menor) {
                    menor = numeros[i][j];
                }
            }
        }

        System.out.println("El mayor valor de la matriz es: " + mayor);
        System.out.println("El menor valor de la matriz es: " + menor);


        System.out.print("Valores de la primera fila: ");
        for (int j = 0; j < numeros[0].length; j++) {
            System.out.print(numeros[0][j] + " ");
        }
        System.out.println();

        System.out.print("Valores de la última fila: ");
        for (int j = 0; j < numeros[numeros.length - 1].length; j++) {
            System.out.print(numeros[numeros.length - 1][j] + " ");
        }
        System.out.println();
    }
}
