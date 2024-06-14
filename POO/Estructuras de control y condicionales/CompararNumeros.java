//Se piden por pantalla tres números. Hay que comparar cual es el menor de los tres y el mayor

import java.util.Scanner;

public class CompararNumeros {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Escribe un número");
        double num1 = teclado.nextDouble();

        System.out.println("Escribe el segundo número");
        double num2 = teclado.nextDouble();

        System.out.println("Escribe el tercer número");
        double num3 = teclado.nextDouble();

        double menor = num1;
        if (num2 < menor){
            menor = num2;
        }
        if (num3 < menor){
            menor = num3;
        }

        double mayor = num1;
        if (num2 > mayor){
            mayor = num2;
        }
        if (num3 > mayor){
            mayor = num3;
        }

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
        
        teclado.close();
    }
}