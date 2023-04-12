/*
Escribir un programa que lea un número entero por teclado
y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número.
 */

import java.util.Scanner;

public class javaIntro_g7_ej5 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        leer.useDelimiter("\n");
        
        System.out.println("Ingresa un número entero positivo, para conocer su doble, triple y raíz cuadrada:");
        int n = leer.nextInt();
        while (n<1) {
            System.out.println("El número ingresado no cumple con los parámetros. Ingresa otro:");
            n = leer.nextInt();
        }
        
        double raiz = Math.sqrt(n);
        
        System.out.println("");
        
        System.out.println("El doble del número " + n + " es igual a: " + n*2 + ".");
        
        System.out.println("El triple del número " + n + " es igual a: " + n*3 + ".");
        
        System.out.println("La raíz cuadrada del número " + n + " es igual a: " + raiz);
        
    }
    
}
