/*
Estás desarrollando una web para una empresa de motores para mover fluidos. 
Definir una variable tipoMotor, el usuario ingresará un valor entre 1 y 4:
1: “La bomba es una bomba de agua”.
2: “La bomba es una bomba de gasolina”.
3: “La bomba es una bomba de hormigón”.
4: “La bomba es una bomba de pasta alimenticia”.
default: "No existe un valor válido para tipo de bomba."
 */
package javaintro_ej07;

import java.util.Scanner;

public class JavaIntro_ej07 {

    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);        
        int opt;
        
        System.out.println("Bienvenido al Mundo del Motor.");
        System.out.println(" ");
        System.out.println("Ingresa el número de bomba, escrito en su exterior,"
                + " para identificar de qué tipo es:");
        
        opt = leer.nextInt();
        
        switch (opt) {
            case 1:
                System.out.println("La bomba es de agua.");
                break;
            case 2:
                System.out.println("La bomba es de gasolina.");
                break;
            case 3:
                System.out.println("La bomba es de hormigón.");
                break;
            case 4:
                System.out.println("La bomba es de pasta alimenticia.");
            default:
                System.out.println("La respuesta ingresada no es válida "
                        + "para los tipos de bomba.");
        }
            
    }
    
}
