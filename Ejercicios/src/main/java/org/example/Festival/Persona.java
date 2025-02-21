package org.example.Festival;

public class Persona {

    public static final String rojo = "\u001B[31m";
    public static final String reset = "\u001B[0m";

    private static final int EDAD_MINIMA = 18;

    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        setEdad(edad);
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public void accederEvento() {
        System.out.println("Accediendo al evento");
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
        if (edad < EDAD_MINIMA) {
            this.edad = edad;
            throw new edadMinimaException(rojo + "La edad mínima para acceder al evento es de " + EDAD_MINIMA + " años" + reset);
        }

    }
}
