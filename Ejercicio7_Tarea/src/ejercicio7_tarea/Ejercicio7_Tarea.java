package ejercicio7_tarea;
import java.util.*;
/**
 *
 * @author Juan Carlos
 */
public class Ejercicio7_Tarea {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int número;
        int mul;
        System.out.println("CALCULAR TABLA DE MULTIPLICAR");
        // Solicitamos al usuario un número entre 1 y 10
        System.out.println("Por favor, introduzca el número entre 1 y 10: ");
        número = sc.nextInt();
        // Comprobamos que el número sea válido
        while(número < 1 || número > 10){
            System.err.println("Número fuera de rango.");
            System.out.println("Por favor, introduzca un número valido (entre 1 y 10): ");
            número = sc.nextInt();
        }
        
        // Calculamos y devolvemos por pantalla el resultado de cada multiplicación del número por cada número entre 0 y 10
        for(int i = 0; i <= 10; i++){
            mul = número * i;
            System.out.println(número + " x " + i + " = " + mul);
        }
    }
    
}
