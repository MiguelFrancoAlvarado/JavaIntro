/*
Escriba un programa que valide si una nota está entre 0 y 10, 
si no está entre 0 y 10, se pedirá de nuevo hasta que la nota sea correcta.
 */
package javaintro_ej08;

import java.util.Scanner;

public class JavaIntro_ej08 {

    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa la calificación obtenida:");
        
        int nota = leer.nextInt();
        
        while (nota > 10 || nota < 0){
            
            System.out.println("La nota ingresada no es válida.");
            System.out.println("Ingresa una nota comprendida entre 0 y 10.");
            
            nota = leer.nextInt();
            
        }
        
    }
    
}
