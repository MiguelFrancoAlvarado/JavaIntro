/*
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’. 
Si es así, se deberá imprimir un mensaje que diga “CORRECTO”, 
caso contrario, se deberá imprimir “INCORRECTO”.
 */

import java.util.Scanner;

public class javaIntro_g7_ej9 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        leer.useDelimiter("\n");
        
        System.out.println("Ingresa una frase o palabra.");
        System.out.println("Intenta adivinar la letra oculta, usándola al inicio de tu respuesta:");
        
        String frase = leer.next();
        frase = frase.toLowerCase();
        
        if (frase.startsWith("a")) {
            System.out.println("Correcto. La letra oculta es la ''A''.");
        } else {
            System.out.println("Incorrecto. La letra oculta era la ''A''.");
        }
        
    }
    
}
