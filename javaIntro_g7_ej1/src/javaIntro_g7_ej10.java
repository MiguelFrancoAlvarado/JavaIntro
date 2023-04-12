/*
Escriba un programa en el cual se ingrese un valor límite positivo, 
a continuación, solicite números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */

import java.util.Scanner;

public class javaIntro_g7_ej10 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingresa un número que funcionara como límite positivo.");
        System.out.println("Debe ser un número entero positivo:");
        
        int limit = leer.nextInt();
        int n = 0;
        
        System.out.println("Ingresa números, uno por uno, hasta que la suma de ellos supere el límite:");
        
        do {
            n += leer.nextInt();
        } while (n <= limit);
        
        System.out.println("Has superado el límite de " + limit + " con una sumatoria de " + n + ".");
    }
    
}
