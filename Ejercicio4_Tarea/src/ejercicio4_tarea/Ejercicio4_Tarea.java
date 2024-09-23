package ejercicio4_tarea;

import java.util.*;

/**
 *
 * @author Juan Carlos
 */
public class Ejercicio4_Tarea {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int número;
        String día;
        String[] dias_semana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingos"};
        System.out.println("OBTENER EL NOMBRE DEL DÍA DE LA SEMANA");
        System.out.println("Por favor, introduzca el número: ");
        número = sc.nextInt();
        while(número < 0 || número > 7){
            System.err.println("Error, número introducido no válido. Debe ser entre 1 y 7.");
            System.out.println("Introduzca un número válido: ");
            número = sc.nextInt();
        }
        día = dias_semana[número-1];
        if(número == 1){
            System.out.println("El día de la semana es " + día + ".");
        }else if(número == 2){
            System.out.println("El día de la semana es " + día + ".");
        }else if(número == 3){
            System.out.println("El día de la semana es " + día + ".");
        }else if(número == 4){
            System.out.println("El día de la semana es " + día + ".");
        }else if(número == 5){
            System.out.println("El día de la semana es " + día + ".");
        }else if(número == 6){
            System.out.println("El día de la semana es " + día + ".");
        }else{
            
            System.out.println("El día de la semana es " + día + ".");
        }
    }
    
}
