package org.example.EjerciciosTeoria.Enum.Execpciones;

public class Main_Excepciones {

    public static void main(String[] args) throws Nivel_Valido_Exception {

        int nivel = 150;

//        try {
//            if (nivel > 100) {
//                throw new Nivel_Valido_Exception();
//            }
//        } catch (Nivel_Valido_Exception e) {
//            System.out.println(e.getMessage());
//        }

        if (nivel > 100) {
            throw new Nivel_Valido_Exception();
        }

    }

}
