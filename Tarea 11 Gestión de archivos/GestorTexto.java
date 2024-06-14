import java.io.FileReader;
import java.io.IOException;

public class GestorTexto {
    public static void main(String[] args) {

        String nombreArchivo = "texto.txt";

        try (FileReader lector = new FileReader(nombreArchivo)) {
            int caracter;
            StringBuilder contenidoSinEspacios = new StringBuilder();
            while ((caracter = lector.read()) != -1) {
                if (caracter != ' ') {
                    contenidoSinEspacios.append((char) caracter);
                }
            }
            System.out.println(contenidoSinEspacios.toString());
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
