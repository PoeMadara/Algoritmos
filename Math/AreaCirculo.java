import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el radio del círculo: ");
        double radio = scanner.nextDouble();
        
        double area = Math.PI * Math.pow(radio, 2);
        
        double areaRedondeada = Math.round(area * 100.0) / 100.0;
        
        System.out.println("El área del círculo es: " + areaRedondeada);
    scanner.close();
    }
}
