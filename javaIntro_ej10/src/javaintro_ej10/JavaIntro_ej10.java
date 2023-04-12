/*
 Realizar un programa que lea 4 números (comprendidos entre 1 y 20) 
 e imprima el número ingresado, seguido de tantos asteriscos según su valor.
 */
package javaintro_ej10;

import java.util.Scanner;

public class JavaIntro_ej10 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int n;

        System.out.println("Ingresa 4 números enteros, uno por uno,"
                + "que estén dentro del rango de 1 a 20:");

        for (int i = 0; i <= 3; i++) {

            n = leer.nextInt();
            while (n < 1 || n > 20) {

                System.out.println("El número ingresado está fuera del rango.");
                System.out.println("Ingresa otro:");

                n = leer.nextInt();

            }

            System.out.print(n + " ");
            for (int j = 1; j <= n; j++) {

                System.out.print("*");

            }
            System.out.println(" ");

        }

    }

}
