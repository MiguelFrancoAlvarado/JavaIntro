/*
Dada una cantidad de grados centígrados,
se debe mostrar su equivalente en grados Fahrenheit. 
La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */

import java.util.Scanner;

public class javaIntro_g7_ej4 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        leer.useDelimiter("\n");
        
        System.out.println("Ingresa una temperatura en °C, para convertirla a °F:");
        
        double tempC = leer.nextDouble();
        double tempF;
        
        tempF = 32 + (9 * (tempC/5));
        
        System.out.println("La temperatura " + tempC + "°C es igual a " + tempF + "°F.");
        
    }
    
}
