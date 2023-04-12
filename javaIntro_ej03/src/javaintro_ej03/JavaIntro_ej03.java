/*
 Define variables donde puedas alojar los resultados,
y prueba usar dos operadores de cada tipo.
 */
package javaintro_ej03;

/**
 *
 * @author franc
 */
public class JavaIntro_ej03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = -64;
        int num2 = 48;
        int num3 = 47;
        int suma = num1 + num2;
        int residuo = -(num1 % num2);
        num2--;
        boolean operando = residuo > num2;
        boolean decremento = num2 != num3;
        System.out.println(decremento);
        System.out.println(residuo);
    }
    
}
