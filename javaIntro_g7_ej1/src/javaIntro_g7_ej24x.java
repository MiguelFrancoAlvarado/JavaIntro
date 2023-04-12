/*
Realizar un programa que complete un vector con los N primeros números de la sucesión de Fibonacci,
donde cada uno de los números se calcula sumando los dos anteriores a él:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Si queremos calcular el término “n”, debemos escribir una función que reciba como parámetro el valor de “n”, 
y que calcule la serie hasta llegar a ese valor
 */

import java.util.Scanner;

public class javaIntro_g7_ej24x {

    public static void main(String[] args) {
        
        int [] vector = new int [999999];
        int n = 0;
        
        System.out.println("La sucesión de Fibonacci es una sucesión infinita de números naturales, ");
        System.out.println("en la que cada número se obtiene a partir de la suma de los dos números anteriores, ");
        System.out.println("siendo 0 y 1 los primeros dos números de la sucesíón.");
        
        valorN(vector, n);
        
    }
    
    public static void valorN(int [] vector, int n) {
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("");
        System.out.println("Para mostrar los ''n'' primeros números de la sucesión, ingresa un número:");
        
        n = leer.nextInt();
        while (n<1 || n>99){
            
            System.out.println("El número ingresado no es válido. Debe ser un número mayor que 0, y, "
                    + "por memoria, menor que 100");
            n = leer.nextInt();
        }
        
        vectorFillPrint (vector, n);
        
    }
    
    public static void vectorFillPrint (int [] vector, int n){
       
        Scanner leer = new Scanner (System.in);
        
        for (int i = 0; i < n; i++) {
            
            if (i<2) {
                vector [i] = i;  
            } else {
                vector [i] = vector [i-1] + vector [i-2];
            }
            
        }
        
        System.out.println("");
        System.out.println("Los primeros " + n + " números de la sucesión de Fibonacci son:");
        System.out.println("");
        
        for (int j = 0; j < n; j++) {
            
            if (j>8 && (j%9)==0) {
                System.out.println(" [" + vector [j] + "]");
            } else {
            System.out.print(" [" + vector [j] + "]");
            }
        }
        
        System.out.println("");
        System.out.println("");
        System.out.println("¿Deseas ingresar un nuevo número?");
        System.out.println("1: Sí.");
        System.out.println("2: No.");
        
        int repeat = leer.nextInt();
        while (repeat<1 || repeat>2) {
            System.out.println("La opción ingresada no es válida. intenta de nuevo:");
            repeat = leer.nextInt();
        }
        if (repeat==1){
            valorN(vector, n);
        } else {
            System.out.println("");
            System.out.println("Adiós.");
        }
        
    }
    
}