package Ejer2;
import java.util.Random;

/**
 * Clase para generar contraseñas de forma aleatoria.
 * Permite especificar la longitud de la contraseña y determinar si es una contraseña fuerte.
 *
 * @author Xinyu Li
 * @version 11/01/23
 */
public class Password {
    private static final int defecto = 10;
    private int longitud;
    private String password;

    /**
     * Constructor por defecto.
     * Crea una contraseña de longitud predeterminada.
     */
    public Password() {
        this.longitud = defecto;
        this.generarPassword();
    }//cierre de constructor

    /**
     * Constructor con longitud específica
     * @param longitud Longitud deseada para la contraseña.
     */
    public Password(int longitud) {
        this.longitud = longitud;
        this.generarPassword();
    }//cierre de constructor

    /**
     * Método que determina si la contraseña es fuerte.
     * Una contraseña es considerada fuerte si tiene al menos 2 mayúsculas, 1 minúscula y 4 números.
     *
     * @return Devuelve una contraseña fuerte, si una débil.
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
    }//cierre de método

    /**
     * Método para generar una contraseña de forma aleatoria.
     * Utiliza un objeto de la clase Random para generar caracteres aleatorios y construir la contraseña.
     */
    public void generarPassword() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < this.longitud; i++) {
            char caracter = (char)(random.nextInt(94) + 33);
            sb.append(caracter);
        }
        this.password = sb.toString();
    }//cierre de método

    /**
     * Metodos getter y setters
     */

    public int getLongitud() {
        return longitud;
    }
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    public String getPassword() {
        return password;
    }
}//cierre de clase