package Ejer2;

import java.util.Scanner;

/**
 * Clase Test
 *
 * @author Xinyu Li
 * @version 11/01/23
 */

public class Test {
    /**
     * Método main que ejecuta la aplicación.
     * @param args Argumentos pasados por consola al ejecutar la aplicación.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime la cantidad de passwords: ");
        int size = sc.nextInt();
        System.out.print("Dime la longitud de los passwords: ");
        int length = sc.nextInt();

        Password[] passwords = new Password[size];
        boolean[] isStrong = new boolean[size];
        // Crea un arreglo de passwords y determina si cada uno es fuerte o débil.
        for (int i = 0; i < size; i++) {
            passwords[i] = new Password(length);
            isStrong[i] = passwords[i].esFuerte();
        }
        // Imprime el resultado de cada password
        for (int i = 0; i < size; i++) {
            String strong = isStrong[i] ? "esFuerte" : "esDebil";
            System.out.println(strong + " -> " + passwords[i].getPassword());
        }
    }
}
