/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
El programa deberá después mostrar el resultado de la suma
 */
package javaintro_g7_ej1;

import java.util.Scanner;

public class JavaIntro_g7_ej1 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        leer.useDelimiter("\n");
        
        System.out.println("Ingresa dos números enteros, uno por uno, para calcular la suma:");
        
        int n1 = leer.nextInt();
        int n2 = leer.nextInt();
        int n3 = n1 + n2;
        
        System.out.println("La suma de " + n1 + " y " + n2 + " es: " + n3 + ".");
        
    }
    
}
