/*Diseña un arrayList con los siguientes datos:
• Sofía • Chema • Alex • Rosa
Consideraciones:
Mostrar con la propiedad pertinente el tamaño del arraylist. • Buscar el valor de Juan, con el método en cuestión para ver si lo contiene.
Mostrar el mensaje si lo contiene o no, según proceda • Borra el ultimo element del arraylist */

import java.util.ArrayList;

public class ArrayListBuscarNombre {

    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Sofía");
        nombres.add("Chema");
        nombres.add("Alex");
        nombres.add("Rosa");

        System.out.println("Tamaño del ArrayList: " + nombres.size());

        if (nombres.contains("Juan")) {
            System.out.println("El nombre Juan está en el ArrayList");
        } else {
            System.out.println("El nombre Juan no está en el ArrayList");
        }

        nombres.remove(nombres.size() - 1);

        System.out.println("Nuevo tamaño del ArrayList: " + nombres.size());
    }
}
