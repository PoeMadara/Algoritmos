public class ArrayCaracteresNumeros {
    public static void main(String[] args) {

        char[] letras = {'a', 'e', 'r', 't', 'y', 'u'};

        int[] numeros = {1, 2, 3, 4, 5, 6};

        int tamanoTercerArray = letras.length + numeros.length;

        int[] tercerArray = new int[tamanoTercerArray];

        System.out.println("Tercer array:");
        for (int i = 0; i < tamanoTercerArray; i++) {
            tercerArray[i] = i;
            System.out.print(tercerArray[i] + " ");
        }
    }
}
