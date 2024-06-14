public class PlantaMain {
    public static void main(String[] args) {
        Planta planta = new PlantaInterior("Cactus", "Arcilloso");
        System.out.println("Nombre: " + planta.getNombre());
        System.out.println("Tipo de suelo: " + planta.getTipoSuelo());
        planta.sistemaRiego("interior");

        planta = new PlantaExterior("Rosa", "Arenoso");
        System.out.println("\nNombre: " + planta.getNombre());
        System.out.println("Tipo de suelo: " + planta.getTipoSuelo());
        planta.sistemaRiego("exterior");

        planta = new PlantaFrutal("Manzano", "Fértil");
        System.out.println("\nNombre: " + planta.getNombre());
        System.out.println("Tipo de suelo: " + planta.getTipoSuelo());
        planta.sistemaRiego("frutal");
    }

    abstract static class Planta {
        private String nombre;
        private String tipoSuelo;

        public Planta(String nombre, String tipoSuelo) {
            this.nombre = nombre;
            this.tipoSuelo = tipoSuelo;
        }

        public abstract void sistemaRiego(String tipoPlanta);

        public String getNombre() {
            return nombre;
        }

        public String getTipoSuelo() {
            return tipoSuelo;
        }
    }

    static class PlantaInterior extends Planta {
        public PlantaInterior(String nombre, String tipoSuelo) {
            super(nombre, tipoSuelo);
        }

        @Override
        public void sistemaRiego(String tipoPlanta) {
            System.out.println("Sistema de riego para planta " + tipoPlanta + ": Goteo");
        }
    }

    static class PlantaExterior extends Planta {
        public PlantaExterior(String nombre, String tipoSuelo) {
            super(nombre, tipoSuelo);
        }

        @Override
        public void sistemaRiego(String tipoPlanta) {
            System.out.println("Sistema de riego para planta " + tipoPlanta + ": Permanente");
        }
    }

    static class PlantaFrutal extends Planta {
        public PlantaFrutal(String nombre, String tipoSuelo) {
            super(nombre, tipoSuelo);
        }

        @Override
        public void sistemaRiego(String tipoPlanta) {
            System.out.println("Sistema de riego para planta " + tipoPlanta + ": Goteo");
        }
    }
}
