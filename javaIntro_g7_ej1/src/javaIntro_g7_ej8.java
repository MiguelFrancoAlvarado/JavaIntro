/*
Realizar un programa que sólo permita introducir frases o palabras de 8 de largo. 
Si el usuario lo hace correctamente, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
caso contrario, se deberá imprimir “INCORRECTO”.
 */

import java.util.Scanner;

public class javaIntro_g7_ej8 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        leer.useDelimiter("\n");
        
        System.out.println("Ingresa una palabra o frase de 8 caractere.");
        System.out.println("Considera que los signos y la puntuación también cuentan:");
        
        String frase = leer.next();
        
        if (frase.length() == 8) {
            System.out.println("Correcto. La frase ingresada tiene 8 caracteres.");
        } else {
            System.out.println("Incorrecto. La frase ingresada no tiene 8 caracteres exactos.");
        }
        
    }
    
}
