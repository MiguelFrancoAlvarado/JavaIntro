/*
Crear un programa que pida una frase, 
y si esa frase es igual a “eureka” el programa pondrá un mensaje de Correcto, 
sino mostrará un mensaje de Incorrecto.
 */

import java.util.Scanner;

public class javaIntro_g7_ej7 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        leer.useDelimiter("\n");
        
        System.out.println("Encuentra la palabra oculta.");
        System.out.println("Pista: Famosa palabra que fue dicha tras el descubrimiento "
                + "del ''Principio de Arquímedes''.");
        
        String frase = leer.next();
        
        if (frase.equalsIgnoreCase("eureka")) {
            System.out.println("¡Correcto! Encontraste la palabra oculta.");
        } else {
            System.out.println("Incorrecto. La palabra oculta es: ''Eureka''.");
        }
        
    }
    
}
