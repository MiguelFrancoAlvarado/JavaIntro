/*
Crea un vector llamado ‘Equipo’, 
cuya dimensión sea la cantidad de compañeros de equipo,
y define su tipo de dato de tal manera que te permita alojar sus nombres.
 */
package javaintro_ej13;

import java.util.Scanner;

public class JavaIntro_ej13 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        leer.useDelimiter("\n");
        
        System.out.println("Ingresa el número de integrantes del equipo 10:");
        
        int n = leer.nextInt();
        System.out.println("");
        
        String[] equipo = new String[n];
        
        System.out.println("Ingresa, uno por uno, los nombres de los"
                + " integrantes del equipo 10:");
        
        for (int i = 0; n > i; i++) {
            
            equipo[i] = leer.next();
            
        }
        
        System.out.println("");
        
        for (int j = 0; n > j; j++) {
            
            System.out.println(equipo[j]);
            
        }
        
    }
    
}
