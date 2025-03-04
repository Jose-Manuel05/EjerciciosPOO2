package org.example.NivelBasico;

public class Me_Caso {
    static java.util.Scanner in;
    public static boolean casoDePrueba() {
        int num = in.nextInt();

        if (num == 0) {
            return false;
        } else {
            int suma = 0;
            for (int i = 0; i < num; i++) {
                suma += in.nextInt();
            }

            System.out.println(suma);
            return true;
        }
    }

    public static void main (String[]args){
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }
}