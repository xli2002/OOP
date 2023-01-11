package Ejer2;
import java.util.Random;

/**
 * @author Xinyu Li
 * @version 1.0
 */
public class Password {
    private static final int defecto = 10;
    private int longitud;
    private String password;

    /**
     * Constructor por defecto
     */
    public Password() {
        this.longitud = defecto;
        this.generarPassword();
    }

    /**
     * Constructor con longitud específica
     * @param longitud Devuelve la longitud
     */
    public Password(int longitud) {
        this.longitud = longitud;
        this.generarPassword();
    }

    /**
     * Método que determina si la contraseña es fuerte
     * @return Devuelve una contraseña fuerte
     */
    public boolean esFuerte() {
        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;

        for (int i = 0; i < password.length(); i++) {
            char caracter = password.charAt(i);

            if (Character.isUpperCase(caracter)) {
                mayusculas++;
            } else if (Character.isLowerCase(caracter)) {
                minusculas++;
            } else if (Character.isDigit(caracter)) {
                numeros++;
            }
        }
        return mayusculas > 2 && minusculas > 1 && numeros > 4;
    }

    /**
     *  Método para generar la contraseña
     */
    public void generarPassword() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < this.longitud; i++) {
            char caracter = (char)(random.nextInt(94) + 33);
            sb.append(caracter);
        }
        this.password = sb.toString();
    }

    public int getLongitud() {
        return longitud;
    }
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    public String getPassword() {
        return password;
    }
}