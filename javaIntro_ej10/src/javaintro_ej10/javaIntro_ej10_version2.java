/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) 
 e imprima el número ingresado, seguido de tantos asteriscos según su valor.
 */
package javaintro_ej10;

import java.util.Scanner;

public class javaIntro_ej10_version2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa 4 números enteros, uno por uno,"
                + "que estén dentro del rango de 1 a 20:");

        int n1 = leer.nextInt();
        while (n1 < 1 || n1 > 20) {
            System.out.println("El número ingresado está fuera del rango.");
            System.out.println("Ingresa otro:");
            n1 = leer.nextInt();
        }
        
        int n2 = leer.nextInt();
        while (n2 < 1 || n2 > 20) {
            System.out.println("El número ingresado está fuera del rango.");
            System.out.println("Ingresa otro:");
            n2 = leer.nextInt();
        }
        
        int n3 = leer.nextInt();
        while (n3 < 1 || n3 > 20) {
            System.out.println("El número ingresado está fuera del rango.");
            System.out.println("Ingresa otro:");
            n3 = leer.nextInt();
        }
        
        int n4 = leer.nextInt();
        while (n4 < 1 || n4 > 20) {
            System.out.println("El número ingresado está fuera del rango.");
            System.out.println("Ingresa otro:");
            n4 = leer.nextInt();
        }
        
        for (int i = 1; i <= 4; i++) {
            
            switch (i){
                case 1:
                    System.out.print(n1 + " ");
                    for (int j = 1; j <= n1; j++) {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                    break;
                    
                case 2:
                    System.out.print(n2 + " ");
                    for (int k = 1; k <= n2; k++) {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                    break;
                    
                case 3:
                    System.out.print(n3 + " ");
                    for (int l = 1; l <= n3; l++) {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                    break;
                    
                case 4:
                    System.out.print(n4 + " ");
                    for (int m = 1; m <= n4; m++) {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                    break;
            }
            
        }

    }

}
