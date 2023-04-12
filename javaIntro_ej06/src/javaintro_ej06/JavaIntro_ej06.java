/*
Implementar un programa que le pida dos números enteros al usuario,
y determine si ambos o alguno de ellos es mayor a 25.
 */
package javaintro_ej06;

import java.util.Scanner;

public class JavaIntro_ej06 {

    public static void main(String[] args) {
        
     Scanner leer = new Scanner(System.in);
     
     int num1;
     
     int num2;
     
        System.out.println("Ingresa dos números enteros, uno por uno:");
        
        num1 = leer.nextInt();
        
        num2 = leer.nextInt();    
     
        if (num1 > 25 && num2 > 25){
            
        System.out.println("Ambos números, " + num1 + " y " + num2 + ", son mayores que 25.");
        
        } else if (num1 > 25 || num2 > 25) {
        
            if (num1 > 25) {
                
                System.out.println("El número " + num1 + " es mayor que 25.");
                
            } else if (num2 > 25) {
                        
                        System.out.println("El número " + num2 + " es mayor que 25.");
                        
                        }
            
        } else {
            
            System.out.println("Ni " + num1 + " ni " + num2 + " son mayores que 25.");
        }
    
    }
    
}
