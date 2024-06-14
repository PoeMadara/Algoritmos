import java.util.Scanner;
public class GestionCalificacionesSinFunciones {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Ingrese el número de estudiantes: ");
int numEstudiantes = scanner.nextInt();
// Crear array para almacenar calificaciones
double[] calificaciones = new double[numEstudiantes];
// Ingreso de calificaciones
for (int i = 0; i < numEstudiantes; i++) {
System.out.print("Ingrese la calificación del estudiante " + (i + 1) + ": ");
calificaciones[i] = scanner.nextDouble();

}
// Mostrar promedio
double sumaCalificaciones = 0;
for (int i = 0; i < numEstudiantes; i++) {
sumaCalificaciones += calificaciones[i];
}
double promedio = sumaCalificaciones / numEstudiantes;
System.out.println("Promedio de calificaciones: " + promedio);
// Mostrar calificación mínima y máxima
double calificacionMinima = calificaciones[0];
double calificacionMaxima = calificaciones[0];
for (int i = 1; i < numEstudiantes; i++) {
if (calificaciones[i] < calificacionMinima) {
calificacionMinima = calificaciones[i];
}
if (calificaciones[i] > calificacionMaxima) {
calificacionMaxima = calificaciones[i];
}
}
System.out.println("Calificación mínima: " + calificacionMinima);
System.out.println("Calificación máxima: " + calificacionMaxima);
// Búsqueda de calificación
System.out.print("Ingrese el número de estudiante a buscar: ");
int numEstudianteBuscar = scanner.nextInt();
boolean encontrado = false;
for (int i = 0; i < numEstudiantes; i++) {
if (i + 1 == numEstudianteBuscar) {

System.out.println("Calificación del estudiante " + numEstudianteBuscar + ": " + calificaciones[i]);
encontrado = true;
break;
}
}
if (!encontrado) {
System.out.println("Estudiante no encontrado.");
}
// Ordenar calificaciones
for (int i = 0; i < numEstudiantes - 1; i++) {
for (int j = 0; j < numEstudiantes - i - 1; j++) {
if (calificaciones[j] > calificaciones[j + 1]) {
// Intercambiar elementos si están en el orden incorrecto
double temp = calificaciones[j];
calificaciones[j] = calificaciones[j + 1];
calificaciones[j + 1] = temp;
}
}
}
// Mostrar calificaciones ordenadas
System.out.print("Calificaciones ordenadas: ");
for (int i = 0; i < numEstudiantes; i++) {
System.out.print(calificaciones[i] + " ");
}
}
}