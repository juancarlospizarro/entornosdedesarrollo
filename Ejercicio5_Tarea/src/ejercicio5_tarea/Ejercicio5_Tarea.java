package ejercicio5_tarea;
import java.util.*;

/**
 *
 * @author Juan Carlos
 */
public class Ejercicio5_Tarea {

    public static void main(String[] args) {
        // Instanciamos las variables
        Scanner sc = new Scanner(System.in);
        int edad;
        // Solicitamos los datos al usuario
        System.out.println("INDICAR LA ETAPA DE LA VIDA EN LA QUE SE ENCUENTRA LA EDAD INDICADA");
        System.out.println("Por favor, introduzca la edad: ");
        edad = sc.nextInt();
        // Valoramos la edad y devolvemos por pantalla la etapa correspondiente
        if (edad < 12){
            System.out.println("La persona es Infante.");
        }else if(edad >= 12 && edad <= 17){
            System.out.println("La persona es Adolescente.");
        }else if(edad >= 18 && edad <= 60){
            System.out.println("La persona es Adulto");
        }else{
            System.out.println("La persona es Anciano");
        }
    }
    
}
