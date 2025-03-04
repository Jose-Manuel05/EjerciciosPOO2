package org.example.NivelBasico;

import java.util.Scanner;

public class esKaprekar {
    static java.util.Scanner in;
    public static boolean casoDePrueba() {
        int num = in.nextInt();
        if (num == 0) {
            return false;
        }else {
            int cuadrado = num * num;
            String cuadradoStr = Integer.toString(cuadrado);
            int digitos = cuadradoStr.length() / 2;
            int parte1 = Integer.parseInt(cuadradoStr.substring(0, digitos));
            int parte2 = Integer.parseInt(cuadradoStr.substring(digitos));
            if (parte1 + parte2 == num)
                System.out.println("SI");
            else
                System.out.println("NO");

            return true;
        }
    }
    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }
}
