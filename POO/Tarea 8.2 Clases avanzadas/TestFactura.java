public class TestFactura {
    public static void main(String[] args) {
        Factura factura = new FacturaProducto(1001, 100.0, "Producto 1");
        factura.mostrarDatos();

        System.out.println("\nModificando importe...");
        factura.setImporte(150.0);
        factura.mostrarDatos();
    }

    abstract static class Factura {
        private int nFactura;
        private double importe;
        private double iva;
        private String detalle;
        private double totalFinal;

        public Factura(int nFactura, double importe, String detalle) {
            this.nFactura = nFactura;
            this.importe = importe;
            this.detalle = detalle;
            this.iva = calcularIva();
            this.totalFinal = totalFinal();
        }

        public int getNFactura() {
            return nFactura;
        }

        public void setNFactura(int nFactura) {
            this.nFactura = nFactura;
        }

        public double getImporte() {
            return importe;
        }

        public void setImporte(double importe) {
            this.importe = importe;
            this.iva = calcularIva();
            this.totalFinal = totalFinal();
        }

        public double getIva() {
            return iva;
        }

        public String getDetalle() {
            return detalle;
        }

        public void setDetalle(String detalle) {
            this.detalle = detalle;
        }

        public double getTotalFinal() {
            return totalFinal;
        }

        public void mostrarDatos() {
            System.out.println("Número de Factura: " + nFactura);
            System.out.println("Importe: " + importe);
            System.out.println("IVA: " + iva);
            System.out.println("Detalle: " + detalle);
            System.out.println("Total Final: " + totalFinal);
        }

        public double calcularIva() {
            return importe * 0.21;
        }

        public double totalFinal() {
            return importe + iva;
        }
    }

    static class FacturaProducto extends Factura {
        public FacturaProducto(int nFactura, double importe, String detalle) {
            super(nFactura, importe, detalle);
        }
    }
}
