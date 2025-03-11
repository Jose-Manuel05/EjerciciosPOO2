package org.example.NivelBasico.Vectores_Matrices;

import java.util.Arrays;

public class Alan_Smithee {
    static java.util.Scanner teclado;

    public static void casoDePrueba() {
        String frase1 = teclado.nextLine().toLowerCase().replaceAll(" ", "");
        String frase2 = teclado.nextLine().toLowerCase().replaceAll(" ", "");

        if (anagrama(frase1, frase2)) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean anagrama(String frase1, String frase2) {
        char[] char1 = frase1.toCharArray();
        char[] char2 = frase2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);

        return Arrays.equals(char1, char2);
    }

    public static void main(String[] args) {
        teclado = new java.util.Scanner(System.in);
        int numCasos = Integer.parseInt(teclado.nextLine());

        for (int i = 0; i < numCasos; i++) {
            casoDePrueba();
        }
    }
}