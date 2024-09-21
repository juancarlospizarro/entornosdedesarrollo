package ejercicio2_tarea;

import java.util.*;

/**
 *
 * @author Juan Carlos
 */
public class Ejercicio2_Tarea {

    public static void main(String[] args) {
        // Declaramos las variables
        Scanner sc = new Scanner(System.in);
        double distancia;
        double velocidad;
        double tiempo;
        // Imprimimos por pantalla para solicitar los datos al usuario
        System.out.println("CALCULAR TIEMPO PROMEDIO DADA UNA DISTANCIA Y VELOCIDAD");
        System.out.println("Por favor, introduzca la distancia (km): ");
        // Leemos la distancia
        distancia = sc.nextDouble();
        System.out.println("Por favor, introduzca la velocidad (km/h): ");
        // Leemos la velocidad
        velocidad = sc.nextDouble();
        // Calculamos el tiempo
        tiempo = distancia / velocidad;
        // Imprimimos por pantalla el resultado
        System.out.println("El tiempo que tomará el trayecto es: " + tiempo + " horas.");
    }
    
}
