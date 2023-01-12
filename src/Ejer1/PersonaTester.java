package Ejer1;

import java.util.Scanner;

/**
 * Clase para probar la clase (@link Persona).
 * Crea una serie de objetos Persona y utiliza sus métodos para imprimir información sobre ellos.
 *
 * @author Xinyu Li
 * @version 11/01/23
 */

public class PersonaTester {
    /**
     * Método principal que ejecuta la prueba de la clase Persona.
     * Crea un arreglo de objetos Persona y utiliza un ciclo para pedir input del usuario y llenar el arreglo.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona[] personas = new Persona[6];
        boolean conDNI;
        for (int i = 0; i < personas.length; i++) {
            System.out.println("¿Tiene DNI la persona " + (i + 1) + "? (s/n)");
            conDNI = sc.nextLine().equalsIgnoreCase("s");
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Apellidos: ");
            String apellidos = sc.nextLine();
            System.out.print("Edad: ");
            int edad = Integer.parseInt(sc.nextLine());
            if (conDNI) {
                System.out.print("DNI: ");
                String DNI = sc.nextLine();
                System.out.print("Sexo (Hombre/Mujer/No): ");
                Persona.Sexo sexo = Persona.Sexo.valueOf(sc.nextLine());
                System.out.print("Peso (kilogramo): ");
                double peso = Double.parseDouble(sc.nextLine());
                System.out.print("Altura (metros): ");
                double altura = Double.parseDouble(sc.nextLine());
                personas[i] = new Persona(nombre, apellidos, edad, DNI, sexo, peso, altura);
            } else {
                personas[i] = new Persona(nombre, apellidos, edad);
            }
        }

        for (Persona persona : personas) {
            int imc = persona.calcularIMC();
            String estadoIMC;
            switch (imc) {
                case -1:
                    estadoIMC = "bajo peso";
                    break;
                case 0:
                    estadoIMC = "un peso ideal";
                    break;
                case 1:
                    estadoIMC = "sobrepeso";
                    break;
                default:
                    estadoIMC = "obesidad";
            }

            /**
             * Se imprime información sobre la persona actual en el ciclo.
             * Utiliza el método toString() de la clase Persona para imprimir información general.
             * Los métodos getNombre() y getApellidos() para imprimir el nombre completo.
             * El método calcularIMC() para determinar el estado de peso.
             * El método esMayorDeEdad() para determinar si es mayor o menor de edad.
             */

            System.out.println("La persona: " + persona);
            System.out.println("La persona " + persona.getNombre() + " " + persona.getApellidos() + " tiene " + estadoIMC + ".");
            System.out.println("La persona " + persona.getNombre() + " " + persona.getApellidos() + (persona.esMayorDeEdad() ? " es mayor de edad." : " es menor de edad."));
            System.out.println();
        }
    }
}
