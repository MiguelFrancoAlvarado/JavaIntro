/*
Escribir un programa que procese una secuencia de caracteres terminada en punto, 
y luego la codifique: 
a=@, e=#, i=$, 0=%, u=*.
Realice un subprograma que reciba una secuencia de caracteres, 
y retorne la codificación correspondiente.
 */
package javaintro_ej11;

import java.util.Scanner;

public class JavaIntro_ej11 {

    public static void main(String[] args) {
        leerFrase();
    }
    
    public static void leerFrase() {
        
        Scanner leer = new Scanner (System.in);
        leer.useDelimiter("\n");
        String frase;
        int repeat;
        
        System.out.println("Ingresa una frase para codificarla.");
        System.out.println("La frase debe terminar en punto.");
        
        frase = leer.nextLine();
        int n = frase.length();
        boolean punto = frase.endsWith(".");
        
        while (punto == false){
            
            System.out.println("La frase ingresada no termina en punto.");
            System.out.println("Intenta de nuevo:");
            frase = leer.nextLine();
            punto = frase.endsWith(".");
            n = frase.length();
            
        }
        
        frase = frase.toLowerCase();
        
        String frase1 = codificar(frase,n);
        
        System.out.println("La frase codificada es:");
        System.out.println(frase1);
        
        System.out.println("¿Deseas codificar otra frase?");
        System.out.println("1: Sí.");
        System.out.println("2: No.");
        
        repeat = leer.nextInt();
        while (repeat<0 || repeat>2){
            System.out.println("La opción ingresada no es válida. Ingresa otra:");
            repeat = leer.nextInt();
        }
        
        if (repeat == 1) {
            leerFrase();
        } else {
            System.out.println("Adiós.");
        }

    }
    
    public static String codificar(String frase, int n) {
        
        String frase1 = frase;
        char letra;
        frase = "";
        
        for (int i = 0; i <= n-1; i++) {
            
            letra = frase1.charAt(i);
            
            switch (letra) {
                case 'a': 
                    frase = frase + "@";
                    break;
                case 'e':
                    frase = frase + "#";
                    break;
                case 'i':
                    frase = frase + "$";
                    break;
                case 'o':
                    frase = frase + "%";
                    break;
                case 'u':
                    frase = frase + "*";
                    break;
                default:
                    frase = frase + letra;

            }
            
        }
        
        return frase;
        
    }
   
}