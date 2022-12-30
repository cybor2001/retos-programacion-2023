package reto0;

/***
 * Escribe un programa que muestre por consola (con un print) los
 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
 * cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 *
 * @author CetagaDev
 */

public class ctagadev {
    public static void main(String[] args) {
        int i;

        for (i=1; i<=100; i++) {
            if (i%3==0 && i%5==0) {
                System.out.print("fizzbuzz\n");
            } else if (i%3==0) {
                System.out.print("fizz\n");
            } else if (i%5==0) {
                System.out.print("buzz\n");
            } else {
                System.out.print(i + "\n");
            }
        }
    }
}
