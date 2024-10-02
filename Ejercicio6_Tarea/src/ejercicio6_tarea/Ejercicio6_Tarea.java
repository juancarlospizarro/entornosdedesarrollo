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
        System.out.println("Por favor, introduzca el número: ");
        n = sc.nextInt();
        for(i = 1; i < n; i++){
            suma = suma + i;
        }
        System.out.println("La suma de los números entre 1 y N es " + suma + ".");
    }
    
}
