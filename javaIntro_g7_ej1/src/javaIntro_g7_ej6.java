/*
Crear un programa que dado un numero determine si es par o impar.
 */

import java.util.Scanner;

public class javaIntro_g7_ej6 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        leer.useDelimiter("\n");
        
        System.out.println("Ingresa un número entero para saber si es par o impar:");
        int n = leer.nextInt();
        
        if (n % 2 == 0){
            System.out.println("El número " + n + " es par.");
        } else {
            System.out.println("El número " + n + " es impar.");
        }
        
    }
    
}
