import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Persona {
    protected String nombre;
    protected int edad;
    protected char sexo;

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
}

class Estudiante extends Persona {
    private double calificacion;
    private boolean haceNovillos;

    public Estudiante(String nombre, int edad, char sexo, double calificacion) {
        super(nombre, edad, sexo);
        this.calificacion = calificacion;
        this.haceNovillos = new Random().nextBoolean();
    }

    public boolean isDisponible() {
        return !haceNovillos;
    }

    public double getCalificacion() {
        return calificacion;
    }
}

class Profesor extends Persona {
    private String materia;
    private boolean disponible;

    public Profesor(String nombre, int edad, char sexo, String materia) {
        super(nombre, edad, sexo);
        this.materia = materia;
        this.disponible = new Random().nextInt(100) >= 20;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public String getMateria() {
        return materia;
    }
}

class Aula {
    private int id;
    private int maxEstudiantes;
    private String materia;
    private Profesor profesor;
    private List<Estudiante> estudiantes;

    public Aula(int id, int maxEstudiantes, String materia, Profesor profesor) {
        this.id = id;
        this.maxEstudiantes = maxEstudiantes;
        this.materia = materia;
        this.profesor = profesor;
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        if (estudiantes.size() < maxEstudiantes) {
            estudiantes.add(estudiante);
        }
    }

    public boolean puedeDarseClase() {
        if (!profesor.isDisponible() || !profesor.getMateria().equals(materia)) {
            return false;
        }

        long estudiantesPresentes = estudiantes.stream().filter(Estudiante::isDisponible).count();
        return estudiantesPresentes > maxEstudiantes / 2;
    }

    public void mostrarResultados() {
        if (puedeDarseClase()) {
            long alumnosAprobados = estudiantes.stream()
                    .filter(est -> est.isDisponible() && est.getCalificacion() >= 5 && est.sexo == 'M')
                    .count();

            long alumnasAprobadas = estudiantes.stream()
                    .filter(est -> est.isDisponible() && est.getCalificacion() >= 5 && est.sexo == 'F')
                    .count();

            System.out.println("La clase puede darse.");
            System.out.println("Alumnos aprobados: " + alumnosAprobados);
            System.out.println("Alumnas aprobadas: " + alumnasAprobadas);
        } else {
            System.out.println("La clase no puede darse.");
        }
    }
}

public class EjercicioPOO {
    public static void main(String[] args) {
        Random random = new Random();
        String[] nombres = {"Carlos", "Ana", "Pedro", "Laura", "Juan", "Marta"};
        String[] materias = {"Matemáticas", "Filosofía", "Física"};

        Profesor profesor = new Profesor(nombres[random.nextInt(nombres.length)], random.nextInt(15) + 30, random.nextBoolean() ? 'M' : 'F', "Matemáticas");
        Aula aula = new Aula(1, 10, "Matemáticas", profesor);

        for (int i = 0; i < 10; i++) {
            Estudiante estudiante = new Estudiante(
                    nombres[random.nextInt(nombres.length)],
                    random.nextInt(8) + 12,
                    random.nextBoolean() ? 'M' : 'F',
                    random.nextDouble() * 10
            );
            aula.agregarEstudiante(estudiante);
        }

        aula.mostrarResultados();
    }
}