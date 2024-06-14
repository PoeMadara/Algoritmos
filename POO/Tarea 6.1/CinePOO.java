import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Pelicula {
    String titulo;
    int duracion;
    int edadMinima;
    String director;

    public Pelicula(String titulo, int duracion, int edadMinima, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.director = director;
    }
}

class Espectador {
    String nombre;
    int edad;
    double dinero;

    public Espectador(String nombre, int edad, double dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }
}

class Asiento {
    int fila;
    char columna;
    boolean ocupado;

    public Asiento(int fila, char columna) {
        this.fila = fila;
        this.columna = columna;
        this.ocupado = false;
    }
}

class Cine {
    Pelicula pelicula;
    double precioEntrada;
    Asiento[][] asientos;

    public Cine(Pelicula pelicula, double precioEntrada) {
        this.pelicula = pelicula;
        this.precioEntrada = precioEntrada;
        this.asientos = new Asiento[8][9];
        inicializarAsientos();
    }

    private void inicializarAsientos() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 9; j++) {
                asientos[i][j] = new Asiento(8 - i, (char) ('A' + j));
            }
        }
    }

    public boolean puedeSentarse(Espectador espectador, int fila, char columna) {
        int filaIndex = 8 - fila;
        int columnaIndex = columna - 'A';
        if (filaIndex < 0 || filaIndex >= 8 || columnaIndex < 0 || columnaIndex >= 9) {
            return false;
        }
        if (asientos[filaIndex][columnaIndex].ocupado) {
            return false;
        }
        if (espectador.edad < pelicula.edadMinima) {
            return false;
        }
        if (espectador.dinero < precioEntrada) {
            return false;
        }
        return true;
    }

    public void sentarEspectador(Espectador espectador) {
        Random random = new Random();
        while (true) {
            int fila = random.nextInt(8) + 1;
            char columna = (char) ('A' + random.nextInt(9));
            if (puedeSentarse(espectador, fila, columna)) {
                int filaIndex = 8 - fila;
                int columnaIndex = columna - 'A';
                asientos[filaIndex][columnaIndex].ocupado = true;
                espectador.dinero -= precioEntrada;
                System.out.println("Espectador " + espectador.nombre + " se ha sentado en el asiento " + fila + columna);
                break;
            }
        }
    }

    public void mostrarAsientos() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(asientos[i][j].ocupado ? "[X]" : "[ ]");
            }
            System.out.println();
        }
    }
}

public class CinePOO {
    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula("Avengers", 120, 13, "Joss Whedon");
        Cine cine = new Cine(pelicula, 10.0);

        String[] nombres = {"Carlos", "Ana", "Pedro", "Laura", "Juan", "Marta", "Luis", "Lucia", "Jose", "Maria"};
        Random random = new Random();
        List<Espectador> espectadores = new ArrayList<>();
        for (String nombre : nombres) {
            Espectador espectador = new Espectador(nombre, random.nextInt(30) + 5, random.nextDouble() * 20);
            espectadores.add(espectador);
        }

        for (Espectador espectador : espectadores) {
            cine.sentarEspectador(espectador);
        }

        cine.mostrarAsientos();
    }
}
