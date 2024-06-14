public class ArrayParesImpares {
    public static void main(String[] args) {

        int[] numerosDel1Al57 = new int[57];
        for (int i = 0; i < numerosDel1Al57.length; i++) {
            numerosDel1Al57[i] = i + 1;
        }

        int pares = 0;
        int impares = 0;
        for (int numero : numerosDel1Al57) {
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Número de celdas con números pares: " + pares);
        System.out.println("Número de celdas con números impares: " + impares);
    }
}
