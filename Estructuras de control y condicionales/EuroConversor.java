//Se pide por pantalla un importe en euros y se calcula la conversión en libras o euros.

//Hecho por Carlos Vergara Gámez

import java.util.Scanner;

public class EuroConversor {

    public static void main(String args[]) {
        
        double euros, libras;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de euros que quieres convertir en libras:");
        euros = teclado.nextDouble();
        libras = euros * 0.86;
       
        System.out.println(euros + " euros son: " + libras + " libras.");
        teclado.close();
    }
}

