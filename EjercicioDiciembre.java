package com.mycompany.condicionales;

 

import java.util.Scanner;

 

//importamos la libreria más completa de java
import java.util.*;

 

 

public class Condicionales {

 

    public static void main(String[] args) {
     
//adivina un número del 1-5
//numerooculto=4

 

 

 

//pedimos por pantalla
System.out.println("Introduce número a adivinar");
Scanner datosp=new Scanner(System.in);

 

//Cogemos el dato que teclea el usuario
int numero1=datosp.nextInt();

 

 

System.out.println("Introduce segundo número a adivinar");
int numero2;
numero2=datosp.nextInt();

 

 

System.out.println("Introduce tu nombre");
String nombre;

 

nombre=datosp.next();

 

 

/*
Primera forma:comprobar que el usuario teclea los números hasta que acierta
*/

 

if(numero1==1)
{
System.out.println("No has acertado");
}
else if(numero1==2)
    {
    System.out.println("No has acertado");
    }
   else if(numero1==3)
        {
        System.out.println("No has acertado");
        }
        else if(numero1==4)
        {
        System.out.println("Has acertado");
        }
        else
        {
        System.out.println("No ha acertado");
        }

 

/*
Segunta posibilidad
*/

 

if(numero1==4)
{
  System.out.println("Has acertado");  
}
else
{
   System.out.println("No has acertado");
}