package Ejer1;

import java.util.Random;

/**
 * Clase, para almacenar información sobre una persona.
 * Permite calcular el IMC y determinar si es mayor de edad.
 *
 * @author Xinyu Li
 * @version 11/01/23
 */

public class Persona {

    private String nombre;
    private String apellidos;
    private int edad;
    private String DNI;
    public enum Sexo {Hombre, Mujer, No}
    private Sexo sexo;
    private double peso;
    private double altura;

    /**
     * Constructor de Persona sin DNI.
     * Permite crear una persona con solo el nombre, apellidos y edad.
     * Genera un DNI aleatorio para la persona.
     *
     * @param nombre    define el nombre de persona
     * @param apellidos define el apellido de persona
     * @param edad      define la edad de persona
     */
    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sexo = Sexo.No;
        generaDNI();
    }//cierre de constructor

    /**
     * Constructor de Persona con DNI.
     * Permite crear una persona con nueva persona con nombre, apellidos, edad, DNI, sexo, peso y altura.
     *
     * @param nombre    define el nombre de persona
     * @param apellidos define el apellido de persona
     * @param edad      define la edad de persona
     * @param DNI       define el DNI de persona
     * @param sexo      define el sexo de persona
     * @param peso      define el peso de persona
     * @param altura    define la altura de persona
     */
    public Persona(String nombre, String apellidos, int edad, String DNI, Sexo sexo, double peso, double altura) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }//cierre de constructor

    /**
     * Método para calcular el IMC.
     * Utiliza el peso y altura de la persona para calcular el IMC.
     * Devuelve -1 si tiene bajo peso, 0 si tiene un peso ideal, 1 si tiene sobre peso y 2 si está en obesidad.
     *
     * @return El estado del IMC.
     */
    public int calcularIMC() {
        double imc = peso / (altura * altura);
        if (imc < 18.5) {
            return -1;
        } else if (imc >= 18.5 && imc <= 24.99) {
            return 0;
        } else if (imc >= 25 && imc <= 29.99) {
            return 1;
        } else {
            return 2;
        }
    }//cierre de método

    /**
     * Método para comprobar si es mayor de edad.
     *
     * @return Si es mayor de edad te va un true y si es menor un false.
     */

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    /**
     * Método toString.
     *
     * @return Devuelve en forma de cadena la clase persona.
     */

    public String toString() {
        return nombre + " " + apellidos + ", Edad: " + edad + ", DNI: " + DNI + ", Sexo: " +
                sexo + ", Peso: " + peso + "kg y Altura: " + altura + "m";
    }//cierre de método

    /**
     * Método para generar el DNI de forma aleatoria.
     */

    private void generaDNI() {
        Random random = new Random();
        String numDNI = String.format("%08d", random.nextInt(100000000));
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int modulo = Integer.parseInt(numDNI) % 23;
        DNI = numDNI + letras.charAt(modulo);
    }//cierre de método

    /**
     * Métodos setters y getters.
     */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}//cierre de la clase