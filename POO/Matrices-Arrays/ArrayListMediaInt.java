// Crear un arraylist con 5 valores de tipo integer. Calcular la media de todos los valores. Visualizar todos los valores y la media.

import java.util.ArrayList;

public class ArrayListMediaInT {

    public static void main(String[] args) {

        ArrayList<Integer> valores = new ArrayList<>();

        valores.add(10);
        valores.add(20);
        valores.add(30);
        valores.add(40);
        valores.add(50);

        int suma = 0;
        for (int valor : valores) {
            suma += valor;
        }
        double media = (double) suma / valores.size();

        System.out.println("Valores del ArrayList:");
        for (int valor : valores) {
            System.out.println(valor);
        }
        System.out.println("Media de los valores: " + media);
    }
}
