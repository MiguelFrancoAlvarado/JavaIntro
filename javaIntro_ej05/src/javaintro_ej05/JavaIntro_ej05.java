/*
 Define una variable de tipo boolean, double y char. 
Guarda información en ellas a través del Scanner.
 */
package javaintro_ej05;

import java.util.Scanner;

public class JavaIntro_ej05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        boolean leerFalso;
        double decimal;
        char letra;
        System.out.println("Ingresa la palabra ''true'' o ''false'':");
        leerFalso = leer.nextBoolean();
        System.out.println("Ingresa un número real.");
        decimal = leer.nextDouble();
        System.out.println("Ingresa una letra.");
        letra = leer.next().charAt(0);
        System.out.println("El veredicto ingresado es: " + leerFalso);
        System.out.println("El número ingresado es: " + decimal);
        System.out.println("La letra ingresada es: " + letra);
    }
    
}
