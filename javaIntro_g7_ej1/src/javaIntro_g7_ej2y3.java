/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
Escribir un programa que pida una frase y la muestre toda en mayúsculas,
y después toda en minúsculas.
 */

import java.util.Scanner;

public class javaIntro_g7_ej2y3 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        leer.useDelimiter("\n");
        
        System.out.println("Ingresa tu nombre completo:");
        
        String nombre = leer.next();
        
        System.out.println("Tu nombre es " + nombre + ".");
        
        System.out.println("Ingresa una frase para imprimirla en mayúsculas y minúsculas:");
        
        String frase = leer.next();
        
        System.out.println("La frase en minúsculas es: " + frase.toLowerCase());
        
        System.out.println("Y la frase en mayúsculas es: " + frase.toUpperCase());
        
    }
    
}
