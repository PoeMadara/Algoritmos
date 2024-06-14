// Diseña un programa en Java que crea un arraylist, que contiene los nombres de 4 personas. Mostrar los datos del array al completo

import java.util.ArrayList;

public class ArrayListNombres {

    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Ana");
        nombres.add("Pedro");
        nombres.add("María");
        nombres.add("Juan");

        System.out.println("Tamaño del ArrayList: " + nombres.size());

        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
