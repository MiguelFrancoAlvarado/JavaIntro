/*
Escriba un programa que lea 20 números. 
Si el número leído es igual a cero se debe salir del bucle y mostrar el mensaje "Se capturó el número cero". 
El programa deberá calcular y mostrar el resultado de la suma de los números leídos, 
pero si el número es negativo no debe sumarse. 
Nota: recordar el uso de la sentencia break.
 */
package javaintro_ej09;

import java.util.Scanner;

public class JavaIntro_ej09 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int num;
        int cont = 0;
        int sum = 0;

        System.out.println("Empecemos la cacería del número oculto.");
        System.out.println("Ingresa números enteros del 0 al 30.");
        System.out.println("Ganarás al encontrar el número oculto y obtendrás un puntaje.");
        System.out.println("A menor puntaje, mejor cazador fuiste.");
        System.out.println("Para empezar, ingresa uno por uno tus intentos:");

        do {

            num = leer.nextInt();

            while (num > 30) {

                System.out.println("El número ingresado es mayor que 30.");
                System.out.println("Ingresa otro:");

                num = leer.nextInt();

            }

            if (num == 0) {

                System.out.println("Se capturó el número oculto.");
                System.out.println("Tu puntaje es: " + sum + ".");

                break;
            }

            if (num > 0) {

                sum = sum + num;

            } else {

                sum = sum;
                
            }

            cont = cont++;

        } while (cont <= 20);

        if (cont == 20) {

            System.out.println("Excediste los intentos permitidos.");
            System.out.println("Tu puntaje es de: " + sum + ".");

        }

    }

}
