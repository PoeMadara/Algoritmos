/*Se pide por pantalla dos números, la aplicación debe mostrar un mensaje con un mensaje del tipo:
"El numero: ... es mayor que el número ..."
 "El numero: ... es menor que el número ..." */

import java.util.Scanner;
public class CompararDosNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num1 = teclado.nextInt();
        System.out.println("Introduce otro numero");
        int num2 = teclado.nextInt();

        if (num1 > num2) {
            System.out.println("El numero: " + num1 + " es mayor que el numero: " + num2);
        } else {
            System.out.println("El numero: " + num2 + " es mayor que el numero: " + num1);
        }
        if (num1 < num2) {
            System.out.println("El numero: " + num1 + " es menor que el numero: " + num2);
        } else {
            System.out.println("El numero: " + num2 + " es menor que el numero: " + num1);
        
        }
        teclado.close();
    }
}
