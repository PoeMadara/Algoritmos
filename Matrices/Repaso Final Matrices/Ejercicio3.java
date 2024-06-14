import java.util.Scanner;

public class Ejercicio3 {
    private int[][] matriz;
    private boolean estaRellena;

    public Ejercicio3() {
        matriz = new int[4][4];
        estaRellena = false;
    }

    public void rellenarMatriz() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Introduce el valor para la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        estaRellena = true;
    }

    public int sumarFila(int fila) {
        if (!estaRellena) {
            System.out.println("Debes rellenar la matriz primero.");
            return 0;
        }
        if (fila < 0 || fila > 3) {
            System.out.println("La fila especificada no existe.");
            return 0;
        }
        int suma = 0;
        for (int i = 0; i < 4; i++) {
            suma += matriz[fila][i];
        }
        return suma;
    }

    public int sumarColumna(int columna) {
        if (!estaRellena) {
            System.out.println("Debes rellenar la matriz primero.");
            return 0;
        }
        if (columna < 0 || columna > 3) {
            System.out.println("La columna especificada no existe.");
            return 0;
        }
        int suma = 0;
        for (int i = 0; i < 4; i++) {
            suma += matriz[i][columna];
        }
        return suma;
    }

    public int sumarDiagonalPrincipal() {
        if (!estaRellena) {
            System.out.println("Debes rellenar la matriz primero.");
            return 0;
        }
        int suma = 0;
        for (int i = 0; i < 4; i++) {
            suma += matriz[i][i];
        }
        return suma;
    }

    public int sumarDiagonalSecundaria() {
        if (!estaRellena) {
            System.out.println("Debes rellenar la matriz primero.");
            return 0;
        }
        int suma = 0;
        for (int i = 0; i < 4; i++) {
            suma += matriz[i][3 - i];
        }
        return suma;
    }

    public double calcularMedia() {
        if (!estaRellena) {
            System.out.println("Debes rellenar la matriz primero.");
            return 0;
        }
        int suma = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                suma += matriz[i][j];
            }
        }
        return (double) suma / 16;
    }

    public static void main(String[] args) {
        Ejercicio3 m = new Ejercicio3();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        while (!salir) {
            System.out.println("1. Rellenar matriz");
            System.out.println("2. Sumar fila");
            System.out.println("3. Sumar columna");
            System.out.println("4. Sumar diagonal principal");
            System.out.println("5. Sumar diagonal secundaria");
            System.out.println("6. Calcular media");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    m.rellenarMatriz();
                    break;
                case 2:
                    System.out.print("Introduce el número de fila a sumar: ");
                    int fila = scanner.nextInt();
                    System.out.println("La suma de la fila es " + m.sumarFila(fila));
                    break;
                case 3:
                    System.out.print("Introduce el número de columna a sumar: ");
                    int columna = scanner.nextInt();
                    System.out.println("La suma de la columna es " + m.sumarColumna(columna));
                    break;
                case 4:
                    System.out.println("La suma de la diagonal principal es " + m.sumarDiagonalPrincipal());
                    break;
                case 5:
                    System.out.println("La suma de la diagonal secundaria es " + m.sumarDiagonalSecundaria());
                    break;
                case 6:
                    System.out.println("La media de todos los números de la matriz es " + m.calcularMedia());
                    break;
                case 7:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
        scanner.close();
    }
}
