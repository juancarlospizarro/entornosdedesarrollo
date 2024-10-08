package ejercicio6_tarea;
import java.util.*;

/**
 *
 * @author Juan Carlos
 */
public class Ejercicio6_Tarea {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int suma = 0;
        int i;
        System.out.println("SUMA RANGO N");
        // Solicitamos el número al usuario
        System.out.println("Por favor, introduzca el número: ");
        n = sc.nextInt();
        // Sumamos todos los números desde 1 hasta el número y acumulamos la suma en la variable suma
        for(i = 1; i < n; i++){
            suma = suma + i;
        }
        // Imprimimos por pantalla el resultado
        System.out.println("La suma de los números entre 1 y N es " + suma + ".");
    }
    
}
