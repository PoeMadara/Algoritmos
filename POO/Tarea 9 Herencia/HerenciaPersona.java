public class HerenciaPersona {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Carlos", "Perez", 30);
        Persona persona2 = new Persona("Ana", "Garcia");
        Persona persona3 = new Persona("Luis", "Martinez", 25);
        Persona persona4 = new Persona();

        persona1.imprimirDatos();
        persona2.imprimirDatos();
        persona3.imprimirDatos();
        persona4.imprimirDatos();

        Empleado empleado1 = new Empleado("Miguel", "Sanchez", 40, 2000, 300);
        Empleado empleado2 = new Empleado("Maria", "Lopez", 35, 1500, 200);
        Empleado empleado3 = new Empleado("Jorge", "Gonzalez", 35, 2500, 500);
        Empleado empleado4 = new Empleado("Sofia", "Diaz", 30, 1800, 150);
        Empleado empleado5 = new Empleado("Laura", "Hernandez", 28, 2200, 400);

        empleado1.imprimirDatos();
        empleado1.imprimirSueldo();
        empleado1.imprimirComision();
        System.out.println("Total cobrado: " + empleado1.calcularTotalCobrado());

        empleado2.imprimirDatos();
        empleado2.imprimirSueldo();
        empleado2.imprimirComision();
        System.out.println("Total cobrado: " + empleado2.calcularTotalCobrado());

        empleado3.imprimirDatos();
        empleado3.imprimirSueldo();
        empleado3.imprimirComision();
        System.out.println("Total cobrado: " + empleado3.calcularTotalCobrado());

        empleado4.imprimirDatos();
        empleado4.imprimirSueldo();
        empleado4.imprimirComision();
        System.out.println("Total cobrado: " + empleado4.calcularTotalCobrado());

        empleado5.imprimirDatos();
        empleado5.imprimirSueldo();
        empleado5.imprimirComision();
        System.out.println("Total cobrado: " + empleado5.calcularTotalCobrado());
    }
}

class Persona {
    private String nombre;
    private String apellidos;
    private int edad;

    // Constructores
    public Persona() {
        this.nombre = "";
        this.apellidos = "";
        this.edad = 20;
    }

    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = 20;
    }

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Edad: " + edad);
    }
}

class Empleado extends Persona {
    private double sueldo;
    private double comision;

    public Empleado() {
        super();
        this.sueldo = 0;
        this.comision = 0;
    }

    public Empleado(String nombre, String apellidos, double sueldo) {
        super(nombre, apellidos, 1); // Inicializar con una edad válida
        if (sueldo > 0) {
            this.sueldo = sueldo;
        } else {
            this.sueldo = 0;
        }
        this.comision = 0;
    }

    public Empleado(String nombre, String apellidos, int edad, double sueldo, double comision) {
        super(nombre, apellidos, edad);
        if (sueldo > 0) {
            this.sueldo = sueldo;
        } else {
            this.sueldo = 0;
        }
        if (comision > 0) {
            this.comision = comision;
        } else {
            this.comision = 0;
        }
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        if (sueldo > 0) {
            this.sueldo = sueldo;
        } else {
            this.sueldo = 0;
        }
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        if (comision > 0) {
            this.comision = comision;
        } else {
            this.comision = 0;
        }
    }

    public void imprimirSueldo() {
        System.out.println("Sueldo: " + sueldo);
    }

    public void imprimirComision() {
        System.out.println("Comisión: " + comision);
    }

    public double calcularTotalCobrado() {
        return sueldo + comision;
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        imprimirSueldo();
        imprimirComision();
    }
}
