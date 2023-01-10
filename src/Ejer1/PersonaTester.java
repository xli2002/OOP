package Ejer1;

import java.util.Scanner;

public class PersonaTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona[] personas = new Persona[2];
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
                System.out.print("Peso (kg): ");
                double peso = Double.parseDouble(sc.nextLine());
                System.out.print("Altura (m): ");
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

            System.out.println("La persona: " + persona);
            System.out.println("La persona " + persona.getNombre() + " " + persona.getApellidos() + " tiene " + estadoIMC + ".");
            System.out.println("La persona " + persona.getNombre() + " " + persona.getApellidos() + (persona.esMayorDeEdad() ? " es mayor de edad." : " es menor de edad."));
            System.out.println();
        }
    }
}
