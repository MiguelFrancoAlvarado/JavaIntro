
import java.util.Scanner;

/*Este programa solicita al usuario su nombre, 
ingresado por teclado,
para darle un saludo personalizado.
Utiliza la variable Scanner, para el ingreso por teclado (System.in)(es leer en PSeInt);
y luego utiliza System.out.println ("print line")(escribir en PSeInt).
*/

/**
 *
 * @author franc
 */
public class hola_mundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se crea una variable Scanner que se utiliza para leer datos del usuario
        Scanner leer = new Scanner(System.in);
        //Se crea una variable cadena (String)que se utiliza para leer datos del usuario
        String nombre;
        //Muestra un mensaje por pantalla
        System.out.println("Ingresa tu nombre:");
        //Leemos el nombre del usuario en la variable "nombre"
        nombre = leer.next();
        //Mostramos por consola un saludo personalizado
        System.out.println("¡Hola, mundo; soy " + nombre + " y estoy programando en Java");
    }
    
}
