import java.util.ArrayList;
import java.util.List;

public class HerenciaVehiculo {
    public static void main(String[] args) {

        Vehiculo vehiculo1 = new Vehiculo("1234ABC", "Toyota", "Corolla", "Rojo", 4, 120);
        Vehiculo vehiculo2 = new Vehiculo("5678DEF", "Honda", "Civic", "Azul", 4, 140);
        Turismo turismo1 = new Turismo("9101GHI", "Ford", "Fiesta", "Verde", 4, 100, 5);
        Deportivo deportivo1 = new Deportivo("1213JKL", "Ferrari", "F8", "Negro", 2, 710, true);

        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(vehiculo1);
        vehiculos.add(vehiculo2);
        vehiculos.add(turismo1);
        vehiculos.add(deportivo1);

        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.mostrarDatos();
            System.out.println();
        }
    }
}

class Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private int numeroPuertas;
    private int potencia;

    public Vehiculo(String matricula, String marca, String modelo, String color, int numeroPuertas, int potencia) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.numeroPuertas = numeroPuertas;
        this.potencia = potencia;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void mostrarDatos() {
        System.out.println("Matrícula: " + matricula);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Número de puertas: " + numeroPuertas);
        System.out.println("Potencia: " + potencia + " CV");
    }
}

class Turismo extends Vehiculo {
    private int numeroPlazas;

    public Turismo(String matricula, String marca, String modelo, String color, int numeroPuertas, int potencia, int numeroPlazas) {
        super(matricula, marca, modelo, color, numeroPuertas, potencia);
        this.numeroPlazas = numeroPlazas;
    }

    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Número de plazas: " + numeroPlazas);
    }
}

class Deportivo extends Vehiculo {
    private boolean descapotable;

    public Deportivo(String matricula, String marca, String modelo, String color, int numeroPuertas, int potencia, boolean descapotable) {
        super(matricula, marca, modelo, color, numeroPuertas, potencia);
        this.descapotable = descapotable;
    }

    public boolean isDescapotable() {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Descapotable: " + (descapotable ? "Sí" : "No"));
    }
}
