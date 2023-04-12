/*
Realizar un programa que pida dos números enteros positivos y muestre un menú:
1. Sumar. 2. Restar. 3. Multiplicar. 4. Dividr. 5. Salir. Elija una opción:
El usuario deberá elegir una opción, el programa deberá mostrar el resultado por pantalla y luego volver al menú, 
hasta que se elija la opción 5, pero, en vez de salir del programa directamente, se debe mostrar:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, 
caso contrario se vuelve a mostrar el menú.
 */

import java.util.Scanner;

public class javaIntro_g7_ej11 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        leer.useDelimiter("\n");
        String salida;
        int opcion;
        
        System.out.println("Ingresa dos números enteros positivos, uno por uno,"
                + " para acceder con ellos al menú de operaciones aritméticas:");
         
         int n1 = leer.nextInt();
         while (n1 < 1) {
             System.out.println("El número ingresado no cumple con los parámetros. Prueba de nuevo:");
             n1 = leer.nextInt();
         }
         
                  int n2 = leer.nextInt();
         while (n2 < 1) {
             System.out.println("El número ingresado no cumple con los parámetros. Prueba de nuevo:");
             n2 = leer.nextInt();
         }
        
         do {
             System.out.println("");
             System.out.println("Menú de operaciones.");
             System.out.println("");
             System.out.println("Elije una opción:");
             System.out.println("");
             System.out.println("1: Sumar.");
             System.out.println("2: Restar.");
             System.out.println("3: Multiplicar.");
             System.out.println("4: Dividir.");
             System.out.println("5: Salir.");
             System.out.println("");
             
             opcion = leer.nextInt();
             
             switch (opcion) {
                  case 1: 
                     System.out.println("La suma de " + n1 + " y " + n2 + " es igual a: " + (n1 + n2) + ".");
                     salida = "n";
                     break;
                  case 2: 
                      System.out.println("La resta de " + n1 + " menos " + n2 + " es igual a: " + (n1 - n2) + ".");
                     salida = "n";
                     break;
                  case 3:
                      System.out.println("La multiplicación de " + n1 + " por " + n2 + " es igual a: " + (n1 * n2) + ".");
                     salida = "n";
                     break;
                  case 4:
                      System.out.println("La división de " + n1 + " entre " + n2 + " es igual a: " + (n1 / n2) + ".");
                     salida = "n";
                     break;
                  case 5: 
                      System.out.println("");
                      System.out.println("¿Confirmas querer salir del programa?");
                      System.out.println("S: sí.");
                      System.out.println("N: No.");
                      salida = leer.next();
                      boolean si = salida.equalsIgnoreCase("s");
                      boolean no = salida.equalsIgnoreCase("n");
                      while (si == false && no == false) {
                          System.out.println("");
                          System.out.println("La opción ingresada no es válida. Intenta de nuevo.");
                          System.out.println("S: sí.");
                          System.out.println("N: no.");
                          salida = leer.next();
                          si = salida.equalsIgnoreCase("s");
                          no = salida.equalsIgnoreCase("n");
                      }
                      break;
                  default:
                      System.out.println("La opción ingresada no es válida. Intenta de nuevo.");
                      salida = "n";
             }
         } while (salida.equalsIgnoreCase("n"));
        
    }
    
}
