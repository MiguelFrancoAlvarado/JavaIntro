/*
Matriz M de 10x10 y la matriz P de 3x3. Comprobar si P está contenida dentro de M. 
Para ello se debe verificar si entre todas las submatrices de 3x3 que se pueden formar en M, 
desplazándose por filas o columnas, existe al menos una que coincida con P.
En ese caso, el programa debe indicar la fila y la columna en la cual empieza el primer elemento de P.
 */

import java.util.Random;
import java.util.Scanner;

public class javaIntro_g7_ej21 {

    public static void main(String[] args) {

        int [] [] M = new int [10] [10];
        int [] [] P = new int [3] [3];
        
        System.out.println("Se generarán dos matrices: una (M) de 10x10, y otra (P) de 3x3.");
        System.out.println("Ambas matrices se llenarán de números aleatorios entre 0 y 99.");
        System.out.println("El programa buscará si los valores completos y ordenados de P");
        System.out.println("se encuentran dentro de M.");
        System.out.println("Para iniciar, primero hay que llenar una por una las matrices:");
        System.out.println("");
        
        menu (M, P);
        
    }
    
    public static void menu(int [] [] M, int [] [] P){
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Selecciona la opción deseada:");
        System.out.println("1: M (10x10)");
        System.out.println("2: P (3x3)");
        System.out.println("3: Imprimir y comparar las matrices.");
        System.out.println("4: Salir.");
        
        int opc = leer.nextInt();
        
        while (opc < 1 || opc > 4){
            
            System.out.println("La opción ingresada no es válida. Intenta de nuevo:");
            opc = leer.nextInt();
            
        }
        
        switch (opc) {
            case 1:
                valoresM (M, P);
                break;
            case 2:
                valoresP (M, P);
                break;
            case 3:
                System.out.println("");
                System.out.println("Para acceder a esta opción, primero debes haber llenado las matrices M y P.");
                System.out.println("¿Deseas continuar?");
                System.out.println("1: Sí.");
                System.out.println("2: No.");
                int confirm = leer.nextInt();
                while (confirm < 1 || confirm > 2) {
                    System.out.println("La opción ingresada no es válida. Intenta de nuevo:");
                    confirm = leer.nextInt();
                }
                if (confirm == 1){
                imprimir (M, P);
                } else {
                    menu (M, P);
                }
                break;
             case 4:
                 System.out.println("");
                 System.out.println("Adiós.");
                 System.out.println("");
                 break;
    }
    }
    
    
    public static void valoresM(int [] [] M, int [] [] P) {
        
        Random random = new Random();
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                
                M [i] [j] = random.nextInt(100);
                
            }
        }
        
        System.out.println("");
        System.out.println("La matriz M ha sido llenada con números aleatorios.");
        System.out.println("");
        
         for (int k = 0; k < 10; k++) {
            for (int l = 0; l < 10; l++) {
                
                System.out.print("[" + M [k] [l] + "] ");
                
            }
            System.out.println("");
        }
         System.out.println("");
        
        menu (M, P);
        
    }
    
    public static void valoresP(int [] [] M, int [] [] P) {
        
        Random random = new Random();
        
          for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                P [i] [j] = random.nextInt(100);
                
            }
        }
        
        System.out.println("");
        System.out.println("La matriz P ha sido llenada con números aleatorios.");
        System.out.println("");
        
        for (int k = 0; k < 3; k++) {
            for (int l = 0; l < 3; l++) {
                
                System.out.print("[" + P [k] [l] + "] ");
                
            }
            System.out.println("");
        }
         System.out.println("");
          
          menu (M, P);
        
    }
    
    public static void imprimir(int [] [] M, int [] [] P) {
        
        System.out.println("");
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                
                System.out.print("[" + M [i] [j] + "] ");
                
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        for (int k = 0; k < 3; k++) {
            for (int l = 0; l < 3; l++) {
                
                System.out.print("[" + P [k] [l] + "] ");
                
            }
            System.out.println(""); 
        }
        
        System.out.println("");
        
        calculo (M, P);
        
    }
    
    public static void calculo (int [] [] M, int [] [] P) {
        
        int cont = 0;
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                
                if (M [i] [j] == P [0] [0]) {
                    if (M [i] [j+1] == P [0] [1]) {
                        if (M [i] [j+2] == P [0] [2]) {
                            if (M [i+1] [j] == P [1] [0]) {
                                if (M [i+1] [j+1] == P [1][1]) {
                                    if (M [i+1] [j+2] == P [1] [2]) {
                                        if (M [i+2] [j] == P [2] [0]) {
                                            if (M [i+2] [j+1] == P [2] [1]){
                                                if (M [i+2] [j+2] == P [2] [2]){
                                                    
                                                    System.out.println("");
                                                    System.out.println("La matriz P sí se encuentra dentro de la matriz M.");
                                                    System.out.println("Inicia en el punto: " + i + ", " + j + ".");
                                                    System.out.println("");
                                                    cont += 1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                
            }
        }
        
        if (cont == 0) {
           
            System.out.println("");
            System.out.println("La matriz P no se encontró dentro de la matriz M.");
            System.out.println("");
            
        }
        
        menu (M, P);
        
    }
    
}

