package org.example.NivelBasico.Vectores_Matrices;

public class Matricula {

    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        String[] matriculas = in.nextLine().split(" ");
        if (matriculas[0].equals("9999") && matriculas[1].equals("ZZZ"))
            return false;
        else {
            String numPart = matriculas[0];
            String letterPart = matriculas[1].toUpperCase();

            int numero = Integer.parseInt(numPart);
            numero++;

            if (numero > 9999) {
                numero = 0;
                letterPart = incrementarLetras(letterPart);
            }

            numPart = String.format("%04d", numero);

            System.out.println(numPart + " " + letterPart);
            return true;
        }
    }

    private static String incrementarLetras(String letras) {
        char[] chars = letras.toCharArray();
        int i = chars.length - 1;

        while (i >= 0) {
            if (chars[i] == 'Z') {
                chars[i] = 'B';
                i--;
            } else {
                chars[i]++;
                while (isVowelOrN(chars[i])) {
                    chars[i]++;
                    if (chars[i] > 'Z') {
                        chars[i] = 'B';
                    }
                }
                break;
            }
        }

        return new String(chars);
    }

    private static boolean isVowelOrN(char c) {
        return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'Ñ';
    }

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
            // Process cases
        }
    }
}