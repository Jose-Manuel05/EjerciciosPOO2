package org.example.NivelBasico;

public class La_Fiesta_Aburrida {
    static java.util.Scanner in;


    public static void casoDePrueba() {
        String soy = in.next();
        String nombre = in.next();
        System.out.println("Hola, " + nombre + ".");
    }
    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();

    }
}