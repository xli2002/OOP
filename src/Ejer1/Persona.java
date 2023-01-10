package Ejer1;

import java.util.Random;

/**
 * @author Xinyu Li
 * @version 1.0
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
     * Contructor de Persona
     */
    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sexo = Sexo.No;
        generaDNI();
    }

    /**
     * Otro contructor de Persona
     */

    public Persona(String nombre, String apellidos, int edad, String DNI, Sexo sexo, double peso, double altura) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    /**
     * Método para calcular el IMC
     * @return Devuelve el IMC
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
    }

    /**
     * Método para comprobar si es mayor de edad
     * @return Devuelve edad
     */

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    /**
     * Método toString
     * @return Devuelve el tostring
     */

    public String toString() {
        return nombre + " " + apellidos + ", Edad: " + edad + ", DNI: " + DNI + ", Sexo: " + sexo + ", Peso: " + peso + "kg y Altura: " + altura + "m";
    }

    /**
     * Método para generar el DNI
     */

    private void generaDNI() {
        Random random = new Random();
        String numDNI = String.format("%08d", random.nextInt(100000000));
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int modulo = Integer.parseInt(numDNI) % 23;
        DNI = numDNI + letras.charAt(modulo);
    }

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
}