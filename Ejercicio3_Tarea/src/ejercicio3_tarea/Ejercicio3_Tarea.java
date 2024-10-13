package ejercicio3_tarea;

import java.util.*;

/**
 *
 * @author Juan Carlos
 */
public class Ejercicio3_Tarea {
    
    public static void main(String[] args) {
        // Decalaramos las variables
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int mayor = 0;
        // Imprimimos por pantalla para solicitar los datos al usuario
        System.out.println("OBTENER EL NÜMERO MAYOR DEL CONJUNTO DE TRES DADO");
        System.out.println("Por favor, introduzca el primer número: ");
        // Leemos primer número
        num1 = sc.nextInt();
        System.out.println("Por favor, introduzca el segundo número: ");
        // Leemos el segundo número
        num2 = sc.nextInt();
        System.out.println("Por favor, introduzca el tercer número: ");
        // Leemos el tercer número
        num3 = sc.nextInt();
        
        // Realizamos las comparaciones
        
        // Primer camino, donde num1 es mayor que num 2
        if(num1 > num2){
            if(num1 > num3){
                mayor = num1;
            }else{
                mayor = num3;
            }          
        // Segundo camino, donde num2 es mayor que num1
        }else if(num2 > num3){
            mayor = num2;
        }else{
            mayor = num3;
        }
        
        System.out.println("El número mayor entre esos tres es: " + mayor);
       
    }
}
