public class Empleado {
    private String nombre;

    public Empleado() {
    }

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empleado " + nombre;
    }
}

class Gerente extends Empleado {
    public Gerente(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Gerente " + super.toString();
    }
}

class Supervisor extends Empleado {
    public Supervisor(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Supervisor " + super.toString();
    }
}

class Trabajador extends Empleado {
    public Trabajador(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Trabajador " + super.toString();
    }
}

class Polimorfismo {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Carlos");
        System.out.println(empleado);

        Gerente gerente = new Gerente("Juan");
        System.out.println(gerente);

        Supervisor supervisor = new Supervisor("Pedro");
        System.out.println(supervisor);

        Trabajador trabajador = new Trabajador("Ana");
        System.out.println(trabajador);
    }
}
