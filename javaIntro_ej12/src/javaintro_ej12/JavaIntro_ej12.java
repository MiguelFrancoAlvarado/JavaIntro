/*
Crea un procedimiento esMultiplo que reciba dos números pasados por el usuario, 
validando que el primer numero sea múltiplo del segundo,
e imprima si es así, si no, que informe que no lo son.
 */
package javaintro_ej12;

import java.util.Scanner;

public class JavaIntro_ej12 {

    public static void main(String[] args) {
        
        int n1 = 0;
        int n2 = 0;
        
        System.out.println("Para saber si dos números son múltiplos, "
                + "tendrás que ingresarlos a continuación:"); 
        System.out.println(" ");
        
        leerNs(n1, n2); 
        
    }
    
    public static void leerNs(int n1, int n2){
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingresa los dos números, uno por uno, "
                + "para saber si el primero es múltiplo del segundo, "
                + "recuerda que deben ser enteros positivos:");
        
        n1 = leer.nextInt();
        while (n1<1){
            System.out.println("El número ingresado no es válido "
                    + "para el cálculo. Ingresa otro:");
            n1 = leer.nextInt();
        }
        
        n2 = leer.nextInt();
        while (n2<1){
            System.out.println("El número ingresado no es válido "
                    + "para el cálculo. Ingresa otro:");
            n2 = leer.nextInt();
        }
        
        multiplo(n1, n2);
        
    }
    
    public static void multiplo(int n1, int n2){
        
        Scanner leer = new Scanner (System.in);
        int repeat;
        
        if (n1%n2 != 0){
            
            System.out.println(" ");
            System.out.println("El número " + n1 + " no es múltiplo "
                    + "de " + n2 + ".");
            System.out.println(" ");
            
        } else {
            
            System.out.println(" ");
            System.out.println("El número " + n1 + " sí es múltiplo "
                    + "de " + n2 + ".");
            System.out.println(" ");
            
        }
       
        System.out.println("¿Deseas realizar un nuevo cálculo?");
        System.out.println("1: Sí.");
        System.out.println("2: No.");
        
        repeat = leer.nextInt();
        while (repeat > 2 || repeat < 1){
            System.out.println("La opción ingresada no es válida."
                    + "Intenta de nuevo.");
            repeat = leer.nextInt();
        }
        
        if (repeat == 1){
            
            System.out.println(" ");
            leerNs(n1, n2);
            
        } else {
            
            System.out.println(" ");
            System.out.println("Adiós.");
            
        }
        
    }
    
}





/*
public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        EsMultiplo(num1,num2);
    }
    public static void EsMultiplo(int num1,int num2){
        if (num1%num2==0){
            System.out.println("El primer numero es multiplo del segundo");
        } else {
            System.out.println("El primer numero no es multiplo del segundo");
        }
        }
*/