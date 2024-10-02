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
        System.out.println("Por favor, introduzca el número entre 1 y 10: ");
        número = sc.nextInt();
        while(número < 1 || número > 10){
            System.err.println("Número fuera de rango.");
            System.out.println("Por favor, introduzca un número valido (entre 1 y 10): ");
            número = sc.nextInt();
        }
        
        for(int i = 0; i <= 10; i++){
            mul = número * i;
            System.out.println(número + " x " + i + " = " + mul);
        }
    }
    
}
