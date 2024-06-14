/*1. Se pide por pantalla, utilizando el objeto Scanner:
-Nombre:
-Apellidos:
Aparece impreso en el documento:
"Buenos días nombre apellidos"
Nota: Usar el objeto Scanner*/

//Ejercicio hecho por Carlos Vergara Gámez

import java.util.Scanner;

public class BuenosDias {

public static void main(String[] args) {

String nombre, apellidos;
Scanner teclado = new Scanner(System.in);
System.out.println("Nombre:"); nombre = teclado.nextLine();
System.out.println("Apellidos:"); apellidos = teclado.nextLine();
System.out.println("Buenos días, " + nombre + " " + apellidos);
teclado.close();   
}

}