package org.example.NivelBasico.Vectores_Matrices;

public class Mejor_Imposible {

    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        int n = in.nextInt();
        if (n == 0)
            return false;
        else {

            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int x2 = in.nextInt();
            int y2 = in.nextInt();

            int dx;
            if (x2 >= x1) {
                dx = x2 - x1;
            } else {
                dx = x1 - x2;
            }

            int dy;
            if (y2 >= y1) {
                dy = y2 - y1;
            } else {
                dy = y1 - y2;
            }

            if (dx == 0 && dy == 0) {
                System.out.println(0);
            } else if (dx == dy) {
                System.out.println(1);
            } else {
                int suma = dx + dy;
                if ((suma / 2) * 2 == suma) {
                    System.out.println(2);
                } else {
                    System.out.println("IMPOSIBLE");
                }
            }
            return true;
        }
    }
        public static void main (String[]args){
            in = new java.util.Scanner(System.in);
            while (casoDePrueba()) {
            }
        }



}
