package org.example.EjerciciosTeoria.Enum.Pelis;

import java.util.Arrays;
import java.util.Scanner;

public class AppPelis {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        SagaPelis peli = SagaPelis.SHREK;
        System.out.println(peli);

        for (SagaPelis pelis : SagaPelis.values()) {

            System.out.println("Peli: " + pelis + " con " + pelis.getNumPelis() + " pelis en tototal.");

        }

        System.out.println("Introduce el nombre de una saga " + Arrays.toString(SagaPelis.values()));
        String saga = sc.next().toUpperCase();

        SagaPelis saga_enum = SagaPelis.valueOf(saga);

        System.out.println("La saga escogida es " + saga_enum + " con " + saga_enum.getNumPelis() + " pelis en total.");

        //posicion de la saga
        int posicion = saga_enum.ordinal();
        System.out.println("La saga consultada esta en la posicion " + posicion);

        //Mostrar nombre como string
        String saga_name = SagaPelis.CREPUSCULO.name();
        System.out.println("El nombre de la saga es " + saga_name);



    }



}
