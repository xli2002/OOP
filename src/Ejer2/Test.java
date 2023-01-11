package Ejer2;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime la cantidad de passwords: ");
        int size = sc.nextInt();
        System.out.print("Dime la longitud de los passwords: ");
        int length = sc.nextInt();

        Password[] passwords = new Password[size];
        boolean[] isStrong = new boolean[size];

        for (int i = 0; i < size; i++) {
            passwords[i] = new Password(length);
            isStrong[i] = passwords[i].esFuerte();
        }

        for (int i = 0; i < size; i++) {
            String strong = isStrong[i] ? "esFuerte" : "esDebil";
            System.out.println(strong + " -> " + passwords[i].getPassword());
        }
    }
}
